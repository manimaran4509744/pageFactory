package sauceDemoPkg2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sauceDemoPkg1.BaseClass;

public class OverViewPageObjects extends BaseClass{
	public CheckOutSuccessPageObjects successpage;
	@FindBy(id="finish")WebElement finishButton;
	
	public OverViewPageObjects() {
		PageFactory.initElements(driver,this);
	}
	
	public CheckOutSuccessPageObjects clickFinish() {
        finishButton.click();
         successpage = new CheckOutSuccessPageObjects();
        return successpage;
	}

}
