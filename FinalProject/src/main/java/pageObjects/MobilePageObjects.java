package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class MobilePageObjects {

	public WebDriver driver;
	public MobilePageObjects(WebDriver driver)
	{
		this.driver=driver;
	}
	By dropdownmenu=By.xpath("(//select[@onchange='setLocation(this.value)'])[1]");
	By products=By.xpath("//ul[@class='products-grid products-grid--max-4-col first last odd']/li/div/h2/a");
	By price=By.cssSelector("#product-price-1 > span");
	By sonypic=By.cssSelector("#product-collection-image-1");
	By sonycart=By.xpath("(//button[@class='button btn-cart'])[1]");
	By sonycomp=By.xpath("(//ul[@class='add-to-links']/li/a)[2]");
	By iphonecart=By.xpath("(//button[@class='button btn-cart'])[2]");
	By iphonecomp=By.xpath("(//ul[@class='add-to-links']/li/a)[4]");
	By compbtn=By.cssSelector("button[title='Compare']");
	

    
	public WebElement getDropdown()
	{	
		return driver.findElement(dropdownmenu);	
	}
	public List<WebElement> getProductsList()
	{	
		return driver.findElements(products);	
	}
	public WebElement getPrice()
	{	
		return driver.findElement(price);	
	}
	public WebElement getSonyPic()
	{	
		return driver.findElement(sonypic);	
	}
	public WebElement getSonyCart()
	{	
		return driver.findElement(sonycart);	
	}
	public WebElement getSonyComp()
	{	
		return driver.findElement(sonycomp);	
	}
	public WebElement getIphoneComp()
	{	
		return driver.findElement(iphonecomp);	
	}
	public WebElement getCompBtn()
	{	
		return driver.findElement(compbtn);	
	}
	public WebElement getIphoneCart()
	{	
		return driver.findElement(iphonecart);	
	}
	
}
