package ankit.Scanner;

//Assignment14: To scan the vowels in string
import java.util.Scanner;
public class vowelsScanner {

	
		static int vowelACount, vowelECount, vowelICount, vowelOCount, vowelUCount = 0;

		static void findVowel(String string) {
			for (int i = 0; i < string.length(); i++) {
				char ch = string.charAt(i);
				switch (ch) {
				case 'a':
					vowelACount++;
					System.out.print(ch + " ");
					break;

				case 'e':
					vowelECount++;
					System.out.print(ch + " ");
					break;

				case 'i':
					vowelICount++;
					System.out.print(ch + " ");
					break;

				case 'o':
					vowelOCount++;
					System.out.print(ch + " ");
					break;

				case 'u':
					vowelUCount++;
					System.out.println(ch + " ");
					break;

				}
			}
		}

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter a string");
			String string = scanner.next();
			System.out.println("Vowels in a string are:");
			vowelsScanner.findVowel(string);
			if (vowelACount == 0 && vowelECount == 0 && vowelICount == 0 && vowelOCount == 0 && vowelUCount == 0)
				System.out.println("No vowels in the String");
			else {

				int totCount = vowelACount + vowelECount + vowelICount + vowelOCount + vowelUCount;
				System.out.println();
				System.out.println("Total vowels in a given string are:" + totCount);
				scanner.close();
			}
		}

}
