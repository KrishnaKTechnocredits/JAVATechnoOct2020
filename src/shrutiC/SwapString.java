package shrutiC;

import java.util.Scanner;

/*
 * Program : 1 
	swap 2 numbers with using 3rd variable

 * Program : 2 
	swap 2 numbers without using 3rd variable
*/
public class SwapString {

	// Swaping Strings with using 3rd variable
	void swapStringWithVariable(String string1, String string2) {

		String temp = "";
		System.out.println("Swap String with 3rd variable------------------------------------------------");
		System.out.println("Strings before swap operation :-");
		System.out.println("String 1 - " + string1);
		System.out.println("String 2 - " + string2);

		temp = string1;
		string1 = string2;
		string2 = temp;

		System.out.println("Strings after swap operation :-");
		System.out.println("String 1 - " + string1);
		System.out.println("String 2 - " + string2);

	}

	// Swaping Strings without using 3rd variable - Use substring method of
	// string class
	void swapStringWithOutVariable(String string1, String string2) {

		System.out.println("Swap String w/o 3rd variable------------------------------------------------");
		System.out.println("Strings before swap operation :-");
		System.out.println("String 1 - " + string1);
		System.out.println("String 2 - " + string2);

		int lengthString1 = string1.length();
		string1 = string1 + string2;
		string2 = string1.substring(0, lengthString1);
		string1 = string1.substring(lengthString1);

		System.out.println("Strings after swap operation :-");
		System.out.println("String 1 - " + string1);
		System.out.println("String 2 - " + string2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwapString object = new SwapString();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first string - ");
		String string1 = scanner.next();
		System.out.println("");
		System.out.print("Enter second string - ");
		String string2 = scanner.next();

		// Swap String with 3rd variable
		object.swapStringWithVariable(string1, string2);
		System.out.println("");
		object.swapStringWithOutVariable(string1, string2);
	}

}
