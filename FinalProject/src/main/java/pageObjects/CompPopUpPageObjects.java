package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class CompPopUpPageObjects {

	public WebDriver driver;
	public CompPopUpPageObjects(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	By sony=By.xpath("//a[normalize-space()='Sony Xperia']");
	By iphone=By.xpath("//a[normalize-space()='IPhone']");
	By closebtn=By.xpath("//button[@title='Close Window']");
	

	public WebElement getSony()
	{	
		return driver.findElement(sony);	
	}
	public WebElement getIphone()
	{	
		return driver.findElement(iphone);	
	}
	public WebElement getCloseBtn()
	{	
		return driver.findElement(closebtn);	
	}
	
}
