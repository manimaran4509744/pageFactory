package sauceDemoPkg2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sauceDemoPkg1.BaseClass;

public class HomePageObjects extends BaseClass {
	public AddToCartPageObjects cartPage;
	@FindBy(id="add-to-cart-sauce-labs-backpack") WebElement backpack;
	@FindBy(className="shopping_cart_link") WebElement addcartIcon;
	@FindBy(id="react-burger-menu-btn") WebElement sideButton;
	@FindBy(id="logout_sidebar_link") WebElement logout;
	public HomePageObjects() {
		PageFactory.initElements(driver, this);
	}
	
	public void selectBackpack() throws InterruptedException {
          backpack.click();
	}
	public AddToCartPageObjects clickAddCartIcon() {
		addcartIcon.click();
		cartPage= new AddToCartPageObjects();
		return cartPage;
	}
	public void clickSideButton() {
             sideButton.click();
	}
	public void clickLogout() {
		logout.click();
		
	}
	
	

}
