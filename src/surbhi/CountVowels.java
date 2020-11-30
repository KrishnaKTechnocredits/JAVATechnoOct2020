package surbhi;

/*Java Program to Count the Number of Vowels in user defined string.

Input : technocredits
output : vowels are e , o, i 
*/

import java.util.Scanner;

public class CountVowels {

	void countVowels(String string) {
		int aCnt = 0, eCnt = 0, iCnt = 0, oCnt = 0, uCnt = 0;
		String vowels = "";
		for (int index = 0; index < string.length(); index++) {
			char character = string.charAt(index);
			switch (character) {
			case 'A':
			case 'a':
				if (++aCnt == 1)
					vowels += character + ", ";
				break;
			case 'E':
			case 'e':
				if (++eCnt == 1)
					vowels += character + ", ";
				break;
			case 'I':
			case 'i':
				if (++iCnt == 1)
					vowels += character + ", ";
				break;
			case 'O':
			case 'o':
				if (++oCnt == 1)
					vowels += character + ", ";
				break;
			case 'U':
			case 'u':
				if (++uCnt == 1)
					vowels += character + ", ";
				break;
			}
		}
		System.out.println("vowels are :" + vowels);
		System.out.println("Occurance of 'a' in string " + string + ": " + aCnt);
		System.out.println("Occurance of 'e' in string " + string + ": " + eCnt);
		System.out.println("Occurance of 'i' in string " + string + ": " + iCnt);
		System.out.println("Occurance of 'o' in string " + string + ": " + oCnt);
		System.out.println("Occurance of 'u' in string " + string + ": " + uCnt);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter string: ");
		new CountVowels().countVowels(scanner.next());
		scanner.close();
	}

}
