package brijesh.assignment29;

import java.util.Arrays;

/*
Find second maximum from array without sorting the array. 
*/

public class ArraySecondMax {
	
	public int findMax(int[] input) {
		int max=input[0];
		for(int index=1; index<input.length; index++) {
			if(input[index]>max)
				max=input[index];
			}
		return max;
	}
	
	public void findSecondMax(int[] input) {
		int max=findMax(input);
		int secondMax=input[0];
		for(int index=1; index<input.length; index++) {
			if(input[index]>secondMax && input[index]<max)
				secondMax=input[index];
		}
		System.out.println("Second Max: "+secondMax);
	}

	public static void main(String[] args) {
		int[] input = {10,77,20,6,40,55,33,99};
		System.out.println("Input Array: "+Arrays.toString(input));
		new ArraySecondMax().findSecondMax(input);
	}
}
