package string_example;

import java.util.HashSet;
import java.util.Set;

public class Print_First_Duplicate_Character {
	public static void main(String[] args) {
		String s = "Hello How Are You";
		s = s.replaceAll("\\s", "");
		s = s.toLowerCase();
		Set<Character> set = new HashSet<Character>();

		char[] ch = s.toCharArray();
		for (Character a : ch) {
			if (!set.add(a)) {
				System.out.println("First Duplicated Character is " + a);
				break;
			}
		}
	}
}
