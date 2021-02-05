package testCases;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.AcctDashboarPageObjects;
import pageObjects.CartPageObjects;
import pageObjects.CheckOutPageObjects;
import pageObjects.CompPopUpPageObjects;
import pageObjects.HomePageObjects;
import pageObjects.LGWishlistPageObjects;
import pageObjects.LoginPageObjects;
import pageObjects.MobilePageObjects;
import pageObjects.NewAccPageObjects;
import pageObjects.ShareWishlistPageObjects;
import pageObjects.SonyMobPageObjects;
import pageObjects.TVPageObjects;
import resources.BuildUp;



public class PlaceOrderTest extends BuildUp{

	public WebDriver driver;
	@BeforeTest
	void initDriver() throws IOException
	{
		driver=BuildUp.webDriverInit();
	}
	
	@Test
	public void verifyOrderPlaced() throws InterruptedException
	{
		driver.get("http://live.demoguru99.com/");
		HomePageObjects hp = new HomePageObjects(driver);
		hp.getAccount().click();
		hp.getLogin().click();
		
		LoginPageObjects lp = new LoginPageObjects(driver);		
		lp.getEmail().sendKeys("azsadsqaz@mail.com");
		lp.getPswd().sendKeys("dummy123");
		lp.getLoginBtn().click();
		
		AcctDashboarPageObjects adp = new AcctDashboarPageObjects(driver);
		adp.getWishlistLink().click();	
		
		LGWishlistPageObjects lgw = new LGWishlistPageObjects(driver);
		lgw.getAddtoCart().click();
		
		CartPageObjects cp = new CartPageObjects(driver);
		Select obj1 = new Select(cp.getCountryDropdown());
		obj1.selectByVisibleText("United States");
		Select obj2 = new Select(cp.getStateDropdown());
		obj2.selectByVisibleText("New York");
		cp.getZIPCode().sendKeys("542892");
		cp.getEstimateBtn().click();
		cp.getFlatRate().click();
		String amt=cp.getRateAmt().getText();
		Assert.assertEquals(amt, "$5.00");
		cp.getUpdateTotal().click();
		String amttot=cp.getRateAmtTotal().getText();
		Assert.assertEquals(amttot, "$5.00");		
		cp.getCheckoutBtn().click();
		
		CheckOutPageObjects cop = new CheckOutPageObjects(driver);
		
		cop.getAddress().sendKeys("126");
		cop.getCity().sendKeys("New York");
		Select obj4 = new Select(cop.getStateDropdown());
		obj4.selectByVisibleText("New York");		
		cop.getZIPCode().sendKeys("542892");
		Select obj3 = new Select(cop.getCountryDropdown());
		obj3.selectByVisibleText("United States");
		cop.getPhoneNo().sendKeys("121212");
		
		cop.getContinueBtn1().click();
		cop.getContinueBtn2().click();
		cop.getMoney().click();
		cop.getContinueBtn3().click();
		cop.getOrderBtn().click();
		Thread.sleep(3000);
		String msg=cop.getOrderMsg().getText();
		Assert.assertEquals(msg, "YOUR ORDER HAS BEEN RECEIVED.");
			
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	
}
