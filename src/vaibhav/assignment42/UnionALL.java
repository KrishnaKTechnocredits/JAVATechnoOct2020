package vaibhav.assignment42;

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
		
output : [Maulik, Prasad, Krishna, Ritika, Suvela, Harsh, Rahul]*/


import java.util.ArrayList;

public class UnionALL {
	
	public static void removeDuplicate(ArrayList<String> al1) {
		for(int index = 0 ; index < al1.size();index++) {
			String str = al1.get(index);
			if (al1.indexOf(str) != al1.lastIndexOf(str)) {
				int temp =al1.lastIndexOf(str);				
				al1.remove(temp);
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
		
		al2.removeAll(al1);
		al1.addAll(al2);
		UnionALL.removeDuplicate(al1);
	}
}
