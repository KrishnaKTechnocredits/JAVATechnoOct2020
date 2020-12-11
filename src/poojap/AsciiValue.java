/*Program 3:  write a program having below methods.
1) write a method which take one character and return its ascii value.
2) write a method which take one ascii and return character.
3) write a method to print ascii values for uppercase letters [A-Z]. 
A -> 65, B - 66....
4) write a method to print ascii values for lowercase letter [a-z].
a -> 97, b -> 98*/

package poojap;

import java.util.Scanner;

public class AsciiValue {
	void asciiCharacter() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Character");
		char ch = scanner.next().charAt(0);
		int x = ch;
		System.out.println("Ascii Value Of Character Is: " + x);
	}

	void returnCharacter() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Ascii Value");
		int value = scanner.nextInt();
		char ch = (char) value;
		System.out.println("Character Of Ascii Value Is : " + ch);
	}

	void asciiValueOfUpperCaseLetter() {
		System.out.println("Ascii Values For Uppercase Letter Is : ");
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			int x = ch;
			System.out.print(ch + " : " + x + " , ");
		}
	}

	void asciiValueOfLowerCaseLetter() {
		System.out.println("\nAscii Values For Lowercase Letter Is : ");
		for (char ch = 'a'; ch <= 'z'; ch++) {
			int x = ch;
			System.out.print(ch + " : " + x + " , ");
		}
	}

	public static void main(String[] args) {
		AsciiValue asciiValue = new AsciiValue();
		asciiValue.asciiCharacter();
		asciiValue.returnCharacter();
		asciiValue.asciiValueOfUpperCaseLetter();
		asciiValue.asciiValueOfLowerCaseLetter();
	}
}
