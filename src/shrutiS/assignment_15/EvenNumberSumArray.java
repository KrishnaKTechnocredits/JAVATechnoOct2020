/*Program 3 :  [ Optional ]
    You need to store user input in array and do sum of even numbers only from created 
     array. [ideal Expected Time : 10 mins, Max Time : 15 mins]

     Example :
     Input : {10,5,7,3,1,5,9,30}
     Output: 40*/

package shrutiS.assignment_15;

import java.util.Scanner;

public class EvenNumberSumArray {

	void sumOfEvenNumber(int[] numArray) {
		int sum = 0;
		for (int index = 0; index < numArray.length; index++) {
			if (numArray[index] % 2 == 0)
				sum += numArray[index];
		}
		System.out.println("}\nSum of even numbers in array is " + sum);
	}

	public static void main(String[] args) {
		EvenNumberSumArray evenNumberSum = new EvenNumberSumArray();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array");
		int length = sc.nextInt();
		int[] numArray = new int[length];
		System.out.println("Enter the numbers for the array");
		for (int index = 0; index < length; index++) {
			numArray[index] = sc.nextInt();
		}
		System.out.print("Array of number as input {");
		for (int j = 0; j < length; j++) {
			System.out.print(numArray[j] + ",");
		}
		evenNumberSum.sumOfEvenNumber(numArray);
	}
}
