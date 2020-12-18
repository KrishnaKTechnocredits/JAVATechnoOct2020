package vaibhav.assignment_37;
//To find the Fibonacci numbers from users"

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number for fibonacci");
		int number= scanner.nextInt();
		if (number == 1 )
			System.out.println("your fibonacci is "+number);
		else if (number == 0)
			System.out.println("\"your fibonacci is "+number);
		else {
			number= number-2;
			FibonacciSeries.getFibonacci(number);
		}
	}

	private static void getFibonacci(int number) {
		int temp = 0;
		int temp1 = 1 ;
		System.out.print("your Fibonacci numbers are "+temp+","+temp1);
		while (number > 0) {
			int temp3= temp+temp1;
			System.out.print(","+temp3);
			temp = temp1;
			temp1=temp3;
			number --;
		}		
	}
}
