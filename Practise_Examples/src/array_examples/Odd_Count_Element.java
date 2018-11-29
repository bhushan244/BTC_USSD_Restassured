package array_examples;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.testng.annotations.Test;

//pgm to count which element is there odd number of times
public class Odd_Count_Element {
	@Test
	public void test1() {
		int[] a = { 10, 20, 12, 23, 20, 12, 23, 10, 10 };
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
			if (map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i]) + 1);
			} else {
				map.put(a[i], 1);
			}
		}

		Set<Entry<Integer, Integer>> s = map.entrySet();
		for (Entry<Integer, Integer> e : s) {
			if (e.getValue() % 2 != 0) {
				System.out.println(e.getKey() + " is repeated odd number of times");
			}
		}
	}

	@Test
	public void test2() {
		int[] a = { 10, 20, 12, 23, 20, 12, 23, 10, 10};
		int result = 0;
		for (int i = 0; i < a.length; i++) {
			result = result ^ a[i];
		}
		System.out.println("Repeated Element is " + result);
	}
}
