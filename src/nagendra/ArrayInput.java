package nagendra;

import java.util.Scanner;

/*
You need to store user input in array and do sum of even numbers only from created 
array. [ideal Expected Time : 10 mins, Max Time : 15 mins]
Example :
Input : {10,5,7,3,1,5,9,30}
Output: 40
*/

public class ArrayInput {
	
	void findSumOfEvenNumbers(int[] input){
		int sum=0;
		for(int index=0;index<input.length;index++){
			if(input[index]%2==0){
				sum+=input[index];
			}
		}
		System.out.println("Sum of even Numbers is "+sum);
	}

	public static void main(String[] args) {
		ArrayInput object=new ArrayInput();
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many Number do you want to integer array ");
		int input = scanner.nextInt();
		int[] userInput = new int[input];
		for (int i = 0; i < userInput.length; i++) {
			System.out.println("Input interger:" + (i + 1) + " ");

			userInput[i] = scanner.nextInt();
		}
		object.findSumOfEvenNumbers(userInput);
		scanner.close();
	}
}
