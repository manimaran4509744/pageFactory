package sauceDemoPkg2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sauceDemoPkg1.BaseClass;

public class CheckoutDetailsPageObjects extends BaseClass
    
{
	public OverViewPageObjects overview;
	@FindBy(id = "first-name")WebElement firstName;
	@FindBy(id = "last-name")WebElement lastName;
	@FindBy(id = "postal-code")WebElement zipCode;
	@FindBy(id = "continue")WebElement continue1;
	
	public CheckoutDetailsPageObjects() {
		PageFactory.initElements(driver, this);
		
	}
	
	public OverViewPageObjects clickContinue(String firstName1,String lastName1,String zipCode1) {
		firstName.sendKeys(firstName1);
		lastName.sendKeys(lastName1);
		zipCode.sendKeys(zipCode1);
		continue1.click();
		overview = new OverViewPageObjects();
		return overview;
		
	}
	
}
