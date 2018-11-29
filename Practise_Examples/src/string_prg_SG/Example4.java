package string_prg_SG;

import java.math.MathContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.testng.annotations.Test;

public class Example4 {
	@Test
	public void test1() {
		int num_count = 0;
		int char_count = 0;
		String str = "Hi Hello 123 number 1??";
		str = str.replaceAll("[^a-zA-Z0-9]", "");
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
				num_count++;
			} else {
				char_count++;
			}
		}
		System.out.println("Number count=" + num_count);
		System.out.println("Chanarcter Count=" + char_count);
	}

	@Test
	public void test2() {
		int num_count = 0;
		int char_count = 0;
		String str = "Hi Hello 123 numbe00r 1??";
		str = str.replaceAll("[^a-zA-Z0-9]", "");
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			try {
				Integer.valueOf(ch[i] + "");
				num_count++;
			} catch (NumberFormatException e) {
				char_count++;
			}
		}
		System.out.println("Number count=" + num_count);
		System.out.println("Chanarcter Count=" + char_count);
	}

	@Test
	public void test3() {
		int num_count = 0;
		int char_count = 0;
		String str = "Hi Hello 123 numbe00r 1??";
		str = str.replaceAll("[^a-zA-Z0-9]", "");
		Pattern p = Pattern.compile("\\d");
		Matcher m = p.matcher(str);
		while (m.find()) {
			num_count++;
		}
		char_count = str.length() - num_count;
		System.out.println("Number count=" + num_count);
		System.out.println("Chanarcter Count=" + char_count);

	}

	@Test
	public void test4() {
		int num_count = 0;
		int char_count = 0;
		String str = "Hi Hello 123 numbe00r 1??";
		str = str.replaceAll("[^a-zA-Z0-9]", "");
		Pattern p = Pattern.compile("\\d");
		Matcher m = p.matcher(str);
		while (m.find()) {
			num_count++;
		}
		p = Pattern.compile("[a-zA-Z]");
		m = p.matcher(str);
		while (m.find()) {
			char_count++;
		}

		System.out.println("Number count=" + num_count);
		System.out.println("Chanarcter Count=" + char_count);

	}

	@Test // To count special character
	public void test5() {
		String str = "Hi Hello 123 numbe00r 1??";
		str = str.replaceAll("[a-zA-Z0-9\\s]", "");
		System.out.println(str.length());
	}

	@Test // To count special character
	public void test6() {
		int spe_count = 0;
		String str = "Hi Hello 123 numbe00r 1??^*";
		Pattern p = Pattern.compile("\\W");
		Matcher m = p.matcher(str);
		while (m.find()) {
			spe_count++;
		}
		System.out.println("Special Chanarcter Count Including space=" + spe_count);

	}

	@Test
	public void test7() {
		String str = "+10.";
		try {
			Integer.parseInt(str);
			System.out.println("Its a Number");
		} catch (NumberFormatException e) {
			System.out.println("Not a Number");
		}
	}

}
