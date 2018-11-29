package string_example;

public class Last_Index_Count {
	public static void main(String[] args) {
		String str = "IncludeHelp";
		char ch = 'l';
		System.out.println(str.lastIndexOf(ch));
		int index = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				index=i;
			}
		}
		System.out.println(index);
	}
}
