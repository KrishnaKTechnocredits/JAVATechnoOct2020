package anurag;

//Assignment 20
//swap 2 numbers without using 3rd variable

public class SwapWithoutUsingThirdVariable {

	void display(int a, int b) {
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("Swapped values of a & b are " + a + " and " + b);
	}

	public static void main(String[] args) {
		SwapWithoutUsingThirdVariable swapwithoutusingthirdvariable = new SwapWithoutUsingThirdVariable();
		System.out.println("Initial values of a and b are 5 and 10 respectively");
		swapwithoutusingthirdvariable.display(5, 10);

	}

}
