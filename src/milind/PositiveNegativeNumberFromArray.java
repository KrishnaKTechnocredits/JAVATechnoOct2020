package milind;

import java.util.Scanner;

public class PositiveNegativeNumberFromArray {
	
	static void getPositiveNegativeNumber(int[] array) {
		 int positiveCount = 0, negativeCount = 0 , zerocount = 0;
		 for(int index1 = 0; index1< array.length; index1++) {
			 if(array[index1] > 0) {
				 positiveCount++;
			 }else if(array[index1] < 0) {
				 negativeCount++;
			 }else {
				 zerocount++;
			 }
		 }
		 System.out.println("Total positive number in array : " + positiveCount);
		 System.out.println("Total negative number in array : " + negativeCount);
		 System.out.println("Total zero in array : " + zerocount);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array length");
		int arrayLength = scanner.nextInt();
		int[] arrayOfInt = new int[arrayLength];
		for(int index = 0; index < arrayLength; index++) {
			System.out.println("Enter " + (index+1) + " array element : ");
			arrayOfInt[index] = scanner.nextInt();
		}
		getPositiveNegativeNumber(arrayOfInt);
		scanner.close();
	}

}
