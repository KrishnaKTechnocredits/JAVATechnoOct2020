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

package kajol;

import java.util.ArrayList;

public class UnionOfTwoLists {
	
	static ArrayList<String> findUnion(ArrayList<String> list1,ArrayList<String> list2){
		System.out.println("List 1: "+list1);
		System.out.println("List 2: "+list2);
		list2.removeAll(list1);
		list1.addAll(list2);
		for(int index=0;index<list1.size();index++) {
			if(list1.lastIndexOf(list1.get(index))!=list1.indexOf(list1.get(index)))
					list1.remove(list1.get(index));
		}	
		return list1;	
	}
	
	public static void main(String[] args) {
		ArrayList<String> al1=new ArrayList<>();
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
		
		ArrayList<String> unionList=UnionOfTwoLists.findUnion(al1, al2);
		System.out.print("Union of Two Lists: ");
		System.out.println(unionList);
	}		
}
