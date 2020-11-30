package priyanka.Assignment20;

/*Program : 4 
swap 2 String without using 3rd variable
Hint : use SubString method of String class
*/

import java.util.Scanner;

public class SwapStringWithout3rdVar {
	
		void swapString(String a, String b) {
			System.out.println("The values of string1 and string 2 before swapping are: " + a + " " + b);
			a = a + b;
			b = a.substring(0,a.length() - b.length());
			a = a.substring(b.length());
			System.out.println("The values of string1 and string 2 after swapping are: " + a + " " + b);
		}

		public static void main(String[] arg) {
			SwapStringWithout3rdVar swapStringWithout3rdVar = new SwapStringWithout3rdVar();
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter first string");
			String a = scanner.next();
			System.out.println("Enter second string");
			String b = scanner.next();
			swapStringWithout3rdVar.swapString(a, b);
		}
}