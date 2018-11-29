package testng_examples;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Skip_Exception_Example {
	@Test
	public void test1() {
		int a = 2;
		System.out.println("test entered");
		if (a == 2)
			throw new SkipException("Skip Exception throwed");
		System.out.println("Test completed--" + a);
	}
}
