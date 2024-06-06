package pagepackage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPageDecorKart
{
	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"shopify-section-header\"]/store-header/div[2]/input")
	WebElement searchitem;
	
	@FindBy(xpath = "//*[@id=\"Huratips-Loop\"]/product-item[14]/div[1]/div[2]/div[2]/div[1]/div/div[1]/div/a/img")
	WebElement searcheditem;
	
	@FindBy(xpath = "//*[@id=\"product_form_template--16650375135404__main__7810231730348_0\"]/button[1]/span[1]")
	WebElement itemadd;
	
	
	public SearchPageDecorKart(WebDriver driver)
	{
		this.driver=driver;
		System.out.println(driver);
        PageFactory.initElements(driver, this);
	}
	public void search()
	{
		searchitem.sendKeys("lamps",Keys.ENTER);
	}
	public void product()
	{
		searcheditem.click();
	}
	public void addtocart()
	{
		itemadd.click();
	}

	
}
