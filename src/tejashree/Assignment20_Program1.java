package tejashree;

import java.util.Scanner;
/*WAP Swap two numbers using third variables*/

public class Assignment20_Program1 {
	void swapNumbers(int num1, int num2) {
		System.out.println("Before Swaping: " + num1+" "+num2);
		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("After Swaping " + num1+" "+num2);
		
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter Numbers To Swap:");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		new Assignment20_Program1().swapNumbers(num1, num2);

	}
}
