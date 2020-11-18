package priyanka.Assignment22;

import java.util.Scanner;

/*Assignment-22 : 18th Nov'2020 
Print all prime numbers between 2 to 100.
*/
public class PrimeNumbers {

	void primeNo(int startNum, int endNum) {

		for (int index = startNum; index <= endNum; index++) {
			int count = 0;
			for (int innerIndex = 1; innerIndex <= endNum; innerIndex++) {
				if (index % innerIndex == 0) {
					count++;
				}
			}
			if (count == 2)
				System.out.print(" " + index + " ");
		}
	}

	public static void main(String[] arg) {

		PrimeNumbers primeNumbers = new PrimeNumbers();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the start number");
		int startNum = scanner.nextInt();
		System.out.println("Enter the start number");
		int endNum = scanner.nextInt();
		System.out.println("The Prime Numbers from " + startNum + " to " + endNum + " are :");
		primeNumbers.primeNo(startNum, endNum);
	}
}
