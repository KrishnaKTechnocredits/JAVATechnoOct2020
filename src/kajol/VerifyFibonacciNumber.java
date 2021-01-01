/*Assignment - 38 : 11th Dec'2020 
Verify number is in Fibonacci series or not*/

package kajol;

import java.util.Scanner;

public class VerifyFibonacciNumber {
	boolean fibonacciSeries(int number) {
		int number1=0,number2=1;
		int succeedingNumber=0;
		if(number==number1 || number==number2) 
			return true;
		for(int index=2;index<number;index++) {
			succeedingNumber=number1+number2;
			if(succeedingNumber==number) 
				return true;
			else if(succeedingNumber>number)
				return false;			
			number1=number2;
			number2=succeedingNumber;			
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the number to verify:");
		int number=sc.nextInt();
		boolean flag =new VerifyFibonacciNumber().fibonacciSeries(number);
		if (flag)
			System.out.println("Number '"+number+"' is in Fibonacci Series.");
		else
			System.out.println("Number '"+number+"' is not in Fibonacci Series.");
		sc.close();
	}
}
