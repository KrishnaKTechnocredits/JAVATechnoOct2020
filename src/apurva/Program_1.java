package apurva;

import java.util.Scanner;

/*WAP to print Reverse a given String
input = This is technocredits
output = stiderconhcet si sihT.*/
public class Program_1 {
	void reverseWord(String word) {
		for (int i = word.length() - 1; i >= 0; i--) {
			System.out.print(word.charAt(i));
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Program_1 program_1 = new Program_1();
		System.out.println("Enter the string: ");
		String output = scanner.nextLine();
		program_1.reverseWord(output);
		scanner.close();
	}
}