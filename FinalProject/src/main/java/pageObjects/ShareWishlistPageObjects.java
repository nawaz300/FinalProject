package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class ShareWishlistPageObjects {

	public WebDriver driver;
	public ShareWishlistPageObjects(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By email=By.cssSelector("#email_address");
	By button=By.xpath("//button[@title='Share Wishlist']");
	By msg=By.cssSelector("li[class='success-msg'] ul li span");

	public WebElement getEmail()
	{	
		return driver.findElement(email);	
	}
	public WebElement getButton()
	{	
		return driver.findElement(button);	
	}
	public WebElement getMsg()
	{	
		return driver.findElement(msg);	
	}
	
}
