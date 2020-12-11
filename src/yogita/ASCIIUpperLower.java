/*
  Program 3:  write a program having below methods.
1) write a method which take one character and return its ascii value.
2) write a method which take one ascii and return character.
3) write a method to print ascii values for uppercase letters [A-Z]. 
A -> 65, B - 66....
4) write a method to print ascii values for lowercase letter [a-z].
a -> 97, b -> 98
*/

package yogita;

import java.util.Scanner;

public class ASCIIUpperLower {

	void convertCharToASCII(char ch) {
		int ascii = ch;
		System.out.println("ASCII value of Charachter:" + ch + "--->" + ascii);
	}

	void convertASCIIToChar(int value) {
		char ch1 = (char) value;
		System.out.println("Character For ASCII value:" + value + "--->" + ch1);
	}

	void findASCIIOfUpperCase() {
		System.out.println("\nASCII Value Of Character From A - Z");
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			int temp = ch;
			System.out.println(ch + ":" + temp);
		}
	}

	void findASCIIOfLowerCase() {
		System.out.println("\nASCII Value Of Character From a - z");
		for (char ch = 'a'; ch <= 'z'; ch++) {
			int temp = ch;
			System.out.println(ch + ":" + temp);
		}
	}

	public static void main(String[] args) {

		ASCIIUpperLower conversion = new ASCIIUpperLower();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Character For Conversion : ");
		char ch=sc.next().charAt(0);
		conversion.convertCharToASCII(ch);
		System.out.println("\nEnter ASCII Value For Conversion : ");
		int value1=sc.nextInt();
		conversion.convertASCIIToChar(value1);
		conversion.findASCIIOfUpperCase();
		conversion.findASCIIOfLowerCase();
	}

}
