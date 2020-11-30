package milind.swapping;

import java.util.Scanner;

public class NumberSwapWithout3rdVariable {
	
	void numberSwapping(int numberFirst, int numberSecond) {
		numberFirst = numberFirst + numberSecond;
		numberSecond = numberFirst - numberSecond;
		numberFirst = numberFirst - numberSecond;
		System.out.println("First number : " + numberFirst + " second number : " + numberSecond);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int firstNumner = scanner.nextInt();
		System.out.println("Enter second number : ");
		int secondNumber = scanner.nextInt();
		NumberSwapWithout3rdVariable numberSwapWithout3rdVariable = new NumberSwapWithout3rdVariable();
		System.out.println("First number : " + firstNumner + " second number : " + secondNumber);
		numberSwapWithout3rdVariable.numberSwapping(firstNumner, secondNumber);
		scanner.close();
	}

}
