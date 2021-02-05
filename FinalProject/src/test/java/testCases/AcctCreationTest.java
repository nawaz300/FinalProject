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
import pageObjects.CompPopUpPageObjects;
import pageObjects.HomePageObjects;
import pageObjects.LGWishlistPageObjects;
import pageObjects.MobilePageObjects;
import pageObjects.NewAccPageObjects;
import pageObjects.ShareWishlistPageObjects;
import pageObjects.SonyMobPageObjects;
import pageObjects.TVPageObjects;
import resources.BuildUp;



public class AcctCreationTest extends BuildUp{

	public WebDriver driver;
	@BeforeTest
	void initDriver() throws IOException
	{
		driver=BuildUp.webDriverInit();
	}
	
	@Test
	public void verifyAcctCreation()
	{
		driver.get("http://live.demoguru99.com/");
		HomePageObjects hp = new HomePageObjects(driver);
		hp.getAccount().click();
		hp.getRegister().click();
		
		NewAccPageObjects nap = new NewAccPageObjects(driver);		
		nap.getFirstName().sendKeys("Ben");
		nap.getLastName().sendKeys("Stokes");
		nap.getemail().sendKeys("azsadsqazx@mail.com");
		nap.getPswd().sendKeys("dummy123");
		nap.getConPswd().sendKeys("dummy123");
		nap.getSubmit().click();
		
		AcctDashboarPageObjects adp = new AcctDashboarPageObjects(driver);
		String text=adp.getAcctMsg().getText();
		Assert.assertEquals(text, "Thank you for registering with Main Website Store.");
		adp.getTV().click();
		
		TVPageObjects tv = new TVPageObjects(driver);
		tv.getLGWishlist().click();
		
		LGWishlistPageObjects lgw = new LGWishlistPageObjects(driver);
		lgw.getShareBtn().click();
		
		ShareWishlistPageObjects sw = new ShareWishlistPageObjects(driver);
		sw.getEmail().sendKeys("dmdd@mail.com");
		sw.getButton().click();
		String message=sw.getMsg().getText();
		Assert.assertEquals(message, "Your Wishlist has been shared.");
	}
	
		@AfterTest
		public void tearDown()
		{
			driver.quit();
		}
		

		
	
}
