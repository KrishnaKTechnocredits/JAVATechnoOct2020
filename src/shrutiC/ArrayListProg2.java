package shrutiC;

import java.util.ArrayList;

public class ArrayListProg2 {

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

		// Program 2: Union of two list, return a list having all element one
		// time.
		System.out.println("List 1 : " + al1);
		System.out.println("List 2 : " + al2);
		al2.removeAll(al1);
		al1.addAll(al2);
		for (int i = 0; i < al1.size(); i++) {
			String name = al1.get(i);
			if (al1.indexOf(name) != al1.lastIndexOf(name)) {
				al1.remove(name);
			}
		}
		System.out.println("Union : " + al1);
	}

}
