package sadhana;

/*Assignment - 42 
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

import java.util.ArrayList;

public class CommonElementsInArray_42 {

	public void printData(ArrayList<String> arrList1,ArrayList<String> arrList2) {
		for(int index = 0; index < arrList1.size(); index++) {
			String name = arrList1.get(index);
			if(arrList1.indexOf(name) !=  arrList1.lastIndexOf(name)) {
				int arrayIndex = arrList1.lastIndexOf(name);
				arrList1.remove(arrayIndex);
			}
		}

		arrList1.retainAll(arrList2);
		System.out.println(arrList1);
	}

	public static void main(String[] args) {
		ArrayList<String> arrList1 = new ArrayList<String>();
		arrList1.add("Maulik");
		arrList1.add("Prasad");
		arrList1.add("Krishna");
		arrList1.add("Ritika");
		arrList1.add("Maulik");
		arrList1.add("Suvela");
		arrList1.add("Prasad");

		ArrayList<String> arrList2 = new ArrayList<String>();
		arrList2.add("Prasad");
		arrList2.add("Harsh");
		arrList2.add("Krishna");
		arrList2.add("Rahul");
		arrList2.add("Prasad");
		

		CommonElementsInArray_42 commonElementsInArray_42 = new CommonElementsInArray_42();
		commonElementsInArray_42.printData(arrList1, arrList2);
	}

}
