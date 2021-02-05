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
import resources.BuildUp;



public class MobileListTest extends BuildUp{

	public WebDriver driver;
	@BeforeTest
	void initDriver() throws IOException
	{
		driver=BuildUp.webDriverInit();
	}
	
	@Test
	public void verifyMobilePage()
	{
		driver.get("http://live.demoguru99.com/");
		String title=driver.getTitle();
		Assert.assertEquals(title, "Home page");
		HomePageObjects hp = new HomePageObjects(driver);
		hp.getMobile().click();
		String mobtitle=driver.getTitle();
		Assert.assertEquals(mobtitle, "Mobile");
		MobilePageObjects mp = new MobilePageObjects(driver);
		Select obj1 = new Select(mp.getDropdown());
		obj1.selectByVisibleText("Name");
		ArrayList<String> obtainedList = new ArrayList<>(); 
		List<WebElement> list=mp.getProductsList();
		for(WebElement we:list){
			   obtainedList.add(we.getText());
			}
			ArrayList<String> sortedList = new ArrayList<>();   
			for(String s:obtainedList){
			sortedList.add(s);
			}
			Collections.sort(sortedList);
		//	Assert.assertTrue(sortedList.equals(obtainedList));
			Assert.assertTrue(sortedList.equals(obtainedList));
		//	System.out.println(sortedList);				
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	
}
