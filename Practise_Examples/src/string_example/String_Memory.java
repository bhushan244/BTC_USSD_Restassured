package string_example;

public class String_Memory {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abc";
		String s3 = new String("abc");
		System.out.println(s1 == s2);// true --> string are created using
										// literals and
										// pointing to same memory location
		System.out.println(s1 == s3);// false-->Strings are not pointing to same
										// memory location

		System.out.println(s1.concat("Hi"));// Strings are immutable
		System.out.println(s1);// Strings are immutable
	}
}

interface a {
	public static void main(String[] args) {
		System.out.println("hi");
	}
}
