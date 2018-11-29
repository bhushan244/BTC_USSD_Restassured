package testng_examples;

import org.testng.annotations.Test;

//each method is treated as  testng method.
@Test
public class Example_1 {
	public void test1() {
		System.out.println("Test1");
	}

	public void test2() {
		System.out.println("Test2");
	}

	public void test3() {// public void test3(String s)-->will give error
		System.out.println("Test3");
	}
}
