/*
 	Create a class where user will provide int array. *[ideal Expected Time : 15 mins, Max 
    Time : 25 mins]*
    A) User can provide any positive and negative number
    B) You need to find out how many positive, negative numbers and zeros are there in array 
 */
package ankita;

import java.util.Scanner;

public class PositiveNegativeNumberInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers yoy want to store:");
		int number = sc.nextInt();
		int[] numberArray = new int[number];
		for (int i = 0; i < number; i++) {
			System.out.println("Enter number");
			numberArray[i] = sc.nextInt();
		}
		int positiveCnt = 0, negativeCnt = 0, zeroCnt = 0;
		for (int i = 0; i < numberArray.length; i++) {
			if (numberArray[i] > 0)
				positiveCnt++;
			if (numberArray[i] < 0)
				negativeCnt++;
			if (numberArray[i] == 0)
				zeroCnt++;
		}
		if (positiveCnt > 0)
			System.out.println(positiveCnt + " positive Number present");
		if (negativeCnt > 0)
			System.out.println(negativeCnt + " positive Number present");
		if (zeroCnt > 0)
			System.out.println(zeroCnt + " positive Number present");
	}
}