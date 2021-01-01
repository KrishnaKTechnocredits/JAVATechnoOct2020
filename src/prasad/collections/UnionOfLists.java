package prasad.collections;

import java.util.ArrayList;

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

public class UnionOfLists {
	ArrayList<String> scanList(ArrayList<String>list){
		for(int index=0;index<list.size();index++) {
			String word=list.get(index);
			if(list.indexOf(word)!=list.lastIndexOf(word)) {
				list.remove(word);
			}
		}
		
		return list;
	}

	public static void main(String[]arg) {
		UnionOfLists unionoflists = new UnionOfLists();
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("Maulik");
		al1.add("Prasad");
		al1.add("Krishna");
		al1.add("Ritika");
		al1.add("Suvela");
		al1.add("Prasad");
		
		ArrayList<String>al2 = new ArrayList<String>();
		al2.add("Harsh");
		al2.add("Krishna");
		al2.add("Rahul");
		al2.add("Prasad");
		
		System.out.println("al1: "+ al1);
		System.out.println("al2: "+ al2);
		System.out.println("");
		al1.addAll(al2);
		System.out.println("al1 U al2 (with duplicates): " + al1);
		ArrayList<String>output = unionoflists.scanList(al1);
		System.out.println("al1 U al2 (without duplicates): " + output);
	}
}
