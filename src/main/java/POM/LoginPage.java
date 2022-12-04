package POM;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class LoginPage extends TestBase{

public LoginPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}



//	WebElement userName = driver.findElement(By.cssSelector("#user-name"));
	@FindBy (css = "#user-name")private WebElement userName;	
//	WebElement password = driver.findElement(By.cssSelector("#password"));
	@FindBy (css = "#password")private WebElement password;	
//	WebElement loginButton = driver.findElement(By.cssSelector("#login-button"));
	@FindBy (css = "#login-button")private WebElement loginButton;
	@FindBy (css = ".login_logo")private WebElement swagLabsLogo;
	@FindBy (css = ".bot_column")private WebElement dollLogo;
	
	public String validateLoginPageTitle()
	{
	
	return driver.getTitle();
	
	}
	
	public Boolean validateLogo() {
	
		return dollLogo.isDisplayed();
	
	
	}
	public void loginToSwagLabs()
	{
		userName.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
		loginButton.click();
	}
}
