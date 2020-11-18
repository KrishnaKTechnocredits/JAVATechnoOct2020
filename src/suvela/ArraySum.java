package suvela;

import java.util.Scanner;

public class ArraySum {
	int sum(int[] array) {
		int sum=0;
		for (int index = 0; index < array.length; index++) {
			if(array[index]%2==0)
				sum = sum +array[index];
		}
		return sum;
	}
	public static void main(String[] args) {
		ArraySum a= new ArraySum();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array:");
		int length = sc.nextInt();

		int[] array = new int[length];
		for (int index = 0; index < length; index++) {
			System.out.println("Enter new number:");
			array[index] = sc.nextInt();
		}
		int sum=a.sum(array);
		System.out.println("Sum of even numbers is : " +sum);
	}

}
