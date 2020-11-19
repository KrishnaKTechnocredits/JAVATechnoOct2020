package ankit.Scanner;

import java.util.Scanner;

public class SwapingConcept {
	
	static void swapNumberUsingThirdVariable(int number1, int number2) {
		int temp=0;
		System.out.println("Initially, Numbers are: Number1 is: "+number1+ " & Number2 is: "+number2);
		temp=number1;
		number1=number2;
		number2=temp;
		System.out.println("After swaping, Number1 is: "+number1+ " & Number2 is: "+number2);
	}
	
	static void swapNumberWithoutUsingThirdVariable(int number1, int number2) {
		System.out.println("Initially, Numbers are: Number1 is: "+number1+ " & Number2 is: "+number2);
		 number1 = number1+number2;
		 number2=number1-number2;
		 number1=number1-number2;
		 System.out.println("After swaping, Number1 is: "+number1+ " & Number2 is: "+number2);	 
	}
	
	static void swapStringUsingThirdVariable(String stringOne, String stringTwo ) {
		String temp=null;
		System.out.println("Initially, Strings are: StringOne is: "+stringOne+ " & StringTwo is: "+stringTwo);
		temp = stringOne;
		stringOne=stringTwo;
		stringTwo=temp;
		System.out.println("After swaping, StringOne is: "+stringOne+ " & StringTwo is: "+stringTwo);
	}
	
	static void swapStringUsingInBuitMethod(String stringOne, String stringTwo) {
		int length1 = stringOne.length();
		System.out.println("Initially, Strings are: StringOne is: "+stringOne+ " & StringTwo is: "+stringTwo);
		stringOne=stringOne+stringTwo;
		stringTwo=stringOne.substring(0,length1);
		stringOne=stringOne.substring(length1);
		System.out.println("After swaping, StringOne is: "+stringOne+ " & StringTwo is: "+stringTwo);
		

		
		
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("You want test swapping concept using number or String.");
		System.out.println("For number Enter A and for String Enter B");
		String userAction = scanner.next();
		if (userAction.equalsIgnoreCase("A")) {
			System.out.println("Enter the two number you want to swap");
			System.out.println("Enter number one: ");
			int number1 =scanner.nextInt();
			System.out.println("Enter number two: ");
			int number2=scanner.nextInt();
			System.out.println("Swapped numbers using temporary variable");
			swapNumberUsingThirdVariable(number1, number2);
			System.out.println("Swapped numbers without using temporary variable");
			swapNumberWithoutUsingThirdVariable(number1, number2);
		}
		if (userAction.equalsIgnoreCase("B")) {
			System.out.println("Enter the two strings you want to swap");
			System.out.println("Enter string one: ");
			String stringOne =scanner.next();
			System.out.println("Enter string two: ");
			String stringTwo=scanner.next();
			System.out.println("Swapped string using temporary variable");
			swapStringUsingThirdVariable(stringOne,stringTwo);
			System.out.println("Swapped string using in built method");
			swapStringUsingInBuitMethod(stringOne,stringTwo);
		}
		else
			System.out.println("You have entered the wrong input");
	scanner.close();	
	}

}
