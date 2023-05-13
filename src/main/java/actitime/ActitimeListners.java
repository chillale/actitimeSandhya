package actitime;

import java.util.Random;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ActitimeListners implements ITestListener{
	
	ExtentReports extentReports;
	ExtentTest extentTest;

	public void onTestStart(ITestResult result) {
		extentTest = extentReports.createTest(result.getMethod().getMethodName());
		
	}

	public void onTestSuccess(ITestResult result) {
		extentTest.log(Status.PASS, result.getMethod().getMethodName()+" got passed");
		
	}

	public void onTestFailure(ITestResult result) {
		String path = ActitimeBase.takeScreenShott(result.getMethod().getMethodName());
		extentTest.log(Status.FAIL, result.getMethod().getMethodName()+"got Failed");
		extentTest.log(Status.FAIL, result.getThrowable());
		extentTest.addScreenCaptureFromPath(path);
		
		
	}

	public void onTestSkipped(ITestResult result) {
		
		extentTest.log(Status.SKIP, result.getMethod().getMethodName()+"got Skipped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	public void onStart(ITestContext context) {
		int n = new Random().nextInt(100);
		ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter("./ExtentReport/actitime"+n+".html");
		extentSparkReporter.config().setDocumentTitle("Actitime Test Case");
		extentSparkReporter.config().setTheme(Theme.DARK);
		extentReports = new ExtentReports();
		extentReports.attachReporter(extentSparkReporter);
		extentReports.setSystemInfo("Browser", "chrome");
		extentReports.setSystemInfo("env", "testing");
		extentReports.setSystemInfo("version", "1.2.3");
		extentReports.setSystemInfo("Reporter Name", "Rohit");
		
	}

	public void onFinish(ITestContext context) {
		extentReports.flush();
		
	}

}
