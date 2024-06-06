package testpackage;

import org.testng.annotations.Test;
import baseclass.BaseClassDecorKart;
import pagepackage.LoginPageDecorKart;
import utiliesforsite.ExcelDetailsDecorKart;

public class LoginPageTest extends BaseClassDecorKart
{
	@Test
	public void logintest() throws Exception
	{
		System.out.print("test");
		LoginPageDecorKart lpdemo=new LoginPageDecorKart(driver);
		String xl="C:\\Users\\ARYA\\Downloads\\TheDecorKart.xlsx";
		String sheet="Decorkart";
		int rowcount=ExcelDetailsDecorKart.getrowcount(xl, sheet);
		for(int i=1;i<=rowcount;i++)
		{

	    	String username=ExcelDetailsDecorKart.getCellValue(xl, sheet,i,0);
	    	System.out.println("username is" +username);
	    	
	    	String password=ExcelDetailsDecorKart.getCellValue(xl, sheet,i, 1);
	    	System.out.println("password is" +password);
	    	
	    	lpdemo.setvalues(username, password);
	    	lpdemo.dklogin();
	    	
	    	String expectedurl="https://thedecorkart.com/";
	    	String actualurl=driver.getCurrentUrl();
	    	if(expectedurl.equalsIgnoreCase(actualurl))
	    	{
	           System.out.println("loged successfully"); 		
	   		}
	    	else 
	    	{
	    		System.out.println("login failed");
	    	}	
		}
	}
	

}
