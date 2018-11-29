package string_prg_SG;

public class Example_9 {
	public static void main(String[] args) {
		String str = "abc xyz mno a_z_1_2";
		String output = "";

		String chr = "a_z";
		System.out.println((chr.charAt(0) + "").contains("[a-z]*"));
		char[] ch = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if ((ch[i] == '_' && i != 0 && i != ch.length)) {
				System.out.println(ch[i - 1]);
				System.out.println(ch[i + 1]);
				if ((str.charAt(i - 1) + "").matches("[a-zA-Z]"))
					if (((str.charAt(i + 1) + "").matches("[a-zA-Z]"))) {
						output = output + ch[i];
					}
			} else {
				output = output + ch[i];
			}
		}

		System.out.println("output=" + output.replaceAll("\\s", "_"));
	}
}
