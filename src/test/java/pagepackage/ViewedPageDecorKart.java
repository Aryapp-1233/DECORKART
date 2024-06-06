package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewedPageDecorKart 
{
	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"viewed_product_tdk\"]/img")
	WebElement vieweditems;
	
	public ViewedPageDecorKart(WebDriver driver)
	{
		this.driver=driver;
		System.out.println(driver);
        PageFactory.initElements(driver, this);
	}
	
	public void viewed()
	{
		vieweditems.click();
	}

}
