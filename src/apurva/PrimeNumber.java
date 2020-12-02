package apurva;

import java.util.Scanner;

//Print all prime numbers between 2 to 100.
public class PrimeNumber {
	void printPrime(int num) {
		String primeNumbers = "";
		for (int index = 2; index <= num; index++) {
			boolean flag = true;
			for (int j = 2; j <= Math.sqrt(index); j++) {
				if (index % j == 0)
					flag = false;
			}
			if (flag) {
				primeNumbers = primeNumbers + index + " ";
			}
		}
		System.out.println("Prime Numbers from 2 to n: ");
		System.out.println(primeNumbers);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value of num: ");
		int num = scanner.nextInt();
		new PrimeNumber().printPrime(num);
		scanner.close();
	}
}