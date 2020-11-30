package technoCredits.scannerDemo;

import java.util.Scanner;

public class Example6 {

	static void display(String[] arr) {
		for (int index = 0; index < arr.length; index++) {
			System.out.println(arr[index]);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many number would like to enter : ");
		int length = sc.nextInt(); // 5
		String[] number = new String[length];
		for (int index = 0; index < length; index++) {
			System.out.println("Enter number " + (index + 1));
			number[index] = sc.next();
		}
		Example6.display(number);
	}
}
