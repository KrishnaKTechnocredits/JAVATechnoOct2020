package anjaliS;

import java.util.Scanner;

public class PrintAmstrongNumber {
	void displaynumberSum(int num) {
		int rem = 0, sum = 0;
		int ams = num;
		while (num != 0) {
			rem = num % 10;
			num = num / 10;
			sum += (rem * rem * rem);
		}
		if (ams == sum)
			System.out.println("This is an armstrong number");
		else
			System.out.println("This is not an armstrong number");
	}

	public static void main(String[] args) {
		PrintAmstrongNumber printamstrongnumber = new PrintAmstrongNumber();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		printamstrongnumber.displaynumberSum(number);

	}

}
