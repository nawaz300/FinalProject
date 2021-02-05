package testCases;

import java.awt.AWTException;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.AcctDashboarPageObjects;
import pageObjects.HomePageObjects;
import pageObjects.LoginPageObjects;
import pageObjects.MyOrdersPageObjects;
import resources.BuildUp;



public class PrintOrderTest extends BuildUp{

	public WebDriver driver;
	@BeforeTest
	void initDriver() throws IOException
	{
		driver=BuildUp.webDriverInit();
	}

	@Test
	public void verifyPrintOrder() throws InterruptedException, AWTException, IOException
	{
		driver.get("http://live.demoguru99.com/");
		HomePageObjects hp = new HomePageObjects(driver);
		hp.getAccount().click();
		hp.getLogin().click();

		LoginPageObjects lp = new LoginPageObjects(driver);		
		lp.getEmail().sendKeys("azsadsqazx@mail.com");
		lp.getPswd().sendKeys("dummy123");
		lp.getLoginBtn().click();

		AcctDashboarPageObjects adp = new AcctDashboarPageObjects(driver);
		adp.getOrdersLink().click();	

		MyOrdersPageObjects mop = new MyOrdersPageObjects(driver);
		String prod=mop.getOrderProd().getText();
		Assert.assertEquals(prod, "LG LCD");
		String status=mop.getOrderStatus().getText();
		Assert.assertEquals(status, "Pending");
		mop.getViewOrder().click();		
		mop.getPrintOrder().click();


		driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
		Thread.sleep(8000);
		Runtime.getRuntime().exec("E:\\AutoIT Scripts\\FileDownloadScript");
		Thread.sleep(22000);
		File f=new File("C:\\Users\\elcot\\Desktop\\D100013565.pdf");
		System.out.println(f.exists());

	}

	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}

}
