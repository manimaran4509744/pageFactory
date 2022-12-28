package sauceDemoPkg2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sauceDemoPkg1.BaseClass;

public class CheckOutSuccessPageObjects extends BaseClass {
	
@FindBy(id="checkout_complete_container")WebElement successpage1;

public CheckOutSuccessPageObjects(){
	PageFactory.initElements(driver, this);
}
public boolean successpage2() {
	  
      boolean displayed = successpage1.isDisplayed();
      return displayed;
      
}
}
