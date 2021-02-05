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



public class CouponCodeTest extends BuildUp{

	public WebDriver driver;
	@BeforeTest
	void initDriver() throws IOException
	{
		driver=BuildUp.webDriverInit();
	}
	
	@Test
	public void verifyCouponCode()
	{
		driver.get("http://live.demoguru99.com/");
		HomePageObjects hp = new HomePageObjects(driver);
		hp.getMobile().click();
		
		MobilePageObjects mp = new MobilePageObjects(driver);
		mp.getIphoneCart().click();
		
		CartPageObjects cp = new CartPageObjects(driver);
		cp.getCoupon().sendKeys("GURU50");
		cp.getCouponApply().click();
		String price=cp.getDiscount().getText();		
		Assert.assertEquals(price, "-$25.00");		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	
}
