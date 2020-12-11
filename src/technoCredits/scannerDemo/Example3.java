package technoCredits.scannerDemo;

import java.util.Scanner;

public class Example3 {
	void display(String name,int freq) {
		for(int index=1;index<=freq;index++) {
			System.out.println(name);
		}
	}
	
	public static void main(String[] args) {
		Example3 example3 = new Example3();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Name :");
		String name = scanner.next();
		System.out.println("Enter freq : ");
		int freq = scanner.nextInt();
		example3.display(name, freq);
	}
}
