package Day9;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListners implements ITestListener {
	
	public void onTestStart(ITestResult result) {
		System.out.println("******Test Start : "+result.getName());	
	}
     public void onTestSuccess(ITestResult result) {
    	 System.out.println("******Test is Successful : "+result.getName());
	}
     public void onTestFailure(ITestResult result) {
    	 System.out.println("******Test Failure : "+result.getName());
 	}
     public void onFinish(ITestContext result) {
    	 System.out.println("******Test Completed : "+result.getName());
 	}
}
 