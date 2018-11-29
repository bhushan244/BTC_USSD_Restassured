package testng_examples;

import org.testng.annotations.Test;

public class Regular_Expression_Xml {
	@Test(invocationCount = 10) // 10 times tset1 will run
	public void test1() {
		System.out.println("Test1");
	}

	@Test
	public void test2() {
		System.out.println("Test2");
	}

	@Test
	public void teaa() {
		System.out.println("teaa");
	}
}
