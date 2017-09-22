package extentreport1;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestB_1 {
	
	@Test
	public void test_S1() {
		
		throw new SkipException("Skipped B1");
		
	
	}

	@Test
	public void test_S2() {
		
	Assert.fail();
	}
	
	@Test
	public void test_S3() {
		System.out.println("success B1");

}
}