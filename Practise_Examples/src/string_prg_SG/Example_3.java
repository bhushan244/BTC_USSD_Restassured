package string_prg_SG;

import java.util.HashSet;
import java.util.Set;

import org.testng.annotations.Test;

public class Example_3 {
	@Test
	public void test1() {
		int count = 0;
		String str = "Hi#Hello#How#Are#You";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '#') {
				count++;
			}
		}
		System.out.println(count);
	}

	@Test
	public void test2() {
		int count = 1;
		Set<Character> s = new HashSet<Character>();
		String str = "Hi##Hello##How##Are#You";
		char[] ch = str.toCharArray();
		for (Character c : ch) {
			if (c == '#' && !s.add(c)) {
				count++;
			}
		}
		System.out.println(count);

	}
}
