package TestComponents;

import java.io.IOException;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import POM.LoginPage;

  
public class LoginPageTest extends TestBase{

	LoginPage login;
	public LoginPageTest() throws IOException {
		super();
		
		
	}
	@BeforeMethod
	public void setUp() throws IOException
	{
		 initialization();
		 login = new LoginPage();	    
	
	}
	
	
	@Test
	public void validateLoginPageTitleTest() 
	{
	   String name = login.validateLoginPageTitle();
	   System.out.println("page Title = " + name);
	Assert.assertEquals(name, "Swag Labs");
	}
	
	
	@Test
	public void validateLogoTest()
	{
	  Boolean value = login.validateLogo();
	  System.out.println("logo is displayed = " + value);
	Assert.assertTrue(true);
	
	}
	@Test
	public void loginToSwagLabsTest()
	{

	login.loginToSwagLabs();
	initialization();
	}	
	@AfterMethod
	public void Exit()
	{
	
	driver.close();
	}	
}
