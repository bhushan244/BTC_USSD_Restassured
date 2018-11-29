package array_examples;

public class Largest_Smallest_In_Array {
	public static void main(String[] args) {
		int[] arr = { 10, 45, 15, 89, 4, 5, 15, 15, 2, 0 };
		int largest = arr[0];
		int smallest = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			} else if (arr[i] < smallest) {
				smallest = arr[i];
			}
		}
		System.out.println("Largest=" + largest);
		System.out.println("Smallest=" + smallest);
	}
}
