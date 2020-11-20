package technoCredits.scannerDemo;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		Example1 example1 = new Example1();
		/// Excel
		int num1 = 30;
		int num2 = 90;
		example1.add(num1, num2);
		
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		example1.add(num1, num2);
	}
}
