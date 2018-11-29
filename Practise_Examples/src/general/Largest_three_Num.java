package general;

import org.testng.annotations.Test;

public class Largest_three_Num {
	@Test
	public void test1() {
		int x = 10, y = 20, z = 500;
		System.out.println((x > y && x > z ? x : (y > x && y > z ? y : z)));
	}
}
