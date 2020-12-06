/*
 Program 1: return a reserve number.
input : 1234
output : 4321
 
 */

package yogita;

import java.util.Scanner;

public class ReverseNumber {
	void findReverseNumber(int num) {
		int remainder = 0;
		int reverse = 0;
		while (num != 0) {
			remainder = num % 10;
			reverse = (reverse * 10) + remainder;
			num = num / 10;
		}
		System.out.println("Reverse number Is:" + reverse);
	}

	public static void main(String[] args) {
		ReverseNumber reverseNumber = new ReverseNumber();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int number = sc.nextInt();
		reverseNumber.findReverseNumber(number);
	}
}
