package testCases;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.CartPageObjects;
import pageObjects.HomePageObjects;
import pageObjects.MobilePageObjects;
import pageObjects.SonyMobPageObjects;
import resources.BuildUp;



public class MobProdCartTest extends BuildUp{

	public WebDriver driver;
	@BeforeTest
	void initDriver() throws IOException
	{
		driver=BuildUp.webDriverInit();
	}
	
	@Test
	public void verifyMobileCart()
	{
		driver.get("http://live.demoguru99.com/");
		HomePageObjects hp = new HomePageObjects(driver);
		hp.getMobile().click();
		
		MobilePageObjects mp = new MobilePageObjects(driver);		
		mp.getSonyCart().click();
		
		CartPageObjects cp = new CartPageObjects(driver);
		cp.getSonyQty().click();
		cp.getSonyQty().sendKeys("1000");
		cp.getSonyQtyBtn().click();
		String errortext=cp.getErrorMsg().getText();	
		Assert.assertEquals(errortext, "Some of the products cannot be ordered in requested quantity.");
		cp.getEmptyCartBtn().click();
		String carttext=cp.getEmptyCartMsg().getText();
		Assert.assertEquals(carttext, "You have no items in your shopping cart.");				
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
}
