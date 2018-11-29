package string_example;

import java.util.ArrayList;

public class Find_All_Substring {
	// all substring :“a”, “b”,”b”, “ab”, “bb”, “abb”
	public static void main(String[] args) {
		String str = "abcd";
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				System.out.println(str.substring(i, j));
			}
		}
		ArrayList<String> a = new ArrayList<String>();
		a.ensureCapacity(6);
	}

}
