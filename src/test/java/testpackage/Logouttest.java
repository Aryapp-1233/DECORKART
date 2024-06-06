package testpackage;

import org.testng.annotations.Test;

import baseclass.BaseClassDecorKart;
import pagepackage.LogoutDecorKart;

public class Logouttest extends BaseClassDecorKart
{
	@Test
	public void logedout() throws Exception
	{
		LogoutDecorKart lout=new LogoutDecorKart(driver);
		lout.accountdetails();
		lout.logout();
	}

}
