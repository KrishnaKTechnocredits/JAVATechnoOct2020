package deepak;

import java.util.Scanner;

public class NumberOccuranceInArray {
	
	int occurance(int[] input, int num) {
		int count=0;
		for( int i=0; i < input.length; i++) {
			if(input[i]== num) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {10, 85, 71, 59, 63, 71};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to Find");
		
		int num = sc.nextInt();
		
		NumberOccuranceInArray refVar = new NumberOccuranceInArray();
		
		System.out.println("Occurances of given number: "+ refVar.occurance(arr, num) + " Times");

	}

}
