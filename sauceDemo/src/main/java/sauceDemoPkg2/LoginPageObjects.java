package sauceDemoPkg2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sauceDemoPkg1.BaseClass;

public class LoginPageObjects extends BaseClass {
	public HomePageObjects homepage;
	@FindBy(id="user-name")WebElement userName;
	@FindBy(id="password")WebElement passWord;
	@FindBy(id="login-button")WebElement login;
	@FindBy(className="login_wrapper")WebElement logoutDisplay;
	
	
	public LoginPageObjects(){
		PageFactory.initElements(driver, this);
	}
	
	public HomePageObjects clickLogin(String user,String pass) {
		userName.sendKeys(user);
		passWord.sendKeys(pass);
		login.click();
	    homepage = new HomePageObjects();
	    return homepage;

	}
	public boolean displayLogout() {
		boolean displayed = logoutDisplay.isDisplayed();
		return displayed;
	}
}
