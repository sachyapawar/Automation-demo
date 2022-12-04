package TestComponents;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import POM.HomePage;

public class HomePageTest extends TestBase {

	HomePage home;
	public HomePageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	@BeforeMethod
	public void setup1() throws IOException
	{
	  initialization();
	   home = new HomePage();
	
	}
	
	
	
	@BeforeMethod
	public void setup() throws IOException
	{
	  initialization();
	   home = new HomePage();
	
	}
	@Test
	public void homeTest()
	{
	 String s1 = home.Home();
	 System.out.println(s1);
	 Assert.assertTrue(s1.isBlank(), "true");
	 
	}
	@Test
	public void navigateBackTest()
	{
	 String s2 = home.navigateBack();
	 System.out.println(s2);
	 	
	}
	@Test
	public void addToCartProductTest()
	{
	  String value = home.addToCartProduct();
	  System.out.println(value);
	  Assert.assertTrue(value.isEmpty(), "true");
	
	}
}
