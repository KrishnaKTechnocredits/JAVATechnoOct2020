package rohan;

import java.util.Scanner;

/*
 * program 1: sum of all digits from a given string  
input: te1ch9kj8 
output:= 18

 program 2 : sum of all numbers in a give string 
input: te123ch9kj8 
output : 123 + 9 + 8 = 140
 */

public class SumOfDigitString {
	
	void sumOfDig(String str) {
		char ch;
		int sum=0;
		for(int index=0;index<str.length();index++) {
			ch = str.charAt(index);
			if(Character.isDigit(ch)) 
				sum += Character.getNumericValue(ch);
		}
		System.out.println("Sum of digits in given string is: "+sum);
	}
	
	void sumOfDigit2(String str) {
		char ch;
		int sum=0;
		String strTemp="";
		for(int index=0;index<str.length();index++) {
			if(Character.isDigit(str.charAt(index))) 
				strTemp += str.charAt(index);
			else if(!strTemp.equals("")) {
					sum += Integer.parseInt(strTemp);
					strTemp="";
				}
			if(index==str.length()-1 && strTemp != "")
				sum += Integer.parseInt(strTemp);	
		}
		System.out.println("Total sum of digits 2 is: "+sum);
	}
	
	public static void main(String[] args) {
		SumOfDigitString sumOfDigitString = new SumOfDigitString();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.next();
		sumOfDigitString.sumOfDig(str);
		sumOfDigitString.sumOfDigit2(str);
	}
}
