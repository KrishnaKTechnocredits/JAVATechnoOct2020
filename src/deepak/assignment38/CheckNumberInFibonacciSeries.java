/*
Assignment - 38 : 11th Dec'2020
Verify number is in Fibonacci series or not
 */

package deepak.assignment38;

import java.util.Scanner;

public class CheckNumberInFibonacciSeries {

	boolean processData(int num) {
		
		int num1=0, num2=1, index=0, sum=0;
		boolean flag=false;
				
		while(index < num) {
			
			sum = num1 + num2;
			num1=num2;
			num2=sum;
			System.out.println(" "+ sum);	
			index++;
			if(sum == num) {
				flag = true;
			}
			
			if(flag) {
				
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		
		CheckNumberInFibonacciSeries refVar = new CheckNumberInFibonacciSeries();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter a number greater than 0 to check in series :");
		int num = sc.nextInt();
		boolean flag = refVar.processData(num);
		if(flag) {
			System.out.println("Entered value "+ num +" is PRESENT in series");
		}
		else 
			System.out.println("Entered value "+ num +" is NOT PRESENT in series");
		sc.close();
	}

}
