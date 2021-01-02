/*Assignment - 42 : 

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
output : [Prasad, Krishna]*/

package kajol;


import java.util.ArrayList;

public class IntersectionofTwoLists {
	
	static ArrayList<String> findintersection(ArrayList<String> list1,ArrayList<String> list2){
		System.out.println("List 1: "+list1);
		System.out.println("List 2: "+list2);
		list1.retainAll(list2);
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
		al2.add("Rahul");
		al2.add("Prasad");
		
		ArrayList<String> intersectionList=IntersectionofTwoLists.findintersection(al1, al2);
		System.out.print("Intersection of Two Lists: ");
		System.out.println(intersectionList);
		
	}

}
