package priyanka.ArrayPrograms;

/*Program 5 : [ Compulsory ]
		Java Program to Count the Number of Vowels in user defined string.

		Input : technocredits
		output : vowels are e , o, i */

import java.util.Scanner;

class FindVowles {
	static int aCount, eCount, iCount, oCount, uCount = 0;
	static void findVowel(String s) {
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			switch (ch) {
			case 'A':
			case 'a':
				aCount++;
				System.out.print(ch + " ");
				break;
			case 'E':
			case 'e':
				eCount++;
				System.out.print(ch + " ");
				break;
			case 'I':
			case 'i':
				iCount++;
				System.out.print(ch + " ");
				break;
			case 'O':
			case 'o':
				oCount++;
				System.out.print(ch + " ");
				break;
			case 'U':
			case 'u':
				uCount++;
				System.out.println(ch + " ");
				break;
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FindVowles findVowles = new FindVowles();
		System.out.println("Enter a string");
		String str = scanner.next();
		System.out.println("Vowels present in a string are:");
		findVowel(str);
		if (iCount == 0 && oCount == 0 && eCount == 0 && uCount == 0)
			System.out.println("there are no vowels in a string");
		else {
			int totCount = aCount + eCount + iCount + oCount + uCount;
			System.out.println();
			System.out.println("Total vowels in a given string are:" + totCount);
		}
	}
}