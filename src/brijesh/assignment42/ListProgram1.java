package brijesh.assignment42;

import java.util.ArrayList;

/*
Program 1 : Retains all common elements between both list. 
*/

public class ListProgram1 {

	public ArrayList<String> retainsAllCommonElements(ArrayList<String> al1, ArrayList<String> al2) {
		System.out.println(al1+"\n"+al2);
		al1.retainAll(al2);
		for (int index = 0; index < al1.size(); index++) {
			String element= al1.get(index);
			if(al1.indexOf(element) !=al1.lastIndexOf(element))
				al1.remove(element);
		}
		return al1;
	}

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
		al2.add("Krishna");
		System.out.println("Intersection of above two list: "+new ListProgram1().retainsAllCommonElements(al1, al2));
	}
}
