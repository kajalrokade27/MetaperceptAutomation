package listeners;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import base.CrossBrowserTesting;


public class ListenersClass extends CrossBrowserTesting implements ITestListener
{

	ExtentReports report;
	ExtentSparkReporter spark;
	ExtentTest test;
	@Override
	public void onTestStart(ITestResult result) 
	{
		String name = result.getMethod().getMethodName();
		Reporter.log(name+" is executed");
		test= report.createTest(name);
		
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		String name = result.getMethod().getMethodName();
		test.log(Status.PASS, name+ " is executed successfully");
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		String name = result.getMethod().getMethodName();
		test.log(Status.FAIL, name+"is failed");
		TakesScreenshot ts = (TakesScreenshot)driver;
		String screenshot = ts.getScreenshotAs(OutputType.BASE64);
		test.addScreenCaptureFromBase64String(screenshot);
		
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		String name = result.getMethod().getMethodName();
		test.log(Status.SKIP, name+" is skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) 
	{
		//Create spark reporter
		spark = new ExtentSparkReporter(".\\Reports\\metaperceptReports.html");
		
		//configure the spark reporter
		spark.config().setDocumentTitle("SampleReport");
		spark.config().setReportName("Metapercept_Report");
		spark.config().setTheme(Theme.STANDARD);
		
		//Create extent report
		report = new ExtentReports();

		//Config extent report
		report.setSystemInfo("OS", "Windows 10");
		report.setSystemInfo("Browser", "Chrome(Version 132.0.6834.160)");
		
		//Attach spark reporter to extent report
		report.attachReporter(spark);
	}

	@Override
	public void onFinish(ITestContext context) 
	{
		report.flush();
	}
    
}
