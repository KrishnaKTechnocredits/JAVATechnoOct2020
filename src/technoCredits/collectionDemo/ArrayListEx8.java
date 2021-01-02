package technoCredits.collectionDemo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx8 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(18);
		al.add(1);
		al.add(7);
		
		Collections.sort(al);
		
		System.out.println(al);
	}
}
