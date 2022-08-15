package testNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {

	// Listener:- Listen the Test case (Selenium Event)
	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test case started for execution:"+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case executed successfully:"+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case failed:"+result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}
		
		

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}
	

	
	
	
}
