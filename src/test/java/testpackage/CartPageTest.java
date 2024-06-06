package testpackage;

import org.testng.annotations.Test;

import baseclass.BaseClassDecorKart;
import pagepackage.CartPageDecorKart;

public class CartPageTest extends BaseClassDecorKart
{
	@Test
	public void carttest1() throws Exception
	{
		CartPageDecorKart cart =new CartPageDecorKart(driver);
		cart.cartitems();
		cart.checkout();

	}
		
	

}
