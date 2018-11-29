package string_example;

public class Reverse_String_Recursion {
	static String rev = "";

	public static void main(String[] args) {
		String s = "Hello world Hi";
		System.out.println(reverse(s));
	}

	static String reverse(String s) {
		if (s.length() == 1) {
			return s;
		}
		rev = rev + s.charAt(s.length() - 1) + reverse(s.substring(0, s.length() - 1));
		return rev;
	}
}
