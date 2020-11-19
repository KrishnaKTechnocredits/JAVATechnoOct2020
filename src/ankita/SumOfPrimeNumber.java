// optional program from sunday lecture -Find Sum and avg of prime numbers between user defined range.
package ankita;

import java.util.Scanner;

public class SumOfPrimeNumber {
	void getSumOfPrime(int num1, int num2) {
		int sum = 0;
		for (int i = num1; i <= num2; i++) {
			boolean flag = true;
			if (i != 0 && i != 1) {
				for (int j = 2; j <= i / 2; j++) {
					if (i % j == 0) {
						flag = false;
						break;
					}
				}
				if (flag) {
					System.out.println(i + ",");
					sum += i;
				}
			}
		}
		System.out.println("Sum of prime numbers in range " + num1 + " & " + num2 + "->" + sum);
	}

	void getAvgOfPrime(int num1, int num2) {
		double cnt = 0;
		int sum = 0;
		for (int i = num1; i <= num2; i++) {
			boolean flag = true;
			if (i != 0 && i != 1) {
				for (int j = 2; j <= i / 2; j++) {
					if (i % j == 0) {
						flag = false;
						break;
					}
				}
				if (flag) {
					System.out.println(i + ",");
					sum += i;
					cnt++;
				}
			}
		}
		System.out.println("Sum :" + sum + "cnt : " + cnt);
		System.out.println("Sum of avg numbers: " + (sum / cnt));
	}

	public static void main(String[] args) {
		SumOfPrimeNumber number = new SumOfPrimeNumber();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number1:");
		int num1 = sc.nextInt();
		System.out.println("Enter Number2:");
		int num2 = sc.nextInt();
		number.getSumOfPrime(num1, num2);
		number.getAvgOfPrime(num1, num2);

		sc.close();
	}
}