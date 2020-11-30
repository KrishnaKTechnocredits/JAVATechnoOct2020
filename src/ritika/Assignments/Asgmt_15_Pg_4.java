package ritika.Assignments;

import java.util.Scanner;

/*
Program 4 : [ Optional ]
Create a class where user will provide int array. *[ideal Expected Time : 15 mins, Max
Time : 25 mins]*

A) User can provide any positive and negative number
B) You need to find out how many positive, negative numbers and zeros are there in array
*/

public class Asgmt_15_Pg_4 {

	void checkTypeOfNumbersInArray(int[] array) {
		int positiveCnt = 0;
		int negativeCnt = 0;
		int zerosCnt = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0)
				positiveCnt++;
			else if (array[i] < 0)
				negativeCnt++;
			else
				zerosCnt++;
		}
		System.out.println("Positive numbers count in input array is " + positiveCnt);
		System.out.println("Negative numbers count in input array is " + negativeCnt);
		System.out.println("Zeroes count in input array is " + zerosCnt);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array you want to define:");
		int length = sc.nextInt();
		int[] input = new int[length];
		for (int index = 0; index < input.length; index++) {
			System.out.println("Enter number for index " + index);
			input[index] = sc.nextInt();
		}
		Asgmt_15_Pg_4 program4 = new Asgmt_15_Pg_4();
		program4.checkTypeOfNumbersInArray(input);

	}
}