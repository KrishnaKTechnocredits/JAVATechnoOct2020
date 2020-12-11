/*Program : 1 
swap 2 numbers with using 3rd variable*/
package suvela;

import java.util.Scanner;

public class Asgn20_1 {
	void swapnums(int num1, int num2) {
		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("Swapped numbers are: " + num1 + " " + num2);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number 1:");
		int num1 = scan.nextInt();
		System.out.println("Enter number 2:");
		int num2 = scan.nextInt();
		System.out.println("UnSwapped numbers are: " + num1 + " " + num2);
		Asgn20_1 assign = new Asgn20_1();
		assign.swapnums(num1, num2);

	}

}
