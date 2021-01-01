/*
  Assignment - 38 : 11th Dec'2020 
  Verify number is in Fibonacci series or not.
*/


package yogita;

import java.util.Scanner;

public class FindElementInFibonacci {
	void searchInFibonacciSeries(int num) {
		int first = 0;
		int second = 1;
		System.out.println("Fibonacci Series:");
		System.out.print(first + "," + second);
		boolean flag = false;
		for (int i = 2; i < 15; i++) {
			int sum = first + second;
			System.out.print("," + sum);
			first = second;
			second = sum;

			if (num == sum) {
				flag = true;
				break;
			}
		}
		if (flag)
			System.out.println("\nNumber:" + num + " Is a Part of Fibonacci Series");
		else
			System.out.println("\nNumber: " + num + " Is Not a Part of Fibonacci Series");
	}

	public static void main(String[] args) {
		FindElementInFibonacci series = new FindElementInFibonacci();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number To be Search in Fibonacci Series");
		int num1 = sc.nextInt();
		series.searchInFibonacciSeries(num1);

	}
}
