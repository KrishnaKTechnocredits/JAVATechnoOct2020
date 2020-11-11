/*
Create a class where you need to check given number is there in predefined array or not, if present then print frequency of the number. [Estimated time: 15 mins]
Input : Predefined array -> {10,3,9,-99,81,3,-11}
           Number to be check -> 33
Output : Given number 33 is not present in predefined array.
Input : Number to be check -> 3
output : Given number 3 is present in predefined array with frequency 2.
 */
package ankita;

import java.util.Scanner;

public class NumberFrequency {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers you want to store ");
		int num = sc.nextInt();
		int[] number = new int[num];
		for (int i = 1; i < num; i++) {
			System.out.println("Enter number");
			number[i] = sc.nextInt();
		}
		System.out.println("Enter Number to check");
		int number1 = sc.nextInt();
		int cnt = 0;
		for (int i = 0; i < number.length; i++) {
			if (number[i] == number1) {
				cnt++;
			}
		}
		if (cnt == 0)
			System.out.println("Given number " + number1 + "is not present in predefined array.");
		else
			System.out.println("Given number " + number1 + " is present in predefined array with frequency " + cnt);
	}
}