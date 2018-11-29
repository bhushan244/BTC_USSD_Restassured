package array_examples;

import org.testng.annotations.Test;

public class Second_largest {
	@Test
	public void test1() {
		int[] input = { 45, 51, 28, 75, 49, 42, 42, 75, 50 };
		int f_max = input[0];
		int s_max = input[1];

		for (int i = 2; i < input.length; i++) {
			if (input[i] > f_max) {
				s_max = f_max;
				f_max = input[i];
			} else if (input[i] < f_max && input[i] > s_max) {
				s_max = input[i];
			}
		}
		System.out.println("Second Largest is " + s_max);
	}
}
