package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class SonyMobPageObjects {

	public WebDriver driver;
	public SonyMobPageObjects(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By sonyprice=By.cssSelector("span[class='price']");

    
	public WebElement getSonyPrice()
	{	
		return driver.findElement(sonyprice);	
	}
}
