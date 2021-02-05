package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class MyOrdersPageObjects {

	public WebDriver driver;
	public MyOrdersPageObjects(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By vieworder=By.xpath("//a[contains(text(),'View Order')]");
	By printorder=By.cssSelector("a[class='link-print']");
	By orderprod=By.xpath("//p[@class='product-name']/a");
	By orderstatus=By.xpath("(//td[@class='status']/em)[1]");
	By reorder=By.cssSelector("a[class='link-reorder']");


    
	public WebElement getViewOrder()
	{	
		return driver.findElement(vieworder);	
	}
	public WebElement getPrintOrder()
	{	
		return driver.findElement(printorder);	
	}
	public WebElement getOrderProd()
	{	
		return driver.findElement(orderprod);	
	}
	public WebElement getOrderStatus()
	{	
		return driver.findElement(orderstatus);	
	}
	public WebElement getReOrder()
	{	
		return driver.findElement(reorder);	
	}
	
}
