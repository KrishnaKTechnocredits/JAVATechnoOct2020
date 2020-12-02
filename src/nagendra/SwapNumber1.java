package nagendra;
import java.util.Scanner;

/*
swap 2 numbers without using 3rd variable
*/

public class SwapNumber1 {

	void swapNumbers(int firstNumber, int secondNumber) {
		System.out.println("<--Number After Swapping --->");
		firstNumber = firstNumber + secondNumber;
		secondNumber = firstNumber - secondNumber;
		firstNumber = firstNumber - secondNumber;
		System.out.println("First Number  is:" + firstNumber);
		System.out.println("Second Number is:" + secondNumber);
	}

	public static void main(String[] args) {
		SwapNumber1 number = new SwapNumber1();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First Number :");
		int firstNumber = scanner.nextInt();
		System.out.println("Enter Second Number: ");
		int secondNumber = scanner.nextInt();
		number.swapNumbers(firstNumber, secondNumber);
		scanner.close();
	}
}
