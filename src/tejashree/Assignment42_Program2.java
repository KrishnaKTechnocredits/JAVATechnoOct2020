package tejashree;

import java.util.ArrayList;

/*ArrayList<String> al1 = new ArrayList<String>();
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

public class Assignment42_Program2 {
	
	static void unionOfTwoArrayList(ArrayList<String> li1,ArrayList<String> li2) {
		li2.removeAll(li1);
		li1.addAll(li2);
		System.out.println("Union of Above list elments:"+li1);
	}
	
	public static ArrayList<String> removeDuplicates(ArrayList<String> al) {
		for(int index=0;index<al.size();index++) {
			String word=al.get(index);
			int firstIndex=al.indexOf(word);
			int lastIndex=al.lastIndexOf(word);
			if(firstIndex!=lastIndex) {
				al.remove(lastIndex);
			}
		}
		return al;
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
		System.out.println(al1+"\n"+al2);
		Assignment42_Program2.unionOfTwoArrayList(Assignment42_Program2.removeDuplicates(al1), Assignment42_Program2.removeDuplicates(al2));
	}
}
