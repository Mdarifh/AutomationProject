
package listeners;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Project.Base;
import utilities.ExtentReporter;

public class Listeners extends Base implements ITestListener {
	public WebDriver driver=null;
	ExtentReports extentReport = ExtentReporter.getExtentReport();
	ExtentTest extentTest;
	ThreadLocal<ExtentTest> extentTestThread = new ThreadLocal<ExtentTest>();
	public void onTestStart(ITestResult result) {
		String testName = result.getName();
		extentTest = extentReport.createTest(testName);
		extentTestThread.set(extentTest);
		
		
	}
	
	public void onTestSuccess(ITestResult result) {
		String testName = result.getName();
		//extentTest.log(Status.PASS,testName+"Got Pass");
		extentTestThread.get().log(Status.PASS, testName +"got passed");
	}

	public void onTestFailure(ITestResult result) {
		WebDriver driver = null;
		String testMethodName = result.getName();
		
		//extentTest.fail(result.getThrowable());
		extentTestThread.get().fail(result.getThrowable());
		
		try {
			driver = (WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		try {
			String screenshotFilePath = takeScreenshot(testMethodName,driver);
			
			extentTestThread.get().addScreenCaptureFromPath(screenshotFilePath,testMethodName);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		
	}

	public void onFinish(ITestContext context) {
		extentReport.flush();
	}

}
