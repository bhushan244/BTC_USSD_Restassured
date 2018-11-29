package array_examples;

public class Sub_array {
	public static void main(String[] args) {
		// int[] arr = { 12, 5, 31, 9, 21, 8 };int num = 45;//output=Sub Array
		// is {5,31,9}
		// int[] arr = { 42, 15, 12, 8, 6, 32 };int num = 26;//output={12,8,6}
		// int[] arr = { 12, 5, 31, 13, 21, 8 };int num = 49;//output={5 31 13}
		int[] arr = { 15, 51, 7, 81, 5, 11, 25 };
		int num = 41;// output={5,11,25}
		int[] sub_arr = sub_array(arr, num);
		/*System.out.print("Sub Array is {" + arr[sub_arr[0]]);
		for (int i = sub_arr[0] + 1; i <= sub_arr[1]; i++) {
			System.out.print("," + arr[i]);
		}
		System.out.print("}");*/
	}

	public static int[] sub_array(int[] arr, int num) {
		int sum = 0;
		boolean flag = false;
		int[] sub_arr = new int[2];
		for (int i = 0; i < arr.length; i++) {
			sum = arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				sum = sum + arr[j];
				if (sum == num) {
					sub_arr[0] = i;
					sub_arr[1] = j;
					flag = true;
					for (int k = i; k <= j; k++) {
						System.out.print(arr[k] + " ");
					}
					break;
				} else if (sum > num) {
					break;
				}
			}
			if (flag == true) {
				break;
			}
		}
		return sub_arr;

	}
}
