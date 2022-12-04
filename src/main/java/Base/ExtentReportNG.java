package Base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportNG {

	
	public static ExtentReports getReportObject()
	{
	
		String path = System.getProperty("user.dir") + "\\Reports\\ index.html";
	    ExtentSparkReporter reporter = new ExtentSparkReporter(path);
	    reporter.config().setReportName("Web Automation result");
	    reporter.config().setDocumentTitle("Test Results");
	
	 
	   ExtentReports extent = new ExtentReports();
	    extent.attachReporter(reporter);
	    extent.setSystemInfo("Tester", "Sachin");
	   return extent;
	
	
	}
	
	
	
	
	
	
}
