package milind;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciSeries {
	
	void fibonacciSeries(int num1, int num2, int seriesLength) {
		for(int index = 2; index < seriesLength; index++) {
			int temp = num1 + num2;
			num1 = num2;
			num2 = temp;
			System.out.print(temp + ", ");
		}
	}
	
	int[] fibonacciSeriesWithReturAsArray(int num1, int num2, int seriesLength) {
		int[] arrayOfFibonacci = new int[seriesLength];
		arrayOfFibonacci[0] = num1;
		arrayOfFibonacci[1] = num2;
		for(int index = 2; index < seriesLength; index++) {
			arrayOfFibonacci[index] = arrayOfFibonacci[index -1] + arrayOfFibonacci[index -2];
		}
		return arrayOfFibonacci;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter fabonacci series length : " );
		int fabonacciLength = scanner.nextInt();
		int firstNum = 0, secondNum = 1;
		FibonacciSeries fibonacciSeries = new FibonacciSeries();
		System.out.print(firstNum + ", " + secondNum + ", ");
		fibonacciSeries.fibonacciSeries(firstNum, secondNum, fabonacciLength);
		System.out.println();
		System.out.println(Arrays.toString(fibonacciSeries.fibonacciSeriesWithReturAsArray(firstNum, secondNum, fabonacciLength)));
		scanner.close();
	}
}
