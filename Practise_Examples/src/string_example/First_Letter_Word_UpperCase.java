package string_example;

public class First_Letter_Word_UpperCase {
	public static void main(String[] args) {
		String str = "we are looking for good writers.";
		System.out.println("Input length=" + str.length());
		String out_str = "";
		String[] output = str.split("\\s");
		for (String s : output) {
			out_str = out_str + Character.toUpperCase(s.charAt(0)) + s.substring(1) + " ";
		}
		out_str = out_str.substring(0,out_str.length()-1);
		System.out.println(out_str);
		System.out.println("output length=" + out_str.length());
	}
}
