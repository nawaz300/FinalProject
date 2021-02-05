package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class TVPageObjects {

	public WebDriver driver;
	public TVPageObjects(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By lgwishlt=By.xpath("(//ul[@class='add-to-links']/li/a)[1]");

    
	public WebElement getLGWishlist()
	{	
		return driver.findElement(lgwishlt);	
	}
	
}
