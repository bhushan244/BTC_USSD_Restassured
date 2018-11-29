package general;

public class Palindrome {
	public static void main(String[] args) {
		String s = "aba";
		boolean val = true;
		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
				val = false;
				System.out.println("Not Palindrome");
				break;
			}
		}
		if (val == true) {
			System.out.println("Plaindrome");
		}
	}
}
