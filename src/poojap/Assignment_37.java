/*Assignment - 37 : 10th Dec'2020 
Print Fibonacci series for first 10 numbers.
output : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34*/

package poojap;

import java.util.Scanner;

public class Assignment_37 {
	void fibonacciseries(int num) {

		int num1 = 0, num2 = 1, num3;
		System.out.print(num1 + " "+num2 + " ");
		for (int i = 2; i <= num; i++) {
			num3 = num1 + num2;
			System.out.print(" "+ num3);
			num1 = num2;
			num2 = num3;
		}
	}

	public static void main(String[] args) {
		Assignment_37 assignment_37 = new Assignment_37();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enetr n for Fibonacci series ");
		int sc = scanner.nextInt();
		assignment_37.fibonacciseries(sc);
	}
}
