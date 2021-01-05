package sadhana;

/*Assignment - 42 
Program 2: Union of two list, return a list having all element one time.

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
		
output : [Maulik, Prasad, Krishna, Ritika, Suvela, Harsh, Rahul]*/

import java.util.ArrayList;

public class UnionArray_42 {

	public void printData(ArrayList<String> al1, ArrayList<String> al2) {
		for(int index = 0; index < al1.size(); index++) {
			String name = al1.get(index);
			if(al1.indexOf(name) !=  al1.lastIndexOf(name)) {
				int arrayIndex = al1.lastIndexOf(name);
				al1.remove(arrayIndex);
			}
		}
		al2.removeAll(al1);
		al1.addAll(al2);
		System.out.println(al1);
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
		al1.add("Rahul");
		al1.add("Prasad");

		UnionArray_42 unionArray_42 = new UnionArray_42();
		unionArray_42.printData(al1, al2);
	}

}