package priyanka.Assignment22;

import java.util.Scanner;

/*Assignment-22 : 18th Nov'2020 
Print all prime numbers between 2 to 100.
*/
public class PrimeNumbers {

	void verifyPrimeNo(int number) {

		boolean flag = true;
		for (int index = 2; index <= Math.sqrt(number); index++) {
			if (number % index == 0) {
				flag = false;
				break;
			}
		}
		if (flag)
			System.out.print(" " + number + " ");
	}

	void getPrimeNo(int startNum, int endNum) {

		System.out.println("The Prime Numbers from " + startNum + " to " + endNum + " are :");
		for (int index = startNum; index < endNum; index++) {
			verifyPrimeNo(index);
		}
	}

	public static void main(String[] arg) {

		PrimeNumbers primeNumbers = new PrimeNumbers();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the start number");
		int startNum = scanner.nextInt();
		System.out.println("Enter the end number");
		int endNum = scanner.nextInt();
		primeNumbers.getPrimeNo(startNum, endNum);
	}
}
