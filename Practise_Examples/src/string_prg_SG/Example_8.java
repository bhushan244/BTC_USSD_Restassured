package string_prg_SG;

public class Example_8 {
	public static void main(String[] args) {
		String str = "India is great".toLowerCase();
		char[] ch = str.toCharArray();
		int count = 0;
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j] && ch[i] != ' ' && ch[i] != '_') {
					count++;
					if (count >= 1) {
						ch[j] = '_';
					}
				}

			}
			count = 0;

		}
		for (char c : ch) {
			System.out.print(c);
		}
	}
}
