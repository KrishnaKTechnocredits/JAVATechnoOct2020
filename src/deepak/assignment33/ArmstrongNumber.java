/*
Program 2: verify number is armstrong or not.
input : 153
output : 153 is an armstrong number.
input : 154 
output : 154 is an armstrong number.
 */

package deepak.assignment33;

import java.util.Scanner;

public class ArmstrongNumber {
	
	void processData(int num) {
		
		int sum=0;
		int remainder=0;
		int temp = num;
		
		while(num!=0) {
			
			remainder = num%10;
			sum = sum + (remainder * remainder * remainder);
			num = num/10;
		}
		if(temp == sum) {
			System.out.println(temp + " is a armstrong number");
		}
		else
			System.out.println(temp + " is NOT armstrong number");	
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		ArmstrongNumber refVar = new ArmstrongNumber();
		refVar.processData(num);
	}
}
