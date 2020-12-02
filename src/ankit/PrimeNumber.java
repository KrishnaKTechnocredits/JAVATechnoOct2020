package ankit;

import java.util.Scanner;

public class PrimeNumber {

	void primeNumberVerification(int lowerRange, int upperRange) {
		for (int index = lowerRange; index <= upperRange; index++) {
			int number = index;
			int count = 0;
			for (int innearindex = 1; innearindex <= number; innearindex++) {
				if (number % innearindex == 0) {
					count++;
				}
			}
			if (count == 2)
				System.out.println("Number "+ number+ " -> is prime number");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PrimeNumber primeNumber = new PrimeNumber();
		System.out.println("Enter the lower range to find the prime number");
		int lowerRange = scanner.nextInt();
		System.out.println("Enter the upper range to find the prime number");
		int upperRange = scanner.nextInt();
		primeNumber.primeNumberVerification(lowerRange, upperRange);
		scanner.close();
	}
}