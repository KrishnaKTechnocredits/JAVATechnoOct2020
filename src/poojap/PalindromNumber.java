/*Program 2: verify number is palindrom or not.
input : 121121*/

package poojap;

import java.util.Scanner;

public class PalindromNumber {
	void checkPalindromNumber(int num) {
		int reminder, temp, reverse = 0;
		temp = num;
		while (num != 0) {
			reminder = num % 10;
			reverse = reverse * 10 + reminder;
			num = num / 10;
		}
		System.out.println("Reverse Is: " + reverse);
		if (temp == reverse)
			System.out.println(temp + " Number Is Palindrom");
		else
			System.out.println(temp + " Number Is Not Palindrom");
	}

	public static void main(String[] args) {
		PalindromNumber palindromNumber = new PalindromNumber();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Number");
		int num = scanner.nextInt();
		palindromNumber.checkPalindromNumber(num);
		System.out.println("Enter The Number");
		Scanner scanner1 = new Scanner(System.in);
		int num1 = scanner1.nextInt();
		palindromNumber.checkPalindromNumber(num1);
	}
}
