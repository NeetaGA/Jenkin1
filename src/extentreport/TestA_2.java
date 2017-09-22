package extentreport;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestA_2 {
	
	@Test
	public void test_M1() {
		
		throw new SkipException("Skipped A2");
		
	
	}

	@Test
	public void test_M2() {
		
	Assert.fail();
	}
	
	@Test
	public void test_M3() {
		System.out.println("success A2");

	}

}
