package listner;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class customlisteners  extends TestListenerAdapter{
	
public void onTestFailure(ITestResult tr) {
		
		System.out.println("Test Failed");
		
		
	}
	
	public void onTestSkipped(ITestResult tr) {
		
		System.out.println("Test Skipped");
		
	}
	public void onTestSuccess(ITestResult tr) {
		
		System.out.println("Test success");
		
		
	}

	

}
