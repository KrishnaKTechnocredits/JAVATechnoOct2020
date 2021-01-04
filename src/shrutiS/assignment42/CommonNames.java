/*Assignment - 42
Program 1 : Retains all common elements between both list.
output : [Prasad, Krishna]
*/
package shrutiS.assignment42;

import java.util.ArrayList;

public class CommonNames {
	
	public ArrayList<String> retainAllCommonNames(ArrayList<String> aL1, ArrayList<String> aL2){
		System.out.println("List 1 : "+aL1+"\nList 2 : "+aL2);
		aL1.retainAll(aL2);
		for(int index=0;index<aL1.size();index++) {
			String name=aL1.get(index);
			if(aL1.indexOf(name) != aL1.lastIndexOf(name))
				aL1.remove(name);
		}
		return aL1;
	}
	public static void main(String[] args) {
		ArrayList<String> aL1=new ArrayList<String>();
		aL1.add("Maulik");
		aL1.add("Prasad");
		aL1.add("Krishna");
		aL1.add("Ritika");
		aL1.add("Suvela");
		aL1.add("Prasad");
				
		ArrayList<String> aL2 = new ArrayList<String>();
		aL2.add("Harsh");
		aL2.add("Krishna");
		aL2.add("Rahul");
		aL2.add("Prasad");
		System.out.println("Common Names in both list : "+new CommonNames().retainAllCommonNames(aL1, aL2));
	}

}
