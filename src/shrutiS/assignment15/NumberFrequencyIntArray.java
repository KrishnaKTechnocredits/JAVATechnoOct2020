/*Program 2:  [ Optional ]
Create a class where you need to check given number is there in predefined array or not, if present then print frequency of the number. [Estimated time: 15 mins]

Input : Predefined array -> {10,3,9,-99,81,3,-11}
           Number to be check -> 33
Output : Given number 33 is not present in predefined array.

Input : Number to be check -> 3
output : Given number 3 is present in predefined array with frequency 2.*/

package shrutiS.assignment15;

import java.util.Scanner;

public class NumberFrequencyIntArray {

	void numberFrequency(int[] number, int numCheck) {
		int frequency = 0;
		for (int index = 0; index < number.length; index++) {
			if (number[index] == numCheck)
				frequency++;
		}
		if (frequency > 0)
			System.out.println("Given number " + numCheck + " is present in predefined array with frequency " + frequency);
		else
			System.out.println("Given number " + numCheck + " is not present in predefined array.");
	}

	public static void main(String[] args) {
		NumberFrequencyIntArray numberFrequencyArray = new NumberFrequencyIntArray();
		Scanner sc = new Scanner(System.in);
		int[] number = { 10, 3, 9, -99, 81, 3, -11 };
		System.out.print("Predefined array is {");
		for (int index = 0; index < number.length; index++) {
			System.out.print(number[index] + ",");
		}
		System.out.println("}\nEnter the number to check frequency ");
		int numCheck = sc.nextInt();
		numberFrequencyArray.numberFrequency(number, numCheck);
	}

}
