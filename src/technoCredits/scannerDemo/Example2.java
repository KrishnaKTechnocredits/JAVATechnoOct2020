package technoCredits.scannerDemo;

import java.util.Scanner;

public class Example2 {
	void display(String name) {
		for(int index=1;index<=5;index++) {
			System.out.println(name);
		}
	}
	
	public static void main(String[] args) {
		Example2 example2 = new Example2();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Name :");
		example2.display(scanner.next());
	}
}
