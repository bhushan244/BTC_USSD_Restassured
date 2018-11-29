package array_examples;

//find the msissing numbers in duplicated array of 1 to N-1
public class Missing_Number_Duplicated_Array {
	public static void main(String[] args) {
		int[] num = { 1, 1, 2, 4, 5, 7, 8, 8, 5, 10 };
		int[] arr = new int[num.length + 1];
		for (int i : num) {
			arr[i] = 1;

		}
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == 0)
				System.out.println("Msissing Number is " + i);
		}
	}
}
