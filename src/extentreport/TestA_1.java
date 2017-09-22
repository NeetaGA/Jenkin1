package extentreport;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestA_1 {
	
	@Test
	public void test_N1() {
		
		System.out.println("success A1");
	}

	@Test
	public void test_N2() {
		
		
	Assert.fail();
	}
	
	@Test
	public void test_N3() {
		
throw new SkipException("Skipped A1");
	}
}
