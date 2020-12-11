package tejashree;

import java.util.Scanner;

//WAP to swap two variables without using third variable
public class Assignment20_Program2 {
	
		void swapNumbers(int num1, int num2) {
			System.out.println("Before Swaping num1 : " + num1+" "+num2);
			num1 = num1+num2;
			num2 = num1-num2;
			num1=num1-num2;
			System.out.println("After Swaping num1 : " + num1+" "+num2);
			
		}

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please Enter Numbers To Swap:");
			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();
			new Assignment20_Program2().swapNumbers(num1, num2);

		}
}