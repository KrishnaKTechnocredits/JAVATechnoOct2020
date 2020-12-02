package apurva.Assignment_15;

/*Java Program to count the Number of Vowels in user defined string.
input: technocredits
output: vowels are e, o, i*/
import java.util.Scanner;

public class Program_5 {
	void countingVowels(String input) {
		int aCount = 0, eCount = 0, iCount = 0, oCount = 0, uCount = 0;
		String vowels = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			switch (ch) {
			case 'A':
			case 'a':
				if (++aCount == 1)
					vowels = vowels + ch + "";
				break;
			case 'E':
			case 'e':
				if (++eCount == 1)
					vowels = vowels + ch + "";
				break;
			case 'I':
			case 'i':
				if (++iCount == 1)
					vowels = vowels + ch + "";
				break;
			case 'O':
			case 'o':
				if (++oCount == 1)
					vowels = vowels + ch + "";
				break;
			case 'U':
			case 'u':
				if (++uCount == 1)
					vowels = vowels + ch + "";
				break;
			}
		}
		System.out.println("Number of vowels in a given string: " + vowels);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Program_5 countvowels = new Program_5();
		System.out.println("Please enter a string:");
		String string = scanner.next();
		countvowels.countingVowels(string);
		scanner.close();
	}
}