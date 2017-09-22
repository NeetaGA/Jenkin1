package extentreport1;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestB_2 {
	
	public void test_P1() {
		System.out.println("success P1");
		}

	@Test
	public void test_P2() {
		throw new SkipException("Skipped P2");
	
	}
	
	@Test
	public void test_P3() {
		Assert.fail();
}

}
