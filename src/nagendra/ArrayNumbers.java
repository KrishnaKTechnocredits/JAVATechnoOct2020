package nagendra;

import java.util.Scanner;
/*
Create a class where user will provide int array. *[ideal Expected Time : 15 mins, Max 
Time : 25 mins]*
A) User can provide any positive and negative number
B) You need to find out how many positive, negative numbers and zeros are there in array 
*/

public class ArrayNumbers {
	
	void findSumOfEvenNumbers(int[] input){
		int positive=0;
		int negative=0;
		int zero=0;
		for(int index=0;index<input.length;index++){
			if(input[index]>0)
				positive++;
			else if(input[index]<0)
				negative++;
			else 
				zero++;		
			}
		System.out.println("Total Positive Values are "+positive);
		System.out.println("Total Negative Values are "+negative);
		System.out.println("Total  Zero Values are "+zero);
		
		}
	public static void main(String[] args) {
		ArrayNumbers object=new ArrayNumbers();
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


