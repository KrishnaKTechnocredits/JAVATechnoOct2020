package technoCredits.collectionDemo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx9 {
	
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Krishna");
		al.add("Aashvi");
		al.add("Kanani");
		al.add("Techno");
		al.add("Credits");
		al.add("Maulik");
		
		Collections.sort(al);
		System.out.println(al);
	}
}
