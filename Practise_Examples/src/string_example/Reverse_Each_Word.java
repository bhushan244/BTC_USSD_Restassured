package string_example;

public class Reverse_Each_Word {
	public static void main(String[] args) {
		String str = "Java Concept Of The Day";
		String rev = "";
		String[] str_arr = str.split(" ");
		for (int i = 0; i < str_arr.length; i++) {
			for (int j = str_arr[i].length() - 1; j >= 0; j--) {
				rev = rev + str_arr[i].charAt(j);
			}
			rev = rev + " ";
		}
		System.out.println(rev);
	}
}
