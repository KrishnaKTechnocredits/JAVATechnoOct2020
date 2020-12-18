package rohan.Assignment39;
/*
Program - 4: 
Create a class Addition and write add method for:
a) add two integers
b) add two decimal
c) add two String
 */

public class Addition {
	
	void add(int num1,int num2) {
		System.out.println("Sum of Integer numbers: "+(num1+num2));
	}
	
	void add(double no1,double no2) {
		System.out.println("Sum of Decimal numbers: "+(no1+no2));
	}
	
	void add(String s1,String s2) {
		System.out.println("Sum of two strings: "+(s1+s2));
	}
	
	public static void main(String[] args) {
		Addition addition = new Addition();
		addition.add(5,5);
		addition.add(19.5, 20.45);
		addition.add("Rohan ", "Mahadik");
	}
}
