package pattern;

import org.testng.annotations.Test;

/* *
   ***
   *****
   *******   */
public class Example_1 {
	public static void main(String[] args) {
		int p = 1;
		for (int i = 0; i < 4; i++) {
			for (int j = 1; j <= p; j++) {
				System.out.print("*");
			}
			System.out.println();
			p = p + 2;
		}
	}

	@Test
	public void test1() {
		int count = 0;
		String str = "ABCCCCCBBAAEEEFFA";
		String output = "";
		boolean flag = false;
		do {
			flag = false;
			for (int i = 0; i < str.length(); i++) {
				count = 0;
				for (int j = i; j < str.length(); j++) {
					if (str.charAt(i) == str.charAt(j)) {
						count++;
					} else {
						break;
					}
				}
				if (count < 3) {
					output = output + str.charAt(i);
				} else {
					i = i + count - 1;
					flag = true;
				}
			}
			str = output;
			output = "";
		} while (flag);
		System.out.println(str);
	}
}
