package general;

import org.testng.annotations.Test;

public class Sum_All_Digit {
	@Test
	public void test1() {
		int num = 123456, sum = 0;
		int digit = 0;
		while (num != 0) {
			digit = num % 10;
			num = num / 10;
			sum = sum + digit;
		}
		System.out.println(sum);
	}
}
