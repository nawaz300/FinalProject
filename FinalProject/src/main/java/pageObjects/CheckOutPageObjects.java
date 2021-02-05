package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class CheckOutPageObjects {

	public WebDriver driver;
	public CheckOutPageObjects(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By address=By.xpath("//input[@id='billing:street1']");
	By city=By.xpath("//input[@id='billing:city']");
	By state=By.xpath("//select[@id='billing:region_id']");
	By zipcode=By.xpath("//input[@id='billing:postcode']");
	By country=By.xpath("//select[@id='billing:country_id']");
	By phoneno=By.xpath("//input[@id='billing:telephone']");
	By continuebtn1=By.xpath("(//button[@type='button'])[1]");
	By continuebtn2=By.xpath("(//button[@type='button'])[3]");
	By money=By.xpath("//input[@id='p_method_checkmo']");
	By continuebtn3=By.xpath("(//button[@type='button'])[4]");
	By orderbtn=By.xpath("//button[@title='Place Order']");
	By ordermsg=By.xpath("//div[@class='page-title']/h1");
	
	

	public WebElement getAddress()
	{	
		return driver.findElement(address);	
	}
	public WebElement getCity()
	{	
		return driver.findElement(city);	
	}
	
	public WebElement getCountryDropdown()
	{	
		return driver.findElement(country);	
	}
	public WebElement getStateDropdown()
	{	
		return driver.findElement(state);	
	}
	public WebElement getZIPCode()
	{	
		return driver.findElement(zipcode);	
	}
	public WebElement getPhoneNo()
	{	
		return driver.findElement(phoneno);	
	}
	public WebElement getContinueBtn1()
	{	
		return driver.findElement(continuebtn1);	
	}
	public WebElement getContinueBtn2()
	{	
		return driver.findElement(continuebtn2);	
	}
	public WebElement getContinueBtn3()
	{	
		return driver.findElement(continuebtn3);	
	}
	public WebElement getMoney()
	{	
		return driver.findElement(money);	
	}
	public WebElement getOrderBtn()
	{	
		return driver.findElement(orderbtn);	
	}
	public WebElement getOrderMsg()
	{	
		return driver.findElement(ordermsg);	
	}
	
	
}
