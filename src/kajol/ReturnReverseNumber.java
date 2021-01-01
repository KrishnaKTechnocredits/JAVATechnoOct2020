/* Assignment 33 : [complete it before 4th Dec EOD] 
Program 1: return a reserve number.
input : 1234
output : 4321*/

package kajol;

import java.util.Scanner;

public class ReturnReverseNumber {
	 
	int reverseNumber(int number) {
		int reverseNumber=0;
		int digit=0;
		while(number>0) {
			digit=number%10;
			number=number/10;
			reverseNumber=(reverseNumber*10)+digit;
		}
		return reverseNumber;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter a Number to Reverse:");
		int number=sc.nextInt();
		System.out.println("Reversed Number is: "+new ReturnReverseNumber().reverseNumber(number));
		sc.close();
	}
}
