package string_example;

import org.testng.annotations.Test;

public class Reverse_Retaining_Space_position {
	@Test
	public void test2() {
		String rev = "";
		// String str = "I Am Not String";// output:g ni rtS toNmAI
		//String str = "JAVA JSP ANDROID";// DIOR DNA PSJAVAJ
		String str = "1 22 333 4444 55555";// 5 55 554 4443 33221
		int count = str.length() - 1;
		for (int i = 0; i <= str.length() - 1; i++) {
			if (str.charAt(i) == ' ') {
				rev = rev + " ";
			} else {
				if (str.charAt(count) == ' ') {
					count--;
				}
				rev = rev + str.charAt(count);
				count--;
			}

		}
		System.out.println(rev);
	}
}
