package string_prg_SG;

import org.testng.annotations.Test;

public class Example_2 {
	@Test
	public void test1() {
		String str = "Welcome to SG testing Institute";
		String str1 = "SG testing Institute";
		String output = "";
		String str2 = "";
		str1 = str.substring(str.indexOf(str1));
		String[] str_arr = str1.split("\\s");
		for (int i = 0; i < str_arr.length; i++) {
			str2 = ((str_arr[i].charAt(0) + "").toUpperCase()) + str_arr[i].substring(1);
			output = output + " " + str2;
		}
		System.out.println(output);
	}
}
