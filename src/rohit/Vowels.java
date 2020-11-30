package rohit;
//TO find the numbers of vowels in the given string.
import java.util.Scanner;

public class Vowels {

	void findvowel(String str) {
		System.out.println("Vowles found in the strings are::");
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			switch (ch) {
			case 'a':
				System.out.print(ch + " ");
				break;
			case 'e':
				System.out.print(ch + " ");
				break;
			case 'i':
				System.out.print(ch + " ");
				break;
			case 'o':
				System.out.print(ch + " ");
				break;
			case 'u':
				System.out.print(ch + " ");
				break;
			}
		}
	}

	public static void main(String[] args) {
		Vowels vowels = new Vowels();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String- ");
		String str = sc.next();
		vowels.findvowel(str);
	}
}