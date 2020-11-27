package technoCredits.scannerDemo;

import java.util.Scanner;

public class Example5 {

	static void display(int[] arr) {
		for(int index=0;index<arr.length;index++) {
			System.out.println(arr[index]);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many number would like to enter : ");
		int length = sc.nextInt(); // 5
		int[] number = new int[length];
	
		for(int index=0;index<length;index++) {
			System.out.println("Enter number " + (index+1));
			number[index] = sc.nextInt(); 
		}
		Example5.display(number);
	}
}
