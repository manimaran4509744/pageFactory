package sauceDemoPkg1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;
import sauceDemoPkg2.LoginPageObjects;

public class BaseClass {
	public static WebDriver driver;
	public LoginPageObjects loginPage;
	
	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
	    loginPage = new LoginPageObjects();
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
