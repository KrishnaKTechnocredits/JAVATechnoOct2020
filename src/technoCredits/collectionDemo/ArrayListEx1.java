package technoCredits.collectionDemo;

import java.util.ArrayList;

public class ArrayListEx1 {

	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		arrayList.add(1); //0
		arrayList.add("Maulik");
		arrayList.add(10.29);
		arrayList.add('c');
		arrayList.add(1);
		
		System.out.println(arrayList.get(0));
		
		System.out.println("Total elements " + arrayList.size());
		System.out.println(arrayList.toString());
		
		for(int index=0; index<arrayList.size(); index++) {
			System.out.println(arrayList.get(index));
		}
	}
}
