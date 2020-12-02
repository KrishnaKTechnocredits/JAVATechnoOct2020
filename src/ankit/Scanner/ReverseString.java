/*
 * Assignment 19: Reverse a given String.
 */
package ankit.Scanner;

import java.util.Scanner;

public class ReverseString {
		void stringreverse(String input) {
			String reverse="";
			for(int index=input.length()-1;index>=0;index--) {
				reverse = reverse + input.charAt(index);
			}
			System.out.println("Reverse String value is: " +reverse);
		}
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the given string to reverse the value: ");
			String input= scanner.nextLine();
			ReverseString reverse=new ReverseString();
			reverse.stringreverse(input);
			scanner.close();
		}
}
