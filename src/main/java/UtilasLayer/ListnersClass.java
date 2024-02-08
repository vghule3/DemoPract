package UtilasLayer;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ListnersClass extends extendsreport implements ITestListener{

	public static ExtentTest extentTest;
	@Override
	public void onStart(ITestContext context) {
	 
		extent = extendsreport.extentreportSetup();
		
	}
	@Override
	public void onTestStart(ITestResult result) {
		 extentTest = extent.createTest(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		extentTest.log(Status.PASS, result.getMethod().getMethodName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
	extentTest.log(Status.FAIL, result.getMethod().getMethodName());	
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		extentTest.log(Status.SKIP, result.getMethod().getMethodName());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	

	@Override
	public void onFinish(ITestContext context) {
		extent.flush();
		
	}

}
