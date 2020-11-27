package ankit.EnhancedCode;

import java.util.Scanner;

public class PrimeNumberEnhanced {
	
	static int counter;
	int sum;
	int average;
	
	void primeNumberVerification(int number) {
			boolean flag = false;
			for (int index = 2; index < number; index++) {
				if (number % index == 0) {
					flag=true;
					break;
					}
				}
			if (!flag) {
				System.out.println("Number " + number + " -> is prime number");
				counter++;
				sum = sum+number;
			}
			average= sum/counter;
		}

	void primeNumberUserDefinedRange(int lowerRange, int upperRange) {
		for (int index = lowerRange; index <= upperRange; index++) {
			int number = index;
			primeNumberVerification(number);
		}
	}
	void displayPrimerNumberCalculations() {
		System.out.println("Number of prime number present in the given range is: " +counter);
		System.out.println("Sum of all the prime number in the range is: " +sum);
		System.out.println("Average of the prime number in given range is: " +average);
		
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PrimeNumberEnhanced primeNumberEnhanced = new PrimeNumberEnhanced();
		System.out.println("Enter the lower range to find the prime number");
		int lowerRange = scanner.nextInt();
		System.out.println("Enter the upper range to find the prime number");
		int upperRange = scanner.nextInt();
		primeNumberEnhanced.primeNumberUserDefinedRange(lowerRange, upperRange);
		primeNumberEnhanced.displayPrimerNumberCalculations();
		scanner.close();
	}
}