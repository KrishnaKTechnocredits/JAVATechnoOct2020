package priyanka.Assignment31;

import java.util.Scanner;

/*Assignment 31 :  2nd Dec 2020
Program 1: 
Convert UpperCase into a LowerCase using ASCII 
Given String = "TechnoCreditS"
Expected String = "technocredits"*/

public class UpperCaseIntoLowerCase {

	void convertUpperLowerUsingASCII(String name) {
		String temp = "";
		char ch1;
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			int ascii = ch;
			if (ascii >= 65 && ascii <= 90) {
				ch1 = (char) (ch + 32);
				temp = temp + ch1;
			}
			if (ascii >= 97 && ascii <= 122) {
				ch1 = (char) (ch - 32);
				temp = temp + ch1;
			}
		}
		System.out.println("After Conversion the string is:" + temp);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = scanner.next();
		System.out.println("String is:" + str);
		new UpperCaseIntoLowerCase().convertUpperLowerUsingASCII(str);
	}

}
