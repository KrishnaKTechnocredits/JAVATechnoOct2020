package milind.swapping;

import java.util.Scanner;

public class NumberSwapUsing3rdVariable {
	
	void numberSwapping(int numberFirst, int numberSecond) {
		int temp = 0;
		temp = numberFirst;
		numberFirst = numberSecond;
		numberSecond = temp;
		System.out.println("First number after : " + numberFirst + " second number after swap : " + numberSecond );
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int numberFirst = scanner.nextInt();
		System.out.println("Enter second number : ");
		int numberSecond = scanner.nextInt();
		NumberSwapUsing3rdVariable numberSwapUsing3rdVariable = new NumberSwapUsing3rdVariable();
		System.out.println("First number after : " + numberFirst + " second number after swap : " + numberSecond );
		numberSwapUsing3rdVariable.numberSwapping(numberFirst, numberSecond);
		scanner.close();
	}

}
