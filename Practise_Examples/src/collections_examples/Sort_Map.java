package collections_examples;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Sort_Map {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("a", "A");
		map.put("b", "B");
		map.put("c", "C");
		map.put("h", "H");
		map.put("y", "Y");
		map.put("i", "I");
		map.put("z", "Z");
		map.put("m", "M");
		map.put("e", "E");
		map.put("f", "F");
		map.put("g", "G");
		System.out.println("Unsorted Map " + map);

		TreeMap<String, String> tm = new TreeMap<String, String>(map);
		System.out.println("Sorted Map is" + tm);
	}

}
