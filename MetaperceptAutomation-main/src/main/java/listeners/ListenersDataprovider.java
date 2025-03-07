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

import base.BaseClass;

public class ListenersDataprovider extends BaseClass implements ITestListener
{
	 ExtentReports report;
	    ExtentSparkReporter spark;
	    ExtentTest test;

	    @Override
	    public void onStart(ITestContext context) {
	        // Initialize Extent Report first to avoid NullPointerException
	        spark = new ExtentSparkReporter(".\\Reports\\metaperceptReports.html");
	        spark.config().setDocumentTitle("Metapercept Report");
	        spark.config().setReportName("Test Report");
	        spark.config().setTheme(Theme.DARK);

	        report = new ExtentReports();
	        report.attachReporter(spark);
	        report.setSystemInfo("OS", "Windows 11");
	        report.setSystemInfo("Browser", "Chrome-100");
	    }

	    @Override
	    public void onTestStart(ITestResult result) {
	        String name = result.getMethod().getMethodName();
	        Reporter.log(name + " is executing", true);
	        test = report.createTest(name);  // ✅ Now test will not be null
	    }

	    @Override
	    public void onTestSuccess(ITestResult result) {
	        test.log(Status.PASS, result.getMethod().getMethodName() + " executed successfully.");
	    }

	    @Override
	    public void onTestFailure(ITestResult result) {
	        test.log(Status.FAIL, result.getMethod().getMethodName() + " is failed.");
	        
	        if (driver != null) {  // ✅ Prevents NullPointerException
	            TakesScreenshot ts = (TakesScreenshot) driver;
	            String screenshot = ts.getScreenshotAs(OutputType.BASE64);
	            test.addScreenCaptureFromBase64String(screenshot);
	        } else {
	            test.log(Status.FAIL, "Screenshot not captured due to null driver.");
	        }
	    }

	    @Override
	    public void onTestSkipped(ITestResult result) {
	        test.log(Status.SKIP, result.getMethod().getMethodName() + " is skipped.");
	    }

	    @Override
	    public void onFinish(ITestContext context) {
	        report.flush();  // ✅ Ensures the report is written properly
	    }
	
}
