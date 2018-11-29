package testng_examples;

import org.testng.annotations.Test;

public class Expected_Exception {
	@Test(expectedExceptions = ArithmeticException.class)
	public void test1() {
		System.out.println("Expected Condition");
		System.out.println(100 / 0);
		System.out.println("Test After Exception");
	}
}

/*
 * If the test encounters the mentioned exception in ExpectedExceptions
 * under @TEst tag it will skip the or neglect the exceptions and the test will
 * pass even if the mentioned exception occurs
 */
