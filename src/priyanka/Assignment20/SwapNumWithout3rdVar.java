package priyanka.Assignment20;

/*Program : 2 
swap 2 numbers without using 3rd variable
*/
import java.util.Scanner;

public class SwapNumWithout3rdVar {
	
	void swapNumber(int num1, int num2) {
		System.out.println("The values of Number1 and Number2 before swapping are " + num1+" " + num2);
		num1 = num1+num2;
		num2 = num1-num2;
		num1 = num1-num2;
		System.out.println("The values of Number1 and Number2 after swapping are " + num1+" " + num2);	
	}

	public static void main(String[] a) {
		SwapNumWithout3rdVar swapNumWithout3rdVar = new SwapNumWithout3rdVar();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first no");
		int num1 = scanner.nextInt();
		System.out.println("Enter second no");
		int num2 = scanner.nextInt();
		swapNumWithout3rdVar.swapNumber(num1, num2);
	}
}
