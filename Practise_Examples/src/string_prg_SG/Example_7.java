package string_prg_SG;

public class Example_7 {
	public static void main(String[] args) {
		String str = "India";
		String output = "";
		for (int i = 0; i < str.length(); i++) {
			if (i % 2 == 0) {
				output = output + (str.charAt(i) + "").toUpperCase();
			} else {
				output = output + str.charAt(i);
			}
		}
		System.out.println(output);
	}
}
