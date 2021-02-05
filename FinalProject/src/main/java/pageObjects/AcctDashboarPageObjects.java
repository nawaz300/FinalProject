package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AcctDashboarPageObjects {

	public WebDriver driver;
	public AcctDashboarPageObjects(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By acctmsg=By.cssSelector("li[class='success-msg'] ul li span");
	By tv=By.xpath("//a[normalize-space()='TV']");
	By wishlistlink=By.xpath("//a[normalize-space()='My Wishlist']");
	By myorderslink=By.xpath("//a[normalize-space()='My Orders']");
	

	public WebElement getAcctMsg()
	{
		return driver.findElement(acctmsg);
	}
	public WebElement getTV()
	{
		return driver.findElement(tv);
	}
	public WebElement getWishlistLink()
	{
		return driver.findElement(wishlistlink);
	}
	public WebElement getOrdersLink()
	{
		return driver.findElement(myorderslink);
	}
	
}
