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
package deepak.assignment42;

import java.util.ArrayList;

public class UnionOfTwoArrayList {

	public static ArrayList<String> getUnion(ArrayList<String> al1, ArrayList<String> al2) {
		System.out.println(al1);
		System.out.println(al2);
		System.out.print("Union:");
		al1.removeAll(al2);
		al1.addAll(al2);
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
		al2.add("Rahul");
		al2.add("Prasad");

		System.out.println(getUnion(al1, al2));
	}
}
