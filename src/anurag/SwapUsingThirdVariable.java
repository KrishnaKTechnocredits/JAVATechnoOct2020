package anurag;

//Assignment 20
//swap 2 numbers with using 3rd variable


public class SwapUsingThirdVariable {

	void display(int a, int b) {
		int c = a + b;
		b = c - b;
		a = c - b;
		System.out.println("Swapped values of a & b are " + a + " and " + b);
	}

	public static void main(String[] args) {
		SwapUsingThirdVariable swapusingthirdVariable = new SwapUsingThirdVariable();
		System.out.println("Initial values of a and b are 5 and 10 respectively");
		swapusingthirdVariable.display(5, 10);
	}

}
