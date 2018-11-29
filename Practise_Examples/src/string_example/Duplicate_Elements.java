package string_example;

import java.util.HashSet;
import java.util.Set;

import org.testng.annotations.Test;

public class Duplicate_Elements {
	@Test
	public void test1() {
		String[] strArray = { "abc", "def", "mno", "xyz", "pqr", "xyz", "def" };

		for (int i = 0; i < strArray.length; i++) {
			for (int j = i + 1; j < strArray.length; j++) {
				if (strArray[i].equalsIgnoreCase(strArray[j]) && i != j) {
					System.out.println("repeated words are=" + strArray[j]);

				}
			}
		}
	}

	@Test
	public void test2() {
		String[] strArray = { "abc", "def", "mno", "xyz", "pqr", "xyz", "def", "def" };
		Set<String> s = new HashSet<String>();
		for (int i = 0; i < strArray.length; i++) {
			if (!s.add(strArray[i])) {
				System.out.println("repeated word=" + strArray[i]);
			}
		}
		System.out.println("After Removing All Duplicate Elements=" + s);
	}
}
