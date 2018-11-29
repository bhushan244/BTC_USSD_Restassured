package string_example;

public class Count_Given_Char_Without_For_Loop {
	public static void main(String[] args) {
		String str = "Hi Hello How Are You Java HHHHH";
		String find_char = "H";
		System.out.println(str.length());
		System.out.println(str.replaceAll(find_char, "").length());

		System.out.println(str.length() - str.replaceAll(find_char, "").length());
	}
}
