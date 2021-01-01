/*Program 1 : Retains all common elements between both list.*/

package poojap;

import java.util.ArrayList;

public class IntersectionOfElement_Collection {
	ArrayList<String> findIntersectionElement(ArrayList<String> arraylist) {
		for(int i = 0; i < arraylist.size(); i++) {
			String string = arraylist.get(i);
			if (arraylist.indexOf(string) != arraylist.lastIndexOf(string)) {
				arraylist.remove(string);
			}
		}
		return arraylist;
	}

	public static void main(String[] args) {
		ArrayList<String> arraylist1 = new ArrayList<String>();
		arraylist1.add("Maulik");
		arraylist1.add("Prasad");
		arraylist1.add("Krishna");
		arraylist1.add("Ritika");
		arraylist1.add("Suvela");
		arraylist1.add("Prasad");

		ArrayList<String> arraylist2 = new ArrayList<String>();
		arraylist2.add("Harsh");
		arraylist2.add("Krishna");
		arraylist2.add("Rahul");
		arraylist2.add("Prasad");

		System.out.println(" First Arraylist : " + arraylist1);
		System.out.println(" Second Arralist : " + arraylist2);

		arraylist1.retainAll(arraylist2);
		// System.out.println("Common Element From Both Array");
		// System.out.println(arraylist1);
		IntersectionOfElement_Collection intersectionOfElement_Collection = new IntersectionOfElement_Collection();
		ArrayList<String> array = intersectionOfElement_Collection.findIntersectionElement(arraylist1);
		System.out.println(" Common Element : " + array);
	}
}
