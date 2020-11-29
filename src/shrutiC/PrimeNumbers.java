package shrutiC;

import java.util.Scanner;

public class PrimeNumbers {

	void displayPrimeNumbers(int startNum, int endNum) {
		int number = 0;
		String primenumbers = "";
		System.out.println("Prime numbers between " + startNum + " and " + endNum + " are :-");
		System.out.print("");
		boolean flag = false;

		for (int i = startNum; i <= endNum; i++) {
			number = i;
			flag=true;
			
			// Check if prime
			for (int j = 2; j < number; j++) {
				if (number % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				primenumbers = primenumbers + number + " ";
			}
		}
		System.out.println(primenumbers);
	}

	public static void main(String[] args) {

		PrimeNumbers object = new PrimeNumbers();
		object.displayPrimeNumbers(2, 100);
	}

}
