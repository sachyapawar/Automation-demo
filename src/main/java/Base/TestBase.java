package Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static Properties prop;
	 public static WebDriver driver;
public TestBase() throws IOException	
{
	 prop = new Properties();
	FileInputStream file = new FileInputStream("C:\\Users\\sachi\\eclipse-workspace\\Sachya\\swagLabsFramework\\src\\main\\java\\Base\\property.properties");
	prop.load(file);
	
	
}
	public void initialization()
	{	
		String browsername = prop.getProperty("browser");
		if(browsername.equals("chrome"))

		{
	        WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        
		}
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       driver.get(prop.getProperty("url"));
	       driver.manage().deleteAllCookies();
	}
	public String getScreenshots(String testCaseName , WebDriver driver)
	{
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		File destination = new File(System.getProperty("user.dir") + "//reports//" + testCaseName + " .png");
		return System.getProperty("user.dir") + "//reports//" + testCaseName + " .png";
		
	}	
		
		
	}

