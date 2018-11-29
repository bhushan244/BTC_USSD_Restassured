package array_examples;

public class Reverse_An_Array {
	public static void main(String[] args) {
		int[] arr = { 10, 25, 45, 78, 45, 87, 45,50 };
		int temp = 0;
		for (int i = 0; i < arr.length / 2; i++) {
			temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}

		for (int i : arr) {
			System.out.println(i);
		}
	}
}
