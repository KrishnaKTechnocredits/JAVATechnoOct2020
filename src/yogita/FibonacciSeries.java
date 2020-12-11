/*
  Assignment 37-Program to find Fibonacci series from 0 to 10;
*/
package yogita;

import java.util.Scanner;

public class FibonacciSeries {
	void findFibonacci() {
		int first = 0;
		int second = 1;
		System.out.println("Fibonacci Series From 0 to 10");

		System.out.print(first + "," + second);
		for (int i = 2; i <= 10; i++) {
			int third = first + second;
			System.out.print("," + third);
			first = second;
			second = third;
		}
	}

	public static void main(String[] args) {
		FibonacciSeries series = new FibonacciSeries();
		series.findFibonacci();
	}
}
