package vaibhav.assignment42;

/**
 Program 1 : Retains all common elements between both list.

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

import java.util.ArrayList;

public class RetainAllElement {
	
	public static void removeDuplicate(ArrayList<String> al1) {
		for(int index = 0 ; index < al1.size();index++) {
			String str = al1.get(index);
			if (al1.indexOf(str) != al1.lastIndexOf(str)) {
				al1.remove(str);
			}			
		}
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
		al2.add("Rahul");
		al2.add("Prasad");
		
		al1.retainAll(al2);
		RetainAllElement.removeDuplicate(al1);
	}
}
