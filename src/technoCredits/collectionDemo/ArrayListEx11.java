package technoCredits.collectionDemo;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class ArrayListEx11 {
	
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Brijesh");
		al.add("Yogita");
		al.add("Anjali");
		al.add("Pooja");
		al.add("Yogita");
		al.add("Brijesh");
		
		LinkedHashSet<String> hs = new LinkedHashSet<String>(al);
		System.out.println(hs);
	}
}
