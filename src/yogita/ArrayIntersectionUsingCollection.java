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

package yogita;

import java.util.ArrayList;

public class ArrayIntersectionUsingCollection {

	public static ArrayList<String> removeDuplicate(ArrayList<String> arrayList) {
		for (int i = 0; i < arrayList.size(); i++) {
			String name = arrayList.get(i);
			if (arrayList.indexOf(name) != arrayList.lastIndexOf(name)) {
				arrayList.remove(name);
			}
		}
		return arrayList;
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

		System.out.println("First Array:" + al1);
		System.out.println("\nSecond Array:" + al2);

		al1.retainAll(al2);
		System.out.println("\nCommon Elements from Both Array");
		System.out.println(al1);

		ArrayList<String> finalArray = ArrayIntersectionUsingCollection.removeDuplicate(al1);
		System.out.println("\nFinal Array");
		System.out.println(finalArray);

	}
}
