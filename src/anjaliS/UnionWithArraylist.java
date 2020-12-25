package anjaliS;

import java.util.ArrayList;

public class UnionWithArraylist {
	ArrayList<String> removeAllduplicate(ArrayList<String> arraylist) {
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
		arraylist1.addAll(arraylist2);
		UnionWithArraylist UnionWithArraylist = new UnionWithArraylist();
		ArrayList<String> UnionArray = UnionWithArraylist.removeAllduplicate(arraylist1);
		System.out.println("Union of two array is: " + UnionArray);
	}

}
