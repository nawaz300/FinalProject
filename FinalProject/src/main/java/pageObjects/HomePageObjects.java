package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObjects {

	public WebDriver driver;
	public HomePageObjects(WebDriver driver)
	{
		this.driver=driver;
	}
	By mobile=By.xpath("//a[normalize-space()='Mobile']");
	By account=By.cssSelector("a[class='skip-link skip-account']");
	By register=By.cssSelector("a[title='Register']");
	By login=By.cssSelector("a[title='Log In']");
	

	public WebElement getMobile()
	{
		return driver.findElement(mobile);
	}
	public WebElement getAccount()
	{
		return driver.findElement(account);
	}
	public WebElement getRegister()
	{
		return driver.findElement(register);
	}
	public WebElement getLogin()
	{
		return driver.findElement(login);
	}
}
