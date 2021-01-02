package technoCredits.collectionDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class LinkedListEx1 {
	
	synchronized void m1() {
		
	}
	
	
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Techno");
		
		List<String> list = new LinkedList<String>();
		list.add("Techno");
		list.add("credits");
		
		for(int index=0;index<list.size();index++) {
			System.out.println(list.get(index));
		}
		
		int index=0;
		while(index<list.size()) {
			System.out.println(list.get(index));
			index++;
		}
		
		index=0;
		do {
			System.out.println(list.get(index));
			index++;
		}while(index<list.size());
		
		for(String input : list) {
			System.out.println(input);
		}
		System.out.println("---------------------------------");
		LinkedList<String> list1 = new LinkedList<String>();
		list1.add("Hi");
		list1.add("Hello");
		list1.add("Techno");
		list1.add("Credits");
		list1.add("Milind");
		list1.add("Yogita");
		list1.add("Brijesh");
		
		/*Iterator<String> itr = list1.iterator();
		while(itr.hasNext()) {
			if(itr.next() != null)
				System.out.println(itr.next());
		}*/
		
		Iterator<String> itr = list1.iterator();
		while(itr.hasNext()) {
			String temp = itr.next();
			if(temp.length()<3)
				itr.remove();
		}
		
		System.out.println(list1);
		
		
		LinkedList<String> nameOfList = new LinkedList<String>(); // 0
		nameOfList.add("Vishakha");
		nameOfList.add("Rohan");
		nameOfList.add("Vihan");
		nameOfList.add("Maulik");
		
		System.out.println(nameOfList.contains("Rohan"));
		
	}
}
