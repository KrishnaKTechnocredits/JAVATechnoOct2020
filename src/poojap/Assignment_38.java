/*Assignment - 38 : 11th Dec'2020 
Verify number is in Fibonacci series or not.*/

package poojap;

import java.util.Scanner;

public class Assignment_38 {
	void findElementInFibonacciSeries(int num) {
		int first = 0, second = 1;
		System.out.println("Fibonacci Series:");
		System.out.print(first + "," + second);
		boolean flag = false;
		for (int i = 2; i <= num; i++) {
			int third = first + second;
			System.out.print("," + third);
			first = second;
			second = third;
			if (num == third) {
				flag = true;
				break;
			}
		}
		if (flag)
			System.out.println("\n" + num + " Is a Element of Fibonacci Series");
		else
			System.out.println("\n" + num + " Is a Element of Fibonacci Series");
	}

	public static void main(String[] args) {
		Assignment_38 assignment_38 = new Assignment_38();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number To be Search in Fibonacci Series");
		int number = sc.nextInt();
		assignment_38.findElementInFibonacciSeries(number);
	}
}