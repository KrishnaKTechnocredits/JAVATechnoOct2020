/*Program : 1 
swap 2 numbers with using 3rd variable*/


package kajol;

import java.util.Scanner;

public class SwapTwoNumbersUsing3rdVariable {
	
	void swapNumbers(int number1, int number2) {
		System.out.println("Before Swaping Number1 : "+number1);
		System.out.println("Before Swaping Number2 : "+number2);
		int temp=number1;
		number1=number2;
		number2=temp;
		System.out.println("After Swaping Number1 : "+number1);
		System.out.println("After Swaping Number2 : "+number2);	
	}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please Enter Numbers To Swap:");
		System.out.println("Number1: ");
		int number1=scanner.nextInt();
		System.out.println("Number2: ");
		int number2=scanner.nextInt();
		new SwapTwoNumbersUsing3rdVariable().swapNumbers(number1, number2);
		scanner.close();
			
	}
}
