package string_example;

import java.text.DecimalFormat;

public class Percentage_Upper_Lower_SpecialCharacter_Digit {
	public static void main(String[] args) {
		String str = "Tiger Runs @ The Speed Of 100 km/hour.";
		int count_upper = 0;
		int count_lower = 0;
		int count_digit = 0;
		int count_specialch = 0;
		int str_length = str.length();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isUpperCase(ch)) {
				count_upper++;
			} else if (Character.isLowerCase(ch)) {
				count_lower++;
			} else if (Character.isDigit(ch)) {
				count_digit++;
			} else {
				count_specialch++;
			}
		}
		System.out.println("UpperCase %=" + calc_perc(str_length, count_upper));
		System.out.println("LowerCase %=" + calc_perc(str_length, count_lower));
		System.out.println("Digit %=" + calc_perc(str_length, count_digit));
		System.out.println("Special Character %=" + calc_perc(str_length, count_specialch));
	}

	static String calc_perc(int length, int count) {
		double res = 0.0;
		res = ((100.0 * count) / length);
		DecimalFormat dc = new DecimalFormat("##.##");
		return dc.format(res);
	}
}
