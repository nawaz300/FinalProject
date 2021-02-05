package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewAccPageObjects {

	public WebDriver driver;
	public NewAccPageObjects(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By firstname=By.cssSelector("#firstname");
	By lastname=By.cssSelector("#lastname");
	By email=By.cssSelector("#email_address");
	By pswd=By.cssSelector("#password");
	By conpswd=By.cssSelector("#confirmation");
	By submit=By.xpath("//button[@title='Register']");
	

	public WebElement getFirstName()
	{
		return driver.findElement(firstname);
	}
	public WebElement getLastName()
	{
		return driver.findElement(lastname);
	}
	public WebElement getemail()
	{
		return driver.findElement(email);
	}
	public WebElement getPswd()
	{
		return driver.findElement(pswd);
	}
	public WebElement getConPswd()
	{
		return driver.findElement(conpswd);
	}
	public WebElement getSubmit()
	{
		return driver.findElement(submit);
	}
}
