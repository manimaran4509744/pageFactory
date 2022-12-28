package sauceDemoPkg2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sauceDemoPkg1.BaseClass;

public class AddToCartPageObjects extends BaseClass {
	public CheckoutDetailsPageObjects detailPage;  
	@FindBy(id="checkout") WebElement checkoutIcon;
	
	public AddToCartPageObjects() {
		PageFactory.initElements(driver, this);
	}
	public CheckoutDetailsPageObjects clickCheckout() {
		checkoutIcon.click();
	    detailPage = new CheckoutDetailsPageObjects();
	    return detailPage;
	}

}
