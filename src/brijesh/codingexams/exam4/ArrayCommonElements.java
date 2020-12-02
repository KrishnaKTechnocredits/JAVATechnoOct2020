package brijesh.codingexams.exam4;

import java.util.Arrays;

/*
WAP to Find Common Element Between Two Arrays

input: 

int array1 [] = [1, 2, 5, 5, 8, 9, 7, 10]
int array2 [] = [1, 0, 6, 15, 6, 4, 7, 0]
*/

public class ArrayCommonElements {
	
	void findArrayCommonElements(int[] array1, int[] array2) {
		System.out.println("Input Array1: "+Arrays.toString(array1));
		System.out.println("Input Array2: "+Arrays.toString(array2));
		System.out.println("Common Elements in two array:");
		for(int index=0; index<array1.length; index++) {
			for(int innerIndex =0; innerIndex < array2.length; innerIndex++) {
				if(array1[index]==array2[innerIndex]) {
					System.out.print(array1[index]+" ");
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		int array1 [] = {1, 2, 5, 5, 8, 9, 7, 10};
		int array2 [] = {1, 0, 6, 15, 6, 4, 7, 0};
		new ArrayCommonElements().findArrayCommonElements(array1, array2);
	}
}
