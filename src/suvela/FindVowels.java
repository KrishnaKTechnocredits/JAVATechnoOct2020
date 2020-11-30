package suvela;

import java.util.Scanner;

public class FindVowels {
	static int acount, ecount, icount, ocount, ucount;

	void finvowels(String s) {
		for (int index = 0; index < s.length(); index++) {
			char ch = s.charAt(index);
			switch (ch) {
			case 'a':
			case 'A':
				acount++;
				break;
			case 'e':
			case 'E':
				ecount++;
				break;
			case 'i':
			case 'I':
				icount++;
				break;
			case 'o':
			case 'O':
				ocount++;
				break;
			case 'u':
			case 'U':
				ucount++;
				break;
			}

		}
		System.out.println("a is there " + acount + " times");
		System.out.println("e is there " + ecount + " times");
		System.out.println("i is there " + icount + " times");
		System.out.println("o is there " + ocount + " times");
		System.out.println("u is there " + ucount + " times");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter string");
		String s = scanner.next();
		FindVowels findv = new FindVowels();
		findv.finvowels(s);
		scanner.close();
	}

}
