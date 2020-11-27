package brijesh.assignment15;

import java.util.Scanner;

public class Program4 {

	void findPositiveNegative(int[] numbers) {
		int positiveCount=0, negativeCount=0, zeroCount=0;
		for (int index = 0; index < numbers.length; index++) {
			if (numbers[index] <0)
				negativeCount++;
			else if(numbers[index]>0)
				positiveCount++;
			else
				zeroCount++;
		}
		System.out.println("Positive number count: "+positiveCount+"\nNegative number count: "+negativeCount+"\nZero count: "+zeroCount);
	}
	public static void main(String[] args) {
		System.out.println("Please enter number of elements you want to store: ");
		Scanner scanner = new Scanner(System.in);
		int total = scanner.nextInt();
		int[] numbers = new int[total];
		for (int index = 0; index < total; index++) {
			System.out.println("Enter number" + (index + 1) + ": ");
			numbers[index] = scanner.nextInt();
		}
		scanner.close();
		new Program4().findPositiveNegative(numbers);

	}

}
