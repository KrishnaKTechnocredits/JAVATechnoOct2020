/*Program 2: verify number is armstrong or not.
input : 153
output : 153 is an armstrong number.
input : 154 
output : 154 is an armstrong number.*/

package kajol;

import java.util.Scanner;

public class VerifyArmstrongNumber {
	
	boolean findArmstrongNumber(int inputNumber) {
		int tempNo=inputNumber;
		int sum=0;
		int digit=0;
		while(inputNumber>0) {
			digit=inputNumber%10;
			inputNumber=inputNumber/10;
			sum+=(digit*digit*digit);
		}
		if(sum==tempNo)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter a Number to Verify:");
		int number=sc.nextInt();
		boolean flag=new VerifyArmstrongNumber().findArmstrongNumber(number);
		if(flag)
			System.out.println(+number+" is an Armstrong Number.");
		else
			System.out.println(+number+" is not an Armstrong Number.");
		sc.close();
	}	
}
	
	


