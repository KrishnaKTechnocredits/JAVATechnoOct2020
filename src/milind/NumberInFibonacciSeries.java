package milind;

import java.util.Scanner;

public class NumberInFibonacciSeries {
	
	int temp;
	
	void isNumberPresentInFibonnacciSeries(int number) {
		int num1 = 0;
		int num2 = 1;
		System.out.print(num1 + ", " + num2 + ", ");
		while(temp < number) {
			temp = num1 + num2;
			num1 = num2;
			num2 = temp;
			System.out.print(temp + ", ");
		}
		System.out.println("");
		if(temp == number) {
			System.out.println(number + " Present in fibonacci series");
		}else {
			System.out.println(number + " is not present in fibonacci series");
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number");
		int numberForCheck = scanner.nextInt();
		NumberInFibonacciSeries numberInFibonacciSeries = new NumberInFibonacciSeries();
		numberInFibonacciSeries.isNumberPresentInFibonnacciSeries(numberForCheck);
		scanner.close();
	}

}
