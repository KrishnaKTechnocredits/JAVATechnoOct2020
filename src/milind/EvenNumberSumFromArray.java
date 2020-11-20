package milind;

import java.util.Scanner;

public class EvenNumberSumFromArray {
	
	static void sumOfEventNumber(int[] array) {
		int sum = 0;
		for(int index1 = 0; index1 < array.length; index1++) {
			if(array[index1] % 2 == 0) {
				sum = sum + array[index1];
			}
		}
		System.out.println("Sum of even numbers is : " + sum);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter length of array : " );
		int arrayLength = scanner.nextInt();
		int[] definedArray = new int[arrayLength];
		for(int index = 0; index < arrayLength; index++) {
			System.out.println("Enter " + (index+1) + " array element : " );
			definedArray[index] = scanner.nextInt();
		}
		sumOfEventNumber(definedArray);
		scanner.close();
	}
}
