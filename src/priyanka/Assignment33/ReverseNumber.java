package priyanka.Assignment33;

import java.util.Scanner;

/*Program 1: return a reserve number.
input : 1234
output : 4321
*/
public class ReverseNumber {

	void reverseNumber(int number) {

		int revNumber = 0;
		while (number != 0) {
			int digit = number % 10;
			revNumber = revNumber * 10 + digit;
			number = number / 10;
		}
		System.out.println(" The Reversed number is : " + revNumber);
	}

	public static void main(String[] arg) {
		ReverseNumber reverseNumber = new ReverseNumber();
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Enter the number : ");
		int number = scanner.nextInt();
		reverseNumber.reverseNumber(number);
	}
}
