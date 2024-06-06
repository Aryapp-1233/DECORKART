package testpackage;

import org.testng.annotations.Test;

import baseclass.BaseClassDecorKart;
import pagepackage.SearchPageDecorKart;

public class SearchPageTest extends BaseClassDecorKart
{
	@Test
	public void searh() throws Exception
	{
		SearchPageDecorKart stest=new SearchPageDecorKart(driver);
		stest.search();
		stest.addtocart();
		stest.product();
	}

}
