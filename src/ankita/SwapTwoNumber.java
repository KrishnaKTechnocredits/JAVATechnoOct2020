//swap 2 numbers with using 3rd variable

package ankita;

import java.util.Scanner;

public class SwapTwoNumber {
	void getSwappedNumbers(int num1, int num2) {
		int temp = 0;
		System.out.println("Number1=" + num1 + " Number2=" + num2);
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("Number1=" + num1 + " Number2=" + num2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number1 : ");
		int num1 = sc.nextInt();
		System.out.println("Enter Number2 : ");
		int num2 = sc.nextInt();

		new SwapTwoNumber().getSwappedNumbers(num1, num2);
	}
}