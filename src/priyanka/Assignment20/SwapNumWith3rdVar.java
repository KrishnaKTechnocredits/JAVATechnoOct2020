package priyanka.Assignment20;

/*Program : 1 
swap 2 numbers with using 3rd variable
*/

import java.util.Scanner;

public class SwapNumWith3rdVar {

	void swapNumber(int num1, int num2) {
		int temp;
		System.out.println("The values of Number1 and Number2 before swapping are " + num1+" " + num2);
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("The values of Number1 and Number2 after swapping are " + num1+" " + num2);	
	}

	public static void main(String[] a) {
		SwapNumWith3rdVar swapNumWith3rdVar = new SwapNumWith3rdVar();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first no");
		int num1 = scanner.nextInt();
		System.out.println("Enter second no");
		int num2 = scanner.nextInt();
		swapNumWith3rdVar.swapNumber(num1, num2);
	}
}
