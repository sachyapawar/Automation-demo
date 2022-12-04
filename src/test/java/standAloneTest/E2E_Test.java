package standAloneTest;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class E2E_Test {

	public static void main(String[] args) throws InterruptedException {
		
		String productName = "Sauce Labs Fleece Jacket";
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		
		WebElement userName = driver.findElement(By.cssSelector("#user-name"));
		userName.sendKeys("standard_user");
		Thread.sleep(1000);
		
		WebElement password = driver.findElement(By.cssSelector("#password"));
		password.sendKeys("secret_sauce");
		Thread.sleep(1000);
		
		WebElement loginButton = driver.findElement(By.cssSelector("#login-button"));
		loginButton.click();
		Thread.sleep(1000);
		
		
//		Alert alt = driver.switchTo().alert();
//		alt.accept();
		
		WebElement ThreeDotButton = driver.findElement(By.xpath("//button[text()='Open Menu']"));
		ThreeDotButton.click();
		
		WebElement AboutButton = driver.findElement(By.cssSelector("#about_sidebar_link"));
		AboutButton.click();
		
		System.out.println("URL = " + driver.getTitle());
		
		driver.navigate().back();
		
		System.out.println("Get product page = " + driver.getTitle());
		
		 WebElement addToCartButton = driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-fleece-jacket"));
		 addToCartButton.click();
		 
		 WebElement cartButton = driver.findElement(By.cssSelector(".shopping_cart_link"));
		 cartButton.click();
		 System.out.println("Your cart page = " + driver.getTitle());
		 
		 WebElement checkOutButton = driver.findElement(By.cssSelector("#checkout"));
		 checkOutButton.click();
		 System.out.println("checkout page = " + driver.getTitle());
		 
		 
		 WebElement name = driver.findElement(By.cssSelector(".title"));
		 System.out.println(name.getText());
		 Assert.assertEquals(name.getText().equalsIgnoreCase("Checkout: Your Information" ), true);
		 
		 WebElement firstName = driver.findElement(By.cssSelector("#first-name"));
		 firstName.sendKeys("sachin");
		 WebElement lastName = driver.findElement(By.cssSelector("#last-name"));
		 lastName.sendKeys("pawar");
		 WebElement postalCode = driver.findElement(By.cssSelector("#postal-code"));
		 postalCode.sendKeys("415304");	 
		 WebElement continueButton = driver.findElement(By.cssSelector("#continue"));
		 continueButton.click();
		 
//		 String str = driver.getCurrentUrl();
//		 System.out.println("checkout: overview page = " + str);
		 
		 
		 
		 
		 
		Thread.sleep(3000);
        driver.close();
	}

}
