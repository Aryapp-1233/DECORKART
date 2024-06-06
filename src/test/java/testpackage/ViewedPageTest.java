package testpackage;

import org.testng.annotations.Test;

import baseclass.BaseClassDecorKart;
import pagepackage.ViewedPageDecorKart;

public class ViewedPageTest extends BaseClassDecorKart
{
	@Test
	public void viewtest() throws Exception
	{
		ViewedPageDecorKart vtest=new ViewedPageDecorKart(driver);
		vtest.viewed();
	}

}
