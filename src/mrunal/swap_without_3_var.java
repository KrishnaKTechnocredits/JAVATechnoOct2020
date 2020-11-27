package mrunal;
/*Assignment 20 - Program : 2 
swap 2 numbers without using 3rd variable*/

import java.util.Scanner;
public class swap_without_3_var 
{
	void getSwappedString(String str1, String str2) 
	{
		System.out.println("String1=" + str1 + " String2=" + str2);
		str1 = str1 + str2;
		str2 = str1.substring(0, str1.length() - str2.length());
		str1 = str1.substring(str2.length());
		System.out.println("String1=" + str1 + " String2=" + str2);
	}

public static void main(String[] args)
{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str1 = sc.next();
		System.out.println("Enter String2 : ");
		String str2 = sc.next();

		new swap_without_3_var().getSwappedString(str1, str2);
	}
} 