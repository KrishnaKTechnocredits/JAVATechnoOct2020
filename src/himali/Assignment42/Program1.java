package himali.Assignment42;

import java.util.ArrayList;

/*Program 1 : Retains all common elements between both list.
package Himali.Assignment42; */

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		al2.retainAll(al1);
System.out.println(al2);
	}
		 

	}


