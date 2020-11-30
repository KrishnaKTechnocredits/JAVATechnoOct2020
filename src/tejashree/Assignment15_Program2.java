package tejashree;

//Program to find vowels in a string
import java.util.Scanner;

class Assignment15_Program2 {
	static int aCount, eCount, iCount, oCount, uCount = 0;

	static void findVowel(String s) {
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			switch (ch) {
			case 'a':
				aCount++;
				System.out.print(ch + " ");
				break;

			case 'e':
				eCount++;
				System.out.print(ch + " ");
				break;

			case 'i':
				iCount++;
				System.out.print(ch + " ");
				break;

			case 'o':
				oCount++;
				System.out.print(ch + " ");
				break;

			case 'u':
				uCount++;
				System.out.println(ch + " ");
				break;

			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.next();
		System.out.println("Vowels in a string are:");
		Assignment15_Program2.findVowel(str);
		if (iCount == 0 && oCount == 0 && eCount == 0 && uCount == 0)
			System.out.println("there are no vowels in a string");
		else {

			int totCount = aCount + eCount + iCount + oCount + uCount;
			System.out.println();
			System.out.println("Total vowels in a given string are:" + totCount);
		}
	}

}