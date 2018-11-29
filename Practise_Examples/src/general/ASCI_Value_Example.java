package general;

public class ASCI_Value_Example {
public static void main(String[] args) {
	String s="abc";
	char[] c=s.toCharArray();
	for(char ch:c){
		System.out.println((char)(ch+3));
	}
	System.out.println((int)'x');
}
}
