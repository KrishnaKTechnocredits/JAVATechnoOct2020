package tejashree;

import java.util.ArrayList;

/*Program 1 : Retains all common elements between both list.
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
Hint : al1.retainsAll(al2); 		
output : [Prasad, Krishna]*/
public class Assignment42_Program1 {

	static void displayCommonElements(ArrayList<String> li1CommonEle, ArrayList<String> li2CommonEle) {
		li1CommonEle.retainAll(li2CommonEle);
		System.out.println("Common elements in list are " + li1CommonEle);
	}

	public static ArrayList<String> removeDuplicates(ArrayList<String> li) {
		for (int index = 0; index < li.size(); index++) {
			String word = li.get(index);
			int firstIndex = li.indexOf(word);
			int lastIndex = li.lastIndexOf(word);
			if (firstIndex != lastIndex) {
				li.remove(lastIndex);
			}
		}
		return li;
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
		System.out.println("List1 " + al1 + " " + "\n"+"List2 " + al2);
		Assignment42_Program1.displayCommonElements(Assignment42_Program1.removeDuplicates(al1),
				Assignment42_Program1.removeDuplicates(al2));
	}
}
