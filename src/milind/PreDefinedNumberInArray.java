package milind;

import java.util.Scanner;

public class PreDefinedNumberInArray {
	
	static void checkPredifinedNumber(int [] array, int number) {
		int tempCount = 0;
		for(int index1 = 0; index1 < array.length; index1++) {
			if(array[index1] == number) {
				tempCount++;
			}
		}
		if(tempCount > 0) {
			System.out.println("Given number " + number + " is present in predefined array with frequency " + tempCount + ".");
		}else {
			System.out.println("Given number " + number + " is not present in predefined array.");
		}
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
		System.out.println("Enter Number for check predefined : ");
		int number = scanner.nextInt();
		checkPredifinedNumber(definedArray, number);
		scanner.close();
	}

}
