package genericUtility1;

import java.util.Random;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListImp implements ITestListener{
	ExtentTest test;
	ExtentReports reports;

	public void onTestStart(ITestResult result) 
	{
	   test = reports.createTest(result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) 
	{
		test.log(Status.PASS, result.getMethod().getMethodName()+ " got passed");
	}

	public void onTestFailure(ITestResult result) 
	{
	    String path = null;
	    path = BaseClass.takeScreenSht1(result.getMethod().getMethodName());
	    test.log(Status.FAIL, result.getMethod().getMethodName()+ " got failed");
	    test.log(Status.FAIL, result.getThrowable());
	    test.addScreenCaptureFromPath(path); 
	}

	public void onTestSkipped(ITestResult result) 
	{
		test.log(Status.SKIP, result.getMethod().getMethodName()+ " got skipped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onStart(ITestContext context) 
	{
		Random random = new Random();
		int n = random.nextInt(100);
		ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter("./ExtentReport/Vtiger"+n+".html");
		extentSparkReporter.config().setDocumentTitle("Test Case");
		extentSparkReporter.config().setTheme(Theme.DARK);
		reports = new ExtentReports();
		reports.attachReporter(extentSparkReporter);
		reports.setSystemInfo("Browser", "chrome");
		reports.setSystemInfo("Build", "10.3");
		reports.setSystemInfo("env", "development");
		reports.setSystemInfo("reporterName", "Tarun");
	}

	public void onFinish(ITestContext context) 
	{
	    reports.flush();	
	}

}
