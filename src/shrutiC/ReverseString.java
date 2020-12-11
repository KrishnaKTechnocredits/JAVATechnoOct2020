package shrutiC;
/*
	Program : 1 
	WAP to print Reverse a given String.
	input : This is technocredits
	output : stiderconhcet si sihT  
*/

import java.util.Scanner;

public class ReverseString {

	void reverseASentence(String input) {

		String reversedSentence = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			reversedSentence = reversedSentence + input.charAt(index);
		}
		System.out.println("Reversed String is : " + reversedSentence);
	}

	public static void main(String[] args) {

		ReverseString object = new ReverseString();
		System.out.println("Enter the sentence to be reversed : ");

		Scanner scanner = new Scanner(System.in); //This is technocredits
		String input = scanner.nextLine();
		object.reverseASentence(input);
	}

}
