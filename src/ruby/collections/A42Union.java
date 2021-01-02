package ruby.collections;

import java.util.ArrayList;

/*Assignment - 42 : 20th Dec'2020

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

public class A42Union {
	
	static ArrayList<String> findAllElements(ArrayList<String> al1, ArrayList<String> al2) {
		System.out.println("Input String1: "+al1);
		System.out.println("Input String2: "+al2);
		al2.removeAll(al1);
		al1.addAll(al2);
		for(int index=0; index<al1.size();index++) {
			String name = al1.get(index);
			if(al1.indexOf(name) != al1.lastIndexOf(name) ) {
				al1.remove(name);
			}
		}
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
		al1.add("Rahul");
		al1.add("Prasad");
		
		System.out.println("Output: "+A42Union.findAllElements(al1, al2));
	}
}
