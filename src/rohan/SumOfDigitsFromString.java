package rohan;

import java.util.Scanner;

/*
 * Assignment - 25 : 22nd Nov'2020 

Program 1: sum of all numbers from give string.  

String msg = I have 15 years and 2 months of experience.

hint : Integer.parseInt(String input) will help to convert string to int.
you may need spilt, charAt method as well. 

 Raise PR before tuesday EOD
 */

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		SumOfDigitsFromString sumOfDigitsFromString = new SumOfDigitsFromString();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		sumOfDigitsFromString.addNumbersFromString(str);
		sc.close();
	}
	
	void addNumbersFromString(String str) {
			String[] strArr = str.split(" ");
			String strTemp = "";
			int sum=0;
			for(int index=0;index<strArr.length;index++) {
				for(int innerIndex=0;innerIndex<strArr[index].length();innerIndex++) {
					char ch = strArr[index].charAt(innerIndex);
					if(index==strArr.length-1 && Character.isDigit(ch))
						strTemp += Character.getNumericValue(ch);
					else if(Character.isDigit(ch)) 
						strTemp += Character.getNumericValue(ch);
					else if(!strTemp.equals("")) {
						sum += Integer.parseInt(strTemp);
						strTemp = "";
					}
				}
			}
			sum += Integer.parseInt(strTemp);
			System.out.println("Total Sum of digits in string line is: "+sum);
	}
}
