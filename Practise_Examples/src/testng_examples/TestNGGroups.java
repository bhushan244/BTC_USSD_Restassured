package testng_examples;

import org.testng.annotations.Test;

public class TestNGGroups {
	@Test(groups = { "smoke", "functional" })
	public void test1() {
		System.out.println("Test under smoke and functional testing group");
	}

	@Test(groups = { "smoke" })
	public void tset2() {
		System.out.println("Test under only smoke testing group");
	}

	@Test(groups = { "functional" })
	public void test3() {
		System.out.println("Test Under Functional Test group");
	}
}
