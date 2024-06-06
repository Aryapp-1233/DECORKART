package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPageDecorKart 
{
	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"shopify-section-header\"]/store-header/div[1]/div/div/div/a")
	WebElement cart;
	@FindBy(xpath = "//*[@id=\"shopify-section-template--16650374512812__main\"]/section/div/div[2]/form/div[2]/safe-sticky/div/button/span[1]")
	WebElement securecheckout;
	
	public CartPageDecorKart(WebDriver driver)
	{
		this.driver=driver;
		System.out.println(driver);
        PageFactory.initElements(driver, this);
	}
    public void cartitems()
    {
    	cart.click();
    }
    public void checkout()
    {
    	securecheckout.click();
    	
    }
}
