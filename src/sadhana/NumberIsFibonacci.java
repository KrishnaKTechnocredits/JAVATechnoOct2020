package sadhana;

import java.util.*;

class NumberIsFibonacci {

	void printData(int num) {

		if (num < 0)
			System.out.println("Enter number : ");
		else {

			int num1 = 0, num2 = 1, sum = 0;
			while (sum < num) {
				sum = num1 + num2;
				num1 = num2;
				num2 = sum;
			}
			if (sum == num)
				System.out.println("Number is present in Fibonacci series");
			else
				System.out.println("Number is not present in Fibonacci series");
		}
	}

	public static void main(String args[]) {

		NumberIsFibonacci numberIsFibonacci = new NumberIsFibonacci();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		numberIsFibonacci.printData(n);
	}
}