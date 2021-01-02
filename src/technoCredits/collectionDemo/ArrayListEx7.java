package technoCredits.collectionDemo;

import java.util.ArrayList;

public class ArrayListEx7 {

	public static void main(String[] args) {
		ArrayList<String> al1 = new ArrayList<String>();
		
		al1.add("Maulik");
		al1.add("Prasad");
		al1.add("Krishna");
		al1.add("Ritika");
		al1.add("Suvela");
		al1.add("Prasad");
		
		ArrayList<String> al2 = new ArrayList<String>(al1);
		al1.clear();
		System.out.println(al2.size());
	}
}
