package string_example;

//convert lower case letter to upper case and  vice versa.
public class Convert_lower_upper {
	public static void main(String[] args) {
		String s = "Hi Hello";
		String output = "";
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLowerCase(s.charAt(i))) {
				output = output + (s.charAt(i) + "").toUpperCase();
			} else if (Character.isUpperCase(s.charAt(i))) {
				output = output + (s.charAt(i) + "").toLowerCase();
			} else {
				output = output + s.charAt(i);
			}
		}
		System.out.println(output);

		System.out.println('A' + 'B');
		System.out.println("A" + "B" + 'A');
		System.out.println(1+2+'A' + "B");
		
		System.out.println(s.toCharArray().toString());//prints address
	}
}
