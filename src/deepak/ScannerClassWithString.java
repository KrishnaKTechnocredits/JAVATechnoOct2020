/*Assignment 14 : 10th Oct 2020 
Find the frequency of character from a given String array.
Note: Take String and character from the user. */

package deepak;

import java.util.Scanner;

public class ScannerClassWithString {
	
	int frequency(String word, char ch) {
		int count=0;
		for(int index=0; index < word.length(); index++) {
		if(word.charAt(index)==ch)
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter string: ");
		String word= sc.next();
		System.out.println("Please Enter a character to find the frquency in given string :");
		String temp = sc.next();
		if(temp.length()!=1)
			System.out.println("Re-execute the program. Next time please enter the character NOT the String");
		char ch = temp.charAt(0);
		ScannerClassWithString scannerClassWithString = new ScannerClassWithString();
		System.out.println(scannerClassWithString.frequency(word, ch));	
	}
}
