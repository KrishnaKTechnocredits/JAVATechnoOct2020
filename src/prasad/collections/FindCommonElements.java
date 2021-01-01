package prasad.collections;

import java.util.ArrayList;

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
output : [Prasad, Krishna]*/

public class FindCommonElements {
	ArrayList<String>scanList(ArrayList<String>list){
		for(int index=0;index<list.size();index++) {
			String word = list.get(index);
			if(list.indexOf(word)!= list.lastIndexOf(word)) {
				list.remove(word);
			}
		}
		
		return list;
	}
	public static void main(String[]arg) {
		FindCommonElements findcommonelements = new FindCommonElements();
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
		System.out.println("al1: " + al1);
		System.out.println("al2: " + al2);
		System.out.println("");
		System.out.println("Common elements in between al1 & al2:-");
		al1.retainAll(al2);
		System.out.println(al1);
		System.out.println("");
		System.out.println("Removing Duplicates:-");
		ArrayList<String> output = findcommonelements.scanList(al1);
		System.out.println("Output:- "+  output);
	}
}
