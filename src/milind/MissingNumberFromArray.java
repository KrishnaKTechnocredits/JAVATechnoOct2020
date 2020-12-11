package milind;

import java.util.Scanner;

public class MissingNumberFromArray {
	
	void getMissingNumber(int[] input) {
		for(int index = 1; index <= input.length; index++) {
			boolean flag = true;
			for(int innerIndex = 0; innerIndex < input.length; innerIndex++) {
				if(input[innerIndex] == index) {
					flag = false;
					break;
				}
			}
			if(flag) {
				System.out.println("Missing number from Array : " + index);
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arrayInput = new int[10];
		Scanner scanner = new Scanner(System.in);
		
		for(int index = 0; index < arrayInput.length; index++) {
			System.out.println("Enter " + index + " element of array : " );
			arrayInput[index] = scanner.nextInt();
		}
		
		MissingNumberFromArray missingNumberFromArray = new MissingNumberFromArray();
		missingNumberFromArray.getMissingNumber(arrayInput);
		scanner.close();
	}
}
