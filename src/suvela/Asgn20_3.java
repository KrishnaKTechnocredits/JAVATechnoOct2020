/*Program : 3 
swap 2 String with using 3rd variable*/
package suvela;

import java.util.Scanner;

public class Asgn20_3 {
	void swapStrings(String string1,String string2) {
		String temp;
		temp= string1;
		string1= string2;
		string2=temp;
		System.out.println("Swapped strings are:" + string1 +" "+string2);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter string 1:");
		String string1= scan.next();
		System.out.println("Enter string 2:");
		String string2= scan.next();
		System.out.println("Unswapped strings are: " +string1 + " "+string2);
		Asgn20_3 assign= new Asgn20_3();
		assign.swapStrings(string1, string2);
	}

}
