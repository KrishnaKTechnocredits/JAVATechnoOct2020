/*You need to store user input in array and do sum of even numbers only from created 
     array. [ideal Expected Time : 10 mins, Max Time : 15 mins]

     Example :
     Input : {10,5,7,3,1,5,9,30}
     Output: 40 */


package deepak;

import java.util.Scanner;

public class SumOfEvenInArrayUserInput {
	
	int sum(int[] input) {
		int sum=0;
		for(int index=0; index < input.length; index++) {
			if(input[index]%2==0) {
				sum = sum + input[index];
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for(int index=0; index < arr.length; index++) {
			System.out.println("Please enter Array Elements");
			arr[index] = sc.nextInt();
		}
		SumOfEvenInArrayUserInput sumOfEvenInArrayUserInput = new SumOfEvenInArrayUserInput();
		System.out.println("Sum of Even numbers in given array :"+ sumOfEvenInArrayUserInput.sum(arr));

	}

}
