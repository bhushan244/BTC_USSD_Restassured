package testng_examples;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Hard_Assert {
	@Test
	public void test1() {
		SoftAssert sf = new SoftAssert();
		System.out.println("Soft Assert");
		sf.assertTrue(false);
		System.out.println("Soft Assert Executed");
		sf.assertAll();//if this statement is not added test will pass
	}

	@Test
	public void test2() {
		System.out.println("Hard Assert");
		Assert.assertTrue(false);
		System.out.println("Hard Assert Executed");
	}
}
