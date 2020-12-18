package rohan;

import java.util.Scanner;

/*
Program 2: verify number is armstrong or not.
input : 153
output : 153 is an armstrong number.
input : 154 
output : 154 is an armstrong number.
 */

public class CheckArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		checkArmstrongNumber(num);
	}
	
	static void checkArmstrongNumber(int num) {
		int sum=0,tmp=0,tnum=0;
		tnum=num;
		while(tnum>0) {
			tmp =tnum%10;
			sum += (tmp*tmp*tmp);
			tnum=tnum/10;
		}
		if(sum==num)
			System.out.println(num+" is armstrong number");
		else
			System.out.println(num+" is not an armstrong number");
	}
}
