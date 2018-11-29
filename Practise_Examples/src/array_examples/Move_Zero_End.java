package array_examples;

import org.testng.annotations.Test;

//programm to move all zeros to the end of the array.
public class Move_Zero_End {
	public static void main(String[] args) {
		int[] arr = { 14, 0, 5, 2, 0, 3, 0 };
		int count = 0;
		int j = 0;
		int[] output = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				output[j++] = arr[i];
				count++;
			}
		}
		for (int i = output.length - count + 1; i < output.length; i++) {
			output[i] = 0;
		}
		for (int i : output) {
			System.out.println(i);
		}
	}

	@Test
	public void move_zero() {
		int[] input = { 0, 12, 3, 0, 4, 5, 0, 0, 8, 8, 9 };
		int count = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] != 0) {
				input[count++] = input[i];
			}
		}
		while (count < input.length) {
			input[count++] = 0;
		}
		for (int i : input) {
			System.out.println(i);
		}
	}

	// Move Zeros To Begining
	@Test
	public void move0_Begining() {
		int[] input = { 0, 12, 3, 0, 4, 5, 0, 0, 8, 8, 9 };
		int count = input.length - 1;
		for (int i = input.length - 1; i >= 0; i--) {
			if (input[i] != 0) {
				input[count--] = input[i];
			}
		}

		while (count >= 0) {
			input[count--] = 0;
		}

		for (int i : input) {
			System.out.println(i);
		}
	}
}
