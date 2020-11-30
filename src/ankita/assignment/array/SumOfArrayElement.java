/*
  	Program 3 :  [ Optional ]
    You need to store user input in array and do sum of even numbers only from created 
     array. [ideal Expected Time : 10 mins, Max Time : 15 mins]

     Example :
     Input : {10,5,7,3,1,5,9,30}
     Output: 40
 */
package ankita.assignment.array;

import java.util.Scanner;

public class SumOfArrayElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter How many number you wnt to store");
		int number = sc.nextInt();
		int[] numberArray = new int[number];
		for (int i = 0; i < number; i++) {
			System.out.println("Enter number");
			numberArray[i] = sc.nextInt();
		}
		int sum = 0;
		for (int i = 0; i <= numberArray.length - 1; i++) {
			if (numberArray[i] % 2 == 0) {
				sum += numberArray[i];
			}
		}
		System.out.println("Sum of even numbers from user input number:" + sum);
	}
}