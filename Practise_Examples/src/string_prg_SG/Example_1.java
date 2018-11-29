package string_prg_SG;

import org.testng.annotations.Test;

public class Example_1 {
	@Test
	public void test1() {
		String str = "Welcome to SG testing Institute";
		String split = "SG testing Institute";
		System.out.println(str.substring(str.indexOf(split)).toUpperCase());
	}

	@Test
	public void test2() {
		String str = "Welcome to SG testing Institute";
		String split = "SG testing Institute";
		String out = "";
		split = str.substring(str.indexOf(split));
		for (int i = 0; i < split.length(); i++) {
			if (split.charAt(i) >= 'a' && split.charAt(i) <= 'z') {
				out = out + (char) ((int) (split.charAt(i)) - 32);
			} else {
				out = out + split.charAt(i);
			}
		}
		System.out.println((out));
	}

	@Test
	public void test3() {
		String str = "Welcome to SG testing Institute";
		String split = "SG testing Institute";
		int start_index = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.substring(i, split.length() + i).contains(split)) {
				start_index = i;
				break;
			}
		}

		System.out.println(str.substring(start_index, split.length() + start_index).toUpperCase());
	}
}
