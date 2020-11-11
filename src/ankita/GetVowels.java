/*
Java Program to Count the Number of Vowels in user defined string.
Input : technocredits
output : vowels are e , o, i
 */

package ankita;

import java.util.Scanner;

public class GetVowels {
	static int aCnt, eCnt, iCnt, oCnt, uCnt;

	void countVowels(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			switch (ch) {
			case 'a':
			case 'A':
				aCnt++;
				break;
			case 'e':
			case 'E':
				eCnt++;
				break;
			case 'i':
			case 'I':
				iCnt++;
				break;
			case 'o':
			case 'O':
				oCnt++;
				break;
			case 'u':
			case 'U':
				uCnt++;
				break;
			}
		}
		if (aCnt > 0)
			System.out.println("a is present " + aCnt + "times");
		if (eCnt > 0)
			System.out.println("e is present " + eCnt + "times");
		if (iCnt > 0)
			System.out.println("i is present " + iCnt + "times");
		if (oCnt > 0)
			System.out.println("o is present " + oCnt + "times");
		if (uCnt > 0)
			System.out.println("u is present " + uCnt + "times");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		GetVowels getVowels = new GetVowels();
		System.out.println("Enter String:");
		String str = sc.next();
		getVowels.countVowels(str);
	}
}