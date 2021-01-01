/*
Program 2: Union of two list, return a list having all element one time.
*/
package mrunal;
import java.util.ArrayList;


public class unionFromList {
	
	ArrayList<String>  findUnionOfArray(ArrayList<String> al){
		for(int i=0;i<al.size();i++){
			String temp=al.get(i);
			if(al.indexOf(temp)!=al.lastIndexOf(temp)){
				al.remove(temp);
			}
		}
		return al;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		unionFromList arraylist =new unionFromList();
		ArrayList<String> arraylist1 = new ArrayList<String>();
		arraylist1.add("apple");
		arraylist1.add("ball");
		arraylist1.add("cat");
		arraylist1.add("eight");
		arraylist1.add("half");
		arraylist1.add("goa");

		ArrayList<String> arraylist2 = new ArrayList<String>();
		arraylist2.add("goa");
		arraylist2.add("ball");
		arraylist2.add("null");
		arraylist2.add("print");
		
		arraylist1=arraylist.findUnionOfArray(arraylist1);
		arraylist2.removeAll(arraylist1);
		arraylist1.addAll(arraylist2);
		System.out.println(arraylist1);
	}
}