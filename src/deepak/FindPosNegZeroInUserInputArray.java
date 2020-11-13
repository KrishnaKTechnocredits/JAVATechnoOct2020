package deepak;

import java.util.Scanner;

public class FindPosNegZeroInUserInputArray {
	
	int posNumbersCount, negNumbersCount, zeroCount;

	int positiveNumberInArray(int[] input) {
		
		for(int index=0; index < input.length; index++) {
			if(input[index] > 0)
				posNumbersCount++;
		}
		return posNumbersCount;
	}
	int negNumbersCount(int[] input) {
		for(int index=0; index < input.length; index++) {
			if(input[index] < 0)
				negNumbersCount++;
		}
		return negNumbersCount;
	}
	
	int zeroCount(int[] input, int digit) {
		
		for(int index=0; index < input.length; index++) {
			if(input[index]==0)
				zeroCount++;	
		}
		return zeroCount;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for(int index=0; index < arr.length; index++) {
			System.out.println("Please enter Array Elements");
			arr[index] = sc.nextInt();
		}	
		FindPosNegZeroInUserInputArray findPosNegZeroInUserInputArray = new FindPosNegZeroInUserInputArray();
		System.out.println("Zero occurances found "+ findPosNegZeroInUserInputArray.zeroCount(arr, 0)+ " times");
		System.out.println("Total Positive numbers in given array :"+ findPosNegZeroInUserInputArray.positiveNumberInArray(arr));
		System.out.println("Total Negative numbers in given array :"+ findPosNegZeroInUserInputArray.negNumbersCount(arr));
	}
}
