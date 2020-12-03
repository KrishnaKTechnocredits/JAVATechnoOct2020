package milind;

import java.util.Scanner;

public class AsciiValueProgram {
	
	int characterAsciiValue(char ch) {
		int charAscii = ch;
		System.out.println("ASCII value of " + ch + " is : " + charAscii);
		return charAscii;
	}
	
	char asciiCharValue(int number) {
		char ch = (char)number;
		System.out.println("Character value of " + number + " is : " +ch);
		return ch;
	}
	
	void asciiOfUpperCase(){
		System.out.println("********");
		for(char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch + " -> " + (int)ch);
		}
	}
	
	void asciiOfLowerCase(){
		System.out.println("********");
		for(char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch + " -> " + (int)ch);
		}
	} 
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter char for ASCII : ");
		String input = scanner.next();
		char ch = input.charAt(0);
		System.out.println("Enter number for get char : ");
		int inputNumber = scanner.nextInt();
		AsciiValueProgram asciiValueProgram = new AsciiValueProgram();
		asciiValueProgram.asciiCharValue(inputNumber);
		asciiValueProgram.characterAsciiValue(ch);
		asciiValueProgram.asciiOfUpperCase();
		asciiValueProgram.asciiOfLowerCase();
		scanner.close();
	}

}
