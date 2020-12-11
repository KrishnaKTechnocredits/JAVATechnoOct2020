package rohan;

import java.util.Scanner;

/*
 * Program 2: verify number is palindrome or not.
input : 121121
 */

public class PalindromeNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		long num = sc.nextLong();
		isNumberPalindrome(num);
	}
	
	static void isNumberPalindrome(long num) {
		long tnum = num;
		long rnum=0,mod=0;
		while(tnum>0) {
			mod = tnum%10;
			rnum =(rnum*10)+mod;
			tnum = tnum/10;
		}
		if(rnum == num)
			System.out.println(num+" numer is palindrome");
		else
			System.out.println(num+" number is not palindrome");
	}
}
