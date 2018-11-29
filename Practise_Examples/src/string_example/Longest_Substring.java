package string_example;

import java.util.LinkedHashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class Longest_Substring {
	public static void main(String[] args) {
		String str = "javaconceptoftheday";
		String substr = "";
		boolean flag = true;
		for (int i = 0; i < str.length(); i++) {
			flag = true;
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					substr = "";
					flag = false;
					break;
				}
			}
			if (flag == true)
				substr += str.charAt(i);
		}
		System.out.println("Longest Substring is " + substr);
	}

	@Test
	public void test1() {
		String str = "javaconceptoftheday";
		char[] ch = str.toCharArray();
		Map<Character, Integer> m = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < ch.length; i++) {
			char c = ch[i];
			if (m.containsKey(c)) {
				i = m.get(c);
				m.clear();
			} else {
				m.put(c, i);
			}
		}
		System.out.println(m.keySet());
	}
}
