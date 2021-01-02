package shrutiC.assignment43;

import java.util.Scanner;

/*WAP to sum numbers from below String
input: I have 5.6 years of exp in automation and 2.3 in manual testing
output: 7.9
hint: Double's parse method
use exception handling
*/
public class Program1 {

	void findNumSum(String input) {

		String[] array = input.split(" ");
		double sum = 0;
		System.out.println("Input : " + input);
		for (int i = 0; i < array.length; i++) {
			try {
				sum += Double.parseDouble(array[i]);
			} catch (NumberFormatException e) {
				continue;
			}
		}

		System.out.println("Sum of digits is : " + String.format("%.2f", sum));
	}

	public static void main(String[] args) {

		Program1 obj = new Program1();
		// Scanner sc = new Scanner(System.in);
		// String input = sc.next();

		String input = "I have 5.6 years of exp in automation and 2.3 in manual testing";
		obj.findNumSum(input);
	}

}
