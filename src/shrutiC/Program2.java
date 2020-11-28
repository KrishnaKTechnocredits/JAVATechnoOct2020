package shrutiC;

import java.util.Scanner;

public class Program2 {

	void rearrangeWord(String input) {
		String digits = "";
		String upperCaseChar = "";
		String lowerCaseChar = "";
		String symbols = "";
		String strOutput = "";
		System.out.print("Rearranged word - ");
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch))
				digits = digits + ch;
			else if (Character.isUpperCase(ch))
				upperCaseChar = upperCaseChar + ch;
			else if (Character.isLowerCase(ch))
				lowerCaseChar = lowerCaseChar + ch;
			else
				symbols = symbols + ch;
		}
		strOutput = digits + upperCaseChar + lowerCaseChar + symbols;
		System.out.println(strOutput);
	}

	public static void main(String[] args) {

		Program2 program = new Program2();
		System.out.println("Enter the word to be rearranged");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();

		program.rearrangeWord(input);
	}

}
