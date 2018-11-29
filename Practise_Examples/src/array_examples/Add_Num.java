package array_examples;

//Java Program To Find All Pairs Of Elements In An Array Whose Sum Is Equal To A Given Number :
public class Add_Num {
	public static void main(String[] args) {
		// int[] num = { 4, 6, 5, -10, 8, 5, 20 };
		int[] num = { 4, -5, 9, 11, 25, 13, 12, 8 };
		add_num(num, 20);

	}

	public static void add_num(int[] arr, int sum) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (i != j && (arr[i] + arr[j] == sum)) {
					System.out.println(arr[i] + " + " + arr[j] + " = " + (arr[i] + arr[j]));
				}
			}
		}
	}
}
