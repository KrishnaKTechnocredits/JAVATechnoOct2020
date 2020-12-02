package sadhana;

/*
Assignment 19
Program : 1 
WAP to print Reverse a given String.
input : This is technocredits
output : stiderconhcet si sihT  */



import java.util.Arrays;
import java.util.Scanner;

public class StringReverse {

	void printReverseString(String name) {
		System.out.print("Reverse string is : ");
		for (int index = name.length() - 1; index >= 0; index--) {
			System.out.print(name.charAt(index));
		}
	}

	public static void main(String[] args) {
		StringReverse stringReverse = new StringReverse();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to reverse ");
		String input = sc.nextLine();
		stringReverse.printReverseString(input);
	}
}