/*Program : 1 
WAP to print Reverse a given String.
input : This is technocredits
output : stiderconhcet si sihT  */

package shrutiS.assignment19;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseString {

	void reverseStringProcess(String word) {
		System.out.print("Reverse of given string : ");
		for (int index = word.length() - 1; index >= 0; index--) {
			System.out.print(word.charAt(index));
		}
	}

	public static void main(String[] args) {
		ReverseString reverseString = new ReverseString();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to reverse ");
		String input = sc.nextLine();
		// System.out.println("Input : " + input);
		reverseString.reverseStringProcess(input);
	}
}
