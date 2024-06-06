package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageDecorKart 
{
	
	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"customer[email]\"]")
	WebElement DKemail;
	
	@FindBy(xpath = "//*[@id=\"customer[password]\"]")
	WebElement DKpassword;
	
	@FindBy(xpath = "//*[@id=\"customer_login\"]/button/span[1]")
	WebElement DKloginbutton;
	
	public LoginPageDecorKart(WebDriver driver)
	{
		this.driver=driver;
		System.out.println(driver);
        PageFactory.initElements(driver, this);
	}
	public void setvalues(String email,String pswd)
	{
		DKemail.sendKeys(email);
		DKpassword.sendKeys(pswd);
	}
	public void dklogin()
	{
		DKloginbutton.click();
	}


}
