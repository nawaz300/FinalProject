package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class CartPageObjects {

	public WebDriver driver;
	public CartPageObjects(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By sonyqty=By.cssSelector("input[title='Qty']");
	By sonyqtybtn=By.xpath("//button[@title='Update']");
	By errormsg=By.xpath("//span[contains(text(),'Some of the products')]");
	By emptycartbtn=By.cssSelector("#empty_cart_button > span:nth-child(1) > span");
	By emptycartmsg=By.xpath("//div[@class='cart-empty']//p[contains(text(),'You have no')]");
	By country=By.cssSelector("#country");
	By state=By.cssSelector("#region_id");
	By zipcode=By.cssSelector("#postcode");
	By checkoutbtn=By.cssSelector("button[title='Proceed to Checkout']");
	By estimatebtn=By.xpath("//span[contains(text(),'Estimate')]");
	By flatrate=By.xpath("//input[@id='s_method_flatrate_flatrate']");
	By rateamt=By.xpath("//label[contains(text(),'Fixed')]/span");
	By rateamttot=By.xpath("//td[@class='a-right']//span[@class='price'][normalize-space()='$5.00']");
	By updatetotal=By.cssSelector("button[title='Update Total']");
	By grandtotal=By.cssSelector("strong span[class='price']");
	By coupon=By.cssSelector("#coupon_code");
	By couponapply=By.cssSelector("button[title='Apply']");
	By discount=By.xpath("//span[normalize-space()='-$25.00']");
	
	

	public WebElement getSonyQty()
	{	
		return driver.findElement(sonyqty);	
	}
	public WebElement getSonyQtyBtn()
	{	
		return driver.findElement(sonyqtybtn);	
	}
	public WebElement getErrorMsg()
	{	
		return driver.findElement(errormsg);	
	}
	public WebElement getEmptyCartBtn()
	{	
		return driver.findElement(emptycartbtn);	
	}
	public WebElement getEmptyCartMsg()
	{	
		return driver.findElement(emptycartmsg);	
	}
	public WebElement getCheckoutBtn()
	{	
		return driver.findElement(checkoutbtn);	
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
	public WebElement getEstimateBtn()
	{	
		return driver.findElement(estimatebtn);	
	}
	public WebElement getFlatRate()
	{	
		return driver.findElement(flatrate);	
	}
	public WebElement getUpdateTotal()
	{	
		return driver.findElement(updatetotal);	
	}
	public WebElement getRateAmt()
	{	
		return driver.findElement(rateamt);	
	}
	public WebElement getRateAmtTotal()
	{	
		return driver.findElement(rateamttot);	
	}
	public WebElement getGrandTotal()
	{	
		return driver.findElement(grandtotal);	
	}
	public WebElement getCoupon()
	{	
		return driver.findElement(coupon);	
	}
	public WebElement getCouponApply()
	{	
		return driver.findElement(couponapply);	
	}
	public WebElement getDiscount()
	{	
		return driver.findElement(discount);	
	}
	
}
