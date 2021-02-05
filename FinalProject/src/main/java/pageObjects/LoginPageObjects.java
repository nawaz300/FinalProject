package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {

	public WebDriver driver;
	public LoginPageObjects(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By email=By.cssSelector("#email");
	By pswd=By.cssSelector("#pass");
	By loginbtn=By.cssSelector("#send2");

	public WebElement getEmail()
	{
		return driver.findElement(email);
	}
	public WebElement getPswd()
	{
		return driver.findElement(pswd);
	}
	public WebElement getLoginBtn()
	{
		return driver.findElement(loginbtn);
	}
	
}
