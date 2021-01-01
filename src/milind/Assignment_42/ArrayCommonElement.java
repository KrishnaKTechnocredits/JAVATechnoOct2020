package milind.Assignment_42;

import java.util.ArrayList;

public class ArrayCommonElement {
	
	public void commonElement(ArrayList<String> al1,ArrayList<String> al2) {
		for(int index = 0; index < al1.size(); index++) {
			String name = al1.get(index);
			if(al1.indexOf(name) !=  al1.lastIndexOf(name)) {
				int arrayIndex = al1.lastIndexOf(name);
				al1.remove(arrayIndex);
			}
		}
		
		al1.retainAll(al2);
		System.out.println(al1);
	}
	
	public static void main(String[] args) {
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("Maulik");
		al1.add("Prasad");
		al1.add("Krishna");
		al1.add("Ritika");
		al1.add("Maulik");
		al1.add("Suvela");
		al1.add("Prasad");
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Prasad");
		al2.add("Harsh");
		al2.add("Krishna");
		al2.add("Rahul");
		al2.add("Prasad");
		al2.add("Maulik");
		
		ArrayCommonElement arrayCommonElement = new ArrayCommonElement();
		arrayCommonElement.commonElement(al1, al2);
	}

}
