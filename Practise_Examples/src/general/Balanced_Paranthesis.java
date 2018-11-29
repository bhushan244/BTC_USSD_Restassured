package general;

import java.util.Stack;

public class Balanced_Paranthesis {
	public static void main(String[] args) {
		boolean flag = true;
		String s = "[[[";
		char pc = 0;
		Stack<Character> st = new Stack<Character>();
		char[] ch = s.toCharArray();
		for (char c : ch) {
			if (c == '(' || c == '{' || c == '[') {
				st.push(c);
			} else {
				if (c == ')') {
					pc = '(';
				}

				else if (c == '}') {
					pc = '{';
				} else if (c == ']') {
					pc = '[';
				}

				if (pc != st.pop()) {
					flag = false;
					break;
				}

			}
		}
		if (!st.isEmpty()) {
			flag = false;
		}
		if (flag == true)
			System.out.println("Balanced");
		else
			System.out.println("Unbalanced");
	}
}
