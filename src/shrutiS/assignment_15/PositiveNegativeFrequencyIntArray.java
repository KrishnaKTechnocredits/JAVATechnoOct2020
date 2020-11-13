/*Program 4 :  [ Optional ]
    Create a class where user will provide int array. *[ideal Expected Time : 15 mins, Max 
    Time : 25 mins]*

    A) User can provide any positive and negative number
    B) You need to find out how many positive, negative numbers and zeros are there in array */

package shrutiS.assignment_15;

import java.util.Scanner;

public class PositiveNegativeFrequencyIntArray {
	int positiveCount, negativeCount, zeroCount;

	void positiveNegativeNumbers(int[] numbers) {
		System.out.print("Array provided by user is {");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i]+",");
			if (numbers[i] > 0)
				positiveCount++;
			else if (numbers[i] < 0)
				negativeCount++;
			else
				zeroCount++;
		}
		System.out.println("}\nTotal Postive numbers are : "+positiveCount);
		System.out.println("Total Negative numbers are : "+negativeCount);
		System.out.println("Total Zero count is : "+zeroCount);
	}

	public static void main(String[] args) {
		PositiveNegativeFrequencyIntArray numberFrequency = new PositiveNegativeFrequencyIntArray();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total numbers in an array");
		int length = sc.nextInt();
		int[] numbers = new int[length];
		System.out.println("Enter numbers for the array");
		for (int index = 0; index < length; index++) {
			numbers[index] = sc.nextInt();
		}
		numberFrequency.positiveNegativeNumbers(numbers);
	}
}
