package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutDecorKart
{
	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"shopify-section-header\"]/store-header/div[1]/div/div/div/span/a")
	WebElement myaccount;
	
	//@FindBy(xpath = "//*[@id=\"account-option\"]/li[2]/a")
//	WebElement account;
	
	@FindBy(xpath = "//*[@id=\"shopify-section-template--16650376478892__main\"]/section/div[1]/div/div/ul/li[3]/a")
	WebElement loggingout;
	
	public LogoutDecorKart(WebDriver driver)
	{
		this.driver=driver;
		System.out.print(driver);
		PageFactory.initElements(driver,this);
	}
	
	public void accountdetails()
	{
		myaccount.click();
	}
    public void logout()
    {
    	loggingout.click();
    }
}
