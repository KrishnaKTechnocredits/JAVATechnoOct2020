/*Program 2: Union of two list, return a list having all element one time.
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
Hint : al2.removeAll(al1); al1.addAll(al2);
output : [Maulik, Prasad, Krishna, Ritika, Suvela, Harsh, Rahul]
*/

package yogita;

import java.util.ArrayList;

public class UnionArrayUsingCollection {

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

		al1.addAll(al2);
		System.out.println("\nUnion Of Both Array:\n" + al1);

		ArrayList<String> finalArray = UnionArrayUsingCollection.removeDuplicate(al1);
		System.out.println("\nFinal Array:\n" + finalArray);

	}
}
