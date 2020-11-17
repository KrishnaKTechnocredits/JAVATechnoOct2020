package deepak;

import java.util.Scanner;

public class SwapWithoutThirdVaraible {
	
	void swapWithoutThirdVariable(int x, int y) {
		
		System.out.println("Before Swaping Value at num1 : "+ x);
		System.out.println("Before Swaping Value at num2 : "+ y);
		
		x = x + y;
		y = x - y;
		x = x - y;
		
		System.out.println("After Swaping Value at num1 : "+ x);
		System.out.println("After Swaping Value at num2 : "+ y);
	}
	

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter First Number: ");
		int firstNo = scanner.nextInt();
		System.out.println("Please Enter Second Number: ");
		int secondNo = scanner.nextInt();

		SwapWithoutThirdVaraible swapWithoutThirdVaraible =  new SwapWithoutThirdVaraible();
				swapWithoutThirdVaraible.swapWithoutThirdVariable(firstNo, secondNo);
	}

}
