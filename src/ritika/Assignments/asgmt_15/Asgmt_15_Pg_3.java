package ritika.Assignments.asgmt_15;

import java.util.Scanner;

/*
Program 3 : [ Optional ]
You need to store user input in array and do sum of even numbers only from created
array. [ideal Expected Time : 10 mins, Max Time : 15 mins]

Example :
Input : {10,5,7,3,1,5,9,30}
Output: 40
*/

public class Asgmt_15_Pg_3 {
	
	void sumOfEvenNumbersOfArray(int[] array) {
		int sum=0;
		for (int i=0; i<array.length; i++) {
			if (array[i]%2 == 0) {
				sum = sum+array[i];
			}
		}
		System.out.println("Sum of all the even numbers present in input array is " +sum);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array you want to define:");
		int length = sc.nextInt();
		int[] input = new int[length];
		for (int index=0; index<input.length; index++) {
			System.out.println("Enter number for index " +index);
			input[index] = sc.nextInt();
		}
		Asgmt_15_Pg_3 program3 = new Asgmt_15_Pg_3();
		program3.sumOfEvenNumbersOfArray(input);
		
	}
}