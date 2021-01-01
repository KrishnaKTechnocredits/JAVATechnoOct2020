package anjaliS;

import java.util.ArrayList;

public class IntersectionWithArraylist {
	ArrayList<String> removeDuplicateValue(ArrayList<String> arraylist) {
		for (int index = 0; index < arraylist.size(); index++) {
			String word = arraylist.get(index);
			if (arraylist.indexOf(word) != arraylist.lastIndexOf(word)) {
				arraylist.remove(word);
			}
		}
		return arraylist;
	}

	public static void main(String[] args) {
		ArrayList<String> arraylist1 = new ArrayList<String>();
		arraylist1.add("Maulik");
		arraylist1.add("Harsh");
		arraylist1.add("Krishna");
		arraylist1.add("Harsh");

		ArrayList<String> arraylist2 = new ArrayList<String>();
		arraylist2.add("Harsh");
		arraylist2.add("Maulik");
		arraylist2.add("Anjali");

		arraylist1.retainAll(arraylist2);

		IntersectionWithArraylist interwitharraylist = new IntersectionWithArraylist();
		ArrayList<String> intersectionArray = interwitharraylist.removeDuplicateValue(arraylist1);
		System.out.println("Intersection of two array: " + intersectionArray);

	}

}
