/*Program 3:  write a program having below methods.
1) write a method which take one character and return its ascii value.
2) write a method which take one ascii and return character.
3) write a method to print ascii values for uppercase letters [A-Z]. 
A -> 65, B - 66....
4) write a method to print ascii values for lowercase letter [a-z].
a -> 97, b -> 98*/

package kajol;

import java.util.Scanner;

public class OperationsonASCIIValues {

	void findAsciiValue(char character) {
		int ascii=character;
		System.out.println("ASCII Value of '"+character+"' is : "+ascii);
	}
	
	void findcharacter(int asciiValue) {
		char character=(char)(asciiValue);
		System.out.println("Character corressponding to ASCII Value '"+asciiValue+"' is : "+character);	
	}
	
	void printAsciiValuesOfUppercaseLetters() {
		System.out.println("ASCII Values of all UpperCase Letters:");
		for(char character='A';character<='Z';character++) {
			int ascii=character;
			System.out.println(character+" -> "+ascii);
		}
	}
	
	void printAsciiValuesOfLowercaseLetters() {
		System.out.println("ASCII Values of all LowerCase Letters:");
		for(char character='a';character<='z';character++) {
			int ascii=character;
			System.out.println(character+" -> "+ascii);
		}	
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter a Character you find a ASCII Value Of:");
		new OperationsonASCIIValues().findAsciiValue(sc.next().charAt(0));
		System.out.println();
		System.out.println("Please Enter ASCII Value for which you want to find corressponding Character:");
		new OperationsonASCIIValues().findcharacter(sc.nextInt());
		System.out.println();
		new OperationsonASCIIValues().printAsciiValuesOfUppercaseLetters();
		System.out.println();
		new OperationsonASCIIValues().printAsciiValuesOfLowercaseLetters();	
		sc.close();		
	}
}
