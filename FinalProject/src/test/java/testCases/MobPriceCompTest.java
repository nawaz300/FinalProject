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

import pageObjects.HomePageObjects;
import pageObjects.MobilePageObjects;
import pageObjects.SonyMobPageObjects;
import resources.BuildUp;



public class MobPriceCompTest extends BuildUp{

	public WebDriver driver;
	@BeforeTest
	void initDriver() throws IOException
	{
		driver=BuildUp.webDriverInit();
	}
	
	@Test
	public void verifyMobilePrice()
	{
		driver.get("http://live.demoguru99.com/");
		HomePageObjects hp = new HomePageObjects(driver);
		hp.getMobile().click();
		
		MobilePageObjects mp = new MobilePageObjects(driver);
		
		String sonymobval=mp.getPrice().getText();
		mp.getSonyPic().click();
		
		SonyMobPageObjects smp = new SonyMobPageObjects(driver);
		
		String sonymobval1=smp.getSonyPrice().getText();
		
		Assert.assertEquals(sonymobval, sonymobval1);	
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	
}
