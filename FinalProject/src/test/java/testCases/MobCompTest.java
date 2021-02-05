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

import pageObjects.CompPopUpPageObjects;
import pageObjects.HomePageObjects;
import pageObjects.MobilePageObjects;
import pageObjects.SonyMobPageObjects;
import resources.BuildUp;



public class MobCompTest extends BuildUp{

	public WebDriver driver;
	@BeforeTest
	void initDriver() throws IOException
	{
		driver=BuildUp.webDriverInit();
	}
	
	@Test
	public void verifyMobileCompare()
	{
		driver.get("http://live.demoguru99.com/");
		HomePageObjects hp = new HomePageObjects(driver);
		hp.getMobile().click();
		
		MobilePageObjects mp = new MobilePageObjects(driver);		
		mp.getSonyComp().click();
		mp.getIphoneComp().click();
		mp.getCompBtn().click();
		
		 String MainWindow=driver.getWindowHandle();		
 		
	        // To handle all new opened window.				
	            Set<String> s1=driver.getWindowHandles();		
	        Iterator<String> i1=s1.iterator();		
	        		
	        while(i1.hasNext())			
	        {		
	            String ChildWindow=i1.next();		
	            		
	            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
	            {    		
	                 
	                    // Switching to Child window
	            	 driver.switchTo().window(ChildWindow);
	            	CompPopUpPageObjects cp=new CompPopUpPageObjects(driver);
	        		String sonyprod=cp.getSony().getText();
	        		Assert.assertEquals(sonyprod, "SONY XPERIA");
	        		String iphnprod=cp.getIphone().getText();				
	        		Assert.assertEquals(iphnprod, "IPHONE");
	        		cp.getCloseBtn().click();
	        			
	            }		
	        }	
	        driver.switchTo().window(MainWindow);			
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
}
