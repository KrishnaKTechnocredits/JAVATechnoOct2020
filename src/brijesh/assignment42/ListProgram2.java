package brijesh.assignment42;

import java.util.ArrayList;

/*
Program 2: Union of two list, return a list having all element one time.
*/

public class ListProgram2 {

	public ArrayList<String> unionOfList(ArrayList<String> al1, ArrayList<String> al2) {
		System.out.println(al1+"\n"+al2);
		al2.removeAll(al1);
		al1.addAll(al2);
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
		al1.add("Rahul");
		al1.add("Prasad");
		System.out.println("Union of above two list: "+new ListProgram2().unionOfList(al1, al2));
	}
}
