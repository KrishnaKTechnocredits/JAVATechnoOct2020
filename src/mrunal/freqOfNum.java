package mrunal;
/*
Program 2:  [ Optional ]
Create a class where you need to check given number is there in predefined array or not,
if present then print frequency of the number. [Estimated time: 15 mins]
Input : Predefined array -> {10,3,9,-99,81,3,-11}
Number to be check -> 33
Output : Given number 33 is not present in predefined array.
Input : Number to be check -> 3
output : Given number 3 is present in predefined array with frequency 2.*/

import java.util.Scanner;

public class freqOfNum{
	void checkNumberInArray(int[] numArray, int givenNumber) {
		int count=0;
		for(int index=0; index<numArray.length;index++) {
			if(numArray[index]==givenNumber)
				count++;
		}
		if(count>0)
			System.out.println("Given number "+ givenNumber+ 
					" is present in predefined array with frequency "+count);
		else
			System.out.println("Given number "+ givenNumber+ 
					" is not present in predefined array");
	}
	public static void main(String[] args) {
		int numberArray[] = {10,3,9,-99,81,3,-11};
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter number you want to "
				+ "search in predefined array: ");
		int givenNumber=scanner.nextInt();
		new freqOfNum().checkNumberInArray(numberArray,givenNumber);
		scanner.close();
	}
}
