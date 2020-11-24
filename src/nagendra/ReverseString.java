package nagendra;

import java.util.Scanner;

/*
WAP to print Reverse a given String.
input : This is technocredits
output : stiderconhcet si sihT  
*/
public class ReverseString {

	void getReverseString(String input) {
		String reverseString = "";
		for (int i = input.length() - 1; i >= 0; i--)
			reverseString += input.charAt(i);
		System.out.println("The Reverse of String is:" + reverseString);
	}

	public static void main(String[] args) {

		ReverseString reverse = new ReverseString();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The String ");
		String userInput = scanner.nextLine();
		reverse.getReverseString(userInput);
		scanner.close();
	}
}
