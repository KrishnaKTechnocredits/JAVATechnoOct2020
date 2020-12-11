package anjaliS;

import java.util.Scanner;

public class IsFibonacciSeriesorNot {
	void displayIsFibonacci(int n) {
		int firstnumber = 0;
		int secondnumber = 1;
		for (int i = 0; i < n; i++) {
			int sum = firstnumber + secondnumber;
			firstnumber = secondnumber;
			secondnumber = sum;
			if (n == sum) {
				System.out.println(+n + " is a fibonacciSeries");
				break;
			} else if (sum > n) {
				System.out.println(+n + " is not a fibonacciSeries");
				break;
			}
		}

	}

	public static void main(String[] args) {
		IsFibonacciSeriesorNot isfibonacciseriesornot = new IsFibonacciSeriesorNot();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		isfibonacciseriesornot.displayIsFibonacci(num);
		System.out.println("Enter the number: ");
		int num1 = sc.nextInt();
		isfibonacciseriesornot.displayIsFibonacci(num1);

	}

}
