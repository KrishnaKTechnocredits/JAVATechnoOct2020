/*Program 2: verify number is palindrome or not.
input : 121121*/

package kajol;

import java.util.Scanner;

public class PalindromeNumber {
	
	boolean verifyPalindromeNumber(int inputNumber) {
		int temp=inputNumber;
		int result=0;
		int digit=0;
		while(inputNumber>0) {
			digit=inputNumber%10;
			inputNumber=inputNumber/10;
			result=(result*10)+digit;
		}
		if(result==temp)
			return true;
		else 
			return false;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter a Number:");
		int number=sc.nextInt();
		boolean flag=new PalindromeNumber().verifyPalindromeNumber(number);
		if(flag)
			System.out.println(number+" is Palindrome Number.");
		else
			System.out.println(number+" is not Palindrome Number.");
		sc.close();
		
	}

}
