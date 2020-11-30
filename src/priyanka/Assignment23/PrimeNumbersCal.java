package priyanka.Assignment23;

import java.util.Scanner;

public class PrimeNumbersCal {

	int count = 0;
	double sum = 0;

	void verifyPrimeNo(int number) {
		boolean flag = true;
		for (int index = 2; index <= Math.sqrt(number); index++) {
			if (number % index == 0) {
				flag = false;
				break;
			}
		}
		if (flag) {
			count++;
			System.out.print(" " + number + " ");
			sum = sum + number;
		}
	}

	void getPrimeNo(int startNum, int endNum) {
		double average = 0;
		System.out.println("The Prime Numbers from " + startNum + " to " + endNum + " are :");
		for (int index = startNum; index < endNum; index++) {
			verifyPrimeNo(index);
		}
		System.out.println(" ");
		System.out.println(" ********************************************************************** ");
		System.out.println(" The count of the prime no is : " + count);
		System.out.println(" The sum of all the prime no is :  " + sum);
		average = sum / count;
		System.out.println(" The average of the prime no is :  " + average);
	}

	public static void main(String[] arg) {
		PrimeNumbersCal primeNumbersCal = new PrimeNumbersCal();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the start number");
		int startNum = scanner.nextInt();
		System.out.println("Enter the end number");
		int endNum = scanner.nextInt();
		primeNumbersCal.getPrimeNo(startNum, endNum);
	}
}
