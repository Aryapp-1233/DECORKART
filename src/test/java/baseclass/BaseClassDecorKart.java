package baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class BaseClassDecorKart 
{
	public static WebDriver driver;
	@BeforeTest
	public void setUp()
	{
		System.out.print("hai");
		driver=new ChromeDriver();
		driver.get("https://thedecorkart.com");
		System.out.println(driver);
	}	
}
