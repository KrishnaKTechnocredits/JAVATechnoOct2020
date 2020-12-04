//Program 2: verify number is palindrom or not.//// input : 121121

package priya;

import java.util.Scanner;

public class NumberIsPalidromOrNot {

	void palindromNumber(int num) {
		int rev = 0, rem = 0;
		int x = num;
		while (num != 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		if (x == rev)
			System.out.println("Number is palindrome");
		else
			System.out.println("Number is not palindrome");
	}

	public static void main(String[] args) {
		NumberIsPalidromOrNot printpalindromOrNot = new NumberIsPalidromOrNot();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number : ");
		int number = scanner.nextInt();
		printpalindromOrNot.palindromNumber(number);
		scanner.close();
	}
	
}
