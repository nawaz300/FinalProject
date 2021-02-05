package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class LGWishlistPageObjects {

	public WebDriver driver;
	public LGWishlistPageObjects(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By sharebtn=By.xpath("//button[@title='Share Wishlist']");
	By addtocart=By.cssSelector("button[title='Add to Cart']");

    
	public WebElement getShareBtn()
	{	
		return driver.findElement(sharebtn);	
	}
	public WebElement getAddtoCart()
	{	
		return driver.findElement(addtocart);	
	}
	
}
