package array_examples;

import org.testng.annotations.Test;

public class Bubble_Sort {
	// Sort in Ascending Order
	public static void main(String[] args) {
		// int[] arr = { 100, 20,20, 15, 30, 5, 75, 40,10,30,75,-5 };
		int[] arr = { 100, 20, 15, 30, 5, 75, 40 };
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i : arr) {
			System.out.println(i);
		}
	}

	// This is called Bubble Sort
	@Test
	public void test1() {
		int[] arr = { 100, 20, 15, 30, 5, 75, 40 };
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < (arr.length - 1) - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
			}
		}
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
