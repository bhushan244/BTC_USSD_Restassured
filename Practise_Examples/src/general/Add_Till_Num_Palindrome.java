package general;
//How To Reverse And Add A Number Until You Get A Palindrome?
public class Add_Till_Num_Palindrome {
	public static void main(String[] args) {
		add_till_palindrome(7325);
	}

	public static void add_till_palindrome(int num) {
		boolean flag = true;
		while (flag) {
			int rev = reverse(num);
			if (num == rev) {
				System.out.println("Numbers are palindrome at" + num + " and " + rev);
				flag = true;
				break;
			} else {
				num = num + rev;
			}
		}
	}

	public static int reverse(int num) {
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + (num % 10);
			num = num / 10;
		}
		return rev;
	}
}
