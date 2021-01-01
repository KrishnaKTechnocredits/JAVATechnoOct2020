package technoCredits.scannerDemo;

import java.util.Scanner;

public class Example1 {
	void add(int num1, int num2) {
		int ans = num1 + num2;
		System.out.println("ans is " + ans);
		String name = "Technocrdits";
	}
	
	public static void main(String[] args) {
		Example1 example1 = new Example1();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first Input :");
		int num1 = scanner.nextInt();
		System.out.println("Enter second Input :");
		int num2 = scanner.nextInt();
		example1.add(num1,num2);
	}
}
