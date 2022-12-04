package TestComponents;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Base.ExtentReportNG;
import Base.TestBase;

public class listeners extends TestBase implements ITestListener{
	
	public listeners() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	ExtentTest test;
	ExtentReports extent = ExtentReportNG.getReportObject();
	public void onTestStart(ITestResult result)
	{
		 test = extent.createTest(result.getMethod().getMethodName());
	}
	
	public void onTestSuccess(ITestResult result)
	{
	  test.log(Status.PASS, "Test passed");
	}
	
	public void onTestFailure(ITestResult result)
	{
	test.fail(result.getThrowable());
	String filepath = getScreenshots(result.getMethod().getMethodName(), driver);
	test.addScreenCaptureFromPath(filepath, result.getMethod().getMethodName());
		
	}
	
	public void onFinish(ITestContext context)
	{
		extent.flush();
		
	}

}
