package nagendra.CollectionFramework;

import java.util.ArrayList;

/*
Program 1 : Retains all common elements between both list.
output : [Prasad, Krishna]

*/

public class RetainCommonElement {

	public static void main(String[] args) {

		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("Maulik");
		al1.add("Prasad");
		al1.add("Krishna");
		al1.add("Ritika");
		al1.add("Suvela");
		al1.add("Prasad");

		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Harsh");
		al2.add("Krishna");
		al2.add("Rahul");
		al2.add("Prasad");
		
		al2.retainAll(al1);
		System.out.println(al2);
	}

}
