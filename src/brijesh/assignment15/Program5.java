package brijesh.assignment15;

import java.util.Scanner;

/*Java Program to Count the Number of Vowels in user defined string.

Input : technocredits
output : vowels are e , o, i 
*/

public class Program5 {

	void countVowels(String string) {
		int aCount = 0, eCount = 0, iCount = 0, oCount = 0, uCount = 0;
		String vowels = "";
		for (int index = 0; index < string.length(); index++) {
			char character = string.charAt(index);
			switch (character) {
			case 'A':
			case 'a':
				if (++aCount == 1)
					vowels += character + ", ";
				break;
			case 'E':
			case 'e':
				if (++eCount == 1)
					vowels += character + ", ";
				break;
			case 'I':
			case 'i':
				if (++iCount == 1)
					vowels += character + ", ";
				break;
			case 'O':
			case 'o':
				if (++oCount == 1)
					vowels += character + ", ";
				break;
			case 'U':
			case 'u':
				if (++aCount == 1)
					vowels += character + ", ";
				break;
			}
		}
		System.out.println("vowels are :" + vowels);
		System.out.println("Occurance of 'a' in string " + string + ": " + aCount);
		System.out.println("Occurance of 'e' in string " + string + ": " + eCount);
		System.out.println("Occurance of 'i' in string " + string + ": " + iCount);
		System.out.println("Occurance of 'o' in string " + string + ": " + oCount);
		System.out.println("Occurance of 'u' in string " + string + ": " + uCount);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter string: ");
		new Program5().countVowels(scanner.next());
		scanner.close();
	}

}
