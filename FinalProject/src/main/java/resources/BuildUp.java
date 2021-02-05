package resources;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BuildUp 
{  
//	public static Properties OR =new Properties();
	public static String  screenShotName;
//	public static    FileInputStream fis;
	public static WebDriver driver;
	   public static WebDriver webDriverInit() throws IOException
	   {
		  String path=System.getProperty("user.dir");
		 Properties properties= new Properties();
		 FileInputStream object=new FileInputStream(path+"\\src\\main\\java\\resources\\browser.properties");
		properties.load(object);
		String browserName=properties.getProperty("browser");
		//String browserValue="chrome";
		   if(browserName.equalsIgnoreCase("chrome"))
		   { 
			   
//			   System.setProperty("webdriver.chrome.driver","chromedriver.exe");
//			   driver=new ChromeDriver();
			   ChromeOptions cOptions = new ChromeOptions();
		        cOptions.addArguments("kiosk-printing");
		   //     RemoteWebDriver driver = new RemoteWebDriver(hostUrl, cOptions);
			   WebDriverManager.chromedriver().setup();
			   driver=new ChromeDriver(cOptions);
		   }
		   else if(browserName.equals("firefox"))
			{
				System.setProperty("webdriver.gecko.driver","E:\\Drivers Selenium\\geckodriver.exe"); 
				 driver=new FirefoxDriver(); 
			}
			else if(browserName.equals("IE"))
			{
				System.setProperty("webdriver.ie.driver","E:\\Drivers Selenium\\iedriverserver.exe"); 
				driver=new InternetExplorerDriver();
			}
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   System.out.println("Inside Buildiup:"+driver);
		   return driver;
		   
}
	   
//	   public void testScreenshot(WebDriver driver) throws IOException
//	   {
//		  
//
//			Date d = new Date();
//			
//			String actualdate = d.toString();
//			screenShotName  = d.toString().replace(":","_").replace(" ", "_") + ".png";
//			
//			File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//			FileUtils.copyFile(srcfile,new File(System.getProperty("user.dir") + "\\target\\surefire-reports\\html\\"+screenShotName));
//
//
//	   }
		 
 	   
	   
	   
}