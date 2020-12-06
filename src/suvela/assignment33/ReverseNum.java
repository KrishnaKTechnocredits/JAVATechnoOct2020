/*Assignment 33 : [complete it before 4th Dec EOD] 
Program 1: return a reserve number.
input : 1234
output : 4321
*/
package suvela.assignment33;

import java.util.Scanner;

public class ReverseNum {
	void reverse(int num) {
		int ans=0;
		while(num>0) {
			int digit=num%10;
			ans=(ans*10)+digit;
			num=num/10;
			
		}System.out.println("Ans is:"+ans);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to reverse:");
		int num=sc.nextInt();
		ReverseNum r=new ReverseNum();
		r.reverse(num);
	}

}
