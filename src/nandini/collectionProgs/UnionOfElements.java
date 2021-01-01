package nandini.collectionProgs;

import java.util.ArrayList;

public class UnionOfElements {
	
	public static void main(String args[]) {
	  ArrayList<String> newList = new ArrayList<String>();	
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
	  al2.removeAll(al1);
	  al1.addAll(al2);
	  for(String element : al1)
	  {
		if(!newList.contains(element))
			newList.add(element);
	  }
	 System.out.println(newList);
	 }
}
