package brijesh.assignment15;

import java.util.Scanner;

/*
	    You need to store user input in array and do sum of even numbers only from created 
	     array. [ideal Expected Time : 10 mins, Max Time : 15 mins]

	     Example :
	     Input : {10,5,7,3,1,5,9,30}
	     Output: 40
*/
public class Program3 {

	int sumOfEvenNumbers(int[] numbers) {
		int sum = 0;
		for (int index = 0; index < numbers.length; index++) {
			if (numbers[index] % 2 == 0)
				sum += numbers[index];
		}
		return sum;
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
		System.out.println("sum of even numbers: " + new Program3().sumOfEvenNumbers(numbers));
	}

}
