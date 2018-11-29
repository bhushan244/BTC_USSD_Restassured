package collections_examples;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.testng.annotations.Test;

public class List_Example2 {
	@Test
	public void test1() {
		List list = new ArrayList<String>();
		
		System.out.println(list.size());
	}
	@Test
	public void test2(){
		LinkedList<String>l=new LinkedList<String>();
	}
}
