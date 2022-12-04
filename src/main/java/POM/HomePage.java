package POM;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.TestBase;

public class HomePage extends TestBase{

	public HomePage() throws IOException {
		super();
		
	}

//	WebElement ThreeDotButton = driver.findElement(By.xpath("//button[text()='Open Menu']"));
	@FindBy (xpath = "//button[text()='Open Menu']")private WebElement ThreeDotButton;
//	WebElement AboutButton = driver.findElement(By.cssSelector("#about_sidebar_link"));
	@FindBy (css = "#about_sidebar_link")private WebElement AboutButton;
//	WebElement addToCartButton = driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-fleece-jacket"));
	@FindBy (css = "#add-to-cart-sauce-labs-fleece-jacket")private WebElement addToCartButton;
//	WebElement cartButton = driver.findElement(By.cssSelector(".shopping_cart_link"));
	@FindBy (css = ".shopping_cart_link")private WebElement cartButton;
	
	public String Home()
	{
		ThreeDotButton.click();
		AboutButton.click();
		return driver.getTitle();
	
	}
	public String navigateBack()
	{
	driver.navigate().back();
	return driver.getTitle();
	
	}
	public String addToCartProduct()
	{
		addToCartButton.click();
		cartButton.click();
		return addToCartProduct();
		
	}	
		
}
