package string_example;

public class Extract_Middle_character {
	public static void main(String[] args) {
		String s = "abc";
		int pos = 0;
		int len = 0;
		if (s.length() % 2 == 0) {
			pos = s.length() / 2 - 1;
			len = 2;
		} else {
			pos = s.length() / 2;
			len = 1;
		}
		System.out.println("middle Character is " + s.substring(pos, pos+len));
	}
}
