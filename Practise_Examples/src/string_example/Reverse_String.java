package string_example;

public class Reverse_String {
	public static void main(String[] args) {
		String s = "World";
		// int l = s.length();
		for (int i = s.length() - 1; i >= 0; i--) {
			s = s + s.charAt(i);
		}
		System.out.println(s.substring(s.length() / 2));
	}
}
