/*Program 1 : Retains all common elements between both list.

ArrayList<String> al1 = new ArrayList<String>();
al1.add("Maulik
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
package suvela.assignemnt42.prog1;

import java.util.ArrayList;

public class Intersection {
	public ArrayList<String> intersection() {

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
		System.out.println("List 1:" +al1);
		System.out.println("List 2:" +al2);
		
		
		for(String name:al1) {
			if(al1.indexOf(name)!= al1.lastIndexOf(name)) {
				al1.remove(name);
				al1.retainAll(al2);
			}
		}
		
		return al1;
	}

	public static void main(String[] args) {
		ArrayList<String> list = new Intersection().intersection();
		System.out.print("Intersection of two lists:");
		System.out.println(list);
	}

}
/*for (int i = 0; i < al1.size(); i++) {
			String name = al1.get(i);
			if (al1.indexOf(name) != (al1.lastIndexOf(name)))
				al1.remove(name);
		}*/