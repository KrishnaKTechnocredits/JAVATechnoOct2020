package technoCredits.collectionDemo;

import java.util.ArrayList;

public class ArrayListEx6 {

	public static void main(String[] args) {
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("Maulik");
		al1.add("Krishna");
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Harsh");
		al2.add("Krishna");
		
		System.out.println(al1);
		al1.addAll(al2);
		System.out.println(al1);
		System.out.println(al2);
		
		ArrayList<String> al3 = new ArrayList<String>();
		al3.add("Maulik");
		al3.add("Krishna");
		al3.add("Krishna");
		
		ArrayList<String> al4 = new ArrayList<String>();
		al4.add("Harsh");
		al4.add("Krishna");
		
		al3.retainAll(al4);
		System.out.println(al3);
	}
}
