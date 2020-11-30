package technoCredits.scannerDemo;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		Example4 example4 = new Example4();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter char : ");
		char c = scanner.next().charAt(3);
		System.out.println("Entered char is " + c);
	}
}
