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
output : [Prasad, Krishna]
*/
package deepak.assignment42;

import java.util.ArrayList;

public class FindDuplicateFromTwoArrayList {
	public static ArrayList<String> getCommonElement(ArrayList<String> aL1, ArrayList<String> aL2) {
		System.out.println(aL1);
		System.out.println(aL2);
		aL1.retainAll(aL2);
		System.out.print("Common Elements:");
		for (int i = 0; i < aL1.size(); i++) {
			String name = aL1.get(i);
			if (aL1.indexOf(name) != aL1.lastIndexOf(name))
				aL1.remove(i);
		}
		return aL1;
	}

	public static void main(String[] args) {
		ArrayList<String> aL1 = new ArrayList<String>();
		aL1.add("Maulik");
		aL1.add("Prasad");
		aL1.add("Krishna");
		aL1.add("Ritika");
		aL1.add("Suvela");
		aL1.add("Prasad");
		ArrayList<String> aL2 = new ArrayList<String>();
		aL2.add("Harsh");
		aL2.add("Krishna");
		aL2.add("Rahul");
		aL2.add("Prasad");

		System.out.println(getCommonElement(aL1, aL2));
	}
}