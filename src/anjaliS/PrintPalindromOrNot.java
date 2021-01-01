package anjaliS;

import java.util.Scanner;

public class PrintPalindromOrNot {
	void displayPalindromNumber(int num) {
		int rev = 0, rem = 0;
		int pal = num;
		while (num != 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		if (pal == rev)
			System.out.println("Number is palindrome");
		else
			System.out.println("Number is not palindrome");
	}

	public static void main(String[] args) {
		PrintPalindromOrNot printpalindromOrNot = new PrintPalindromOrNot();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int number = sc.nextInt();
		printpalindromOrNot.displayPalindromNumber(number);
	}

}
