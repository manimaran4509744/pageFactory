package testcasepkg1;

import org.testng.Assert;
import org.testng.annotations.*;

import sauceDemoPkg1.BaseClass;
import sauceDemoPkg2.AddToCartPageObjects;
import sauceDemoPkg2.CheckOutSuccessPageObjects;
import sauceDemoPkg2.CheckoutDetailsPageObjects;
import sauceDemoPkg2.HomePageObjects;
import sauceDemoPkg2.OverViewPageObjects;

public class TestCaseNew extends BaseClass {

	@Test(priority=1)
	public void toValidateSuccesspage() throws InterruptedException {
		HomePageObjects homepage = loginPage.clickLogin("standard_user", "secret_sauce");
		homepage.selectBackpack();
		AddToCartPageObjects addcartpage = homepage.clickAddCartIcon();
		CheckoutDetailsPageObjects checkoutdetails = addcartpage.clickCheckout();
		OverViewPageObjects overviewpage = checkoutdetails.clickContinue("akash", "kumar", "602023");
		CheckOutSuccessPageObjects successpage = overviewpage.clickFinish();
		boolean actualresult = successpage.successpage2();
		Assert.assertTrue(actualresult);

	}

	@Test(priority=2)
	public void toValidateLogout() {
		HomePageObjects homepage = loginPage.clickLogin("standard_user", "secret_sauce");
		homepage.clickSideButton();
		homepage.clickLogout();
		boolean actualresult = loginPage.displayLogout();
		Assert.assertTrue(actualresult);

	}

}
