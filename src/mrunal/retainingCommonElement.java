/*
Program 1 : Retains all common elements between both list.
output : [Prasad, Krishna]
*/
package mrunal;
import java.util.ArrayList;

public class retainingCommonElement {

	public static void main(String[] args) {
		
		ArrayList<String> arraylist1 = new ArrayList<String>();
		arraylist1.add("mrunal");
		arraylist1.add("hemant");
		arraylist1.add("kumar");
		arraylist1.add("yadav");
		arraylist1.add("drishti");
		arraylist1.add("arpita");

		ArrayList<String> arraylist2 = new ArrayList<String>();
		arraylist2.add("mrunal");
		arraylist2.add("dravya");
		arraylist2.add("drishti");
		arraylist2.add("hrudra");

		arraylist2.retainAll(arraylist1);
		System.out.println(arraylist2);
	}

}
