/*Program 2: Union of two list, return a list having all element one time.
 Hint : al2.removeAll(al1); al1.addAll(al2);
 output : [Maulik, Prasad, Krishna, Ritika, Suvela, Harsh, Rahul]*/
package poojap;

import java.util.ArrayList;

public class UnionOfElement_Collection {

	void unionElement(ArrayList<String> arraylist1, ArrayList<String> arraylist2) {
		arraylist2.removeAll(arraylist1);
		// System.out.println(""+arraylist2);
		arraylist1.addAll(arraylist2);
		System.out.println(" Union Of Element Is : " + arraylist1);
	}
	ArrayList<String> getUnionElementFromList(ArrayList<String> arraylist) {
		for (int i = 0; i < arraylist.size(); i++) {
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

		System.out.println(" First Arralist : " + arraylist1);
		System.out.println(" Second Arraylist : " + arraylist2);
		UnionOfElement_Collection unionOfElement_Collection = new UnionOfElement_Collection();
		unionOfElement_Collection.unionElement(unionOfElement_Collection.getUnionElementFromList(arraylist1),
				unionOfElement_Collection.getUnionElementFromList(arraylist2));
	}
}
