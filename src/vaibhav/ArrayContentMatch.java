package vaibhav;

/*Program 1: WAP to Find Common Element Between Two Arrays

input: 

int array1 [] = [1, 2, 5, 5, 8, 9, 7, 10]
int array2 [] = [1, 0, 6, 15, 6, 4, 7, 0]

output: 1 7*/

public class ArrayContentMatch {
	
	public static void arrayMatch(int[] array1, int[] array2) {
		System.out.println("Common Elements are");
		boolean flag = false;
		for (int index = 0; index < array1.length;index++ ) {
			if(array1[index] == array2[index])
				System.out.print(" "+array1[index]);
		}	
	}

	public static void main(String[] args) {
		
		int array1 [] = {1, 2, 5, 5, 8, 9, 7, 10};
		int array2 [] = {1, 0, 6, 15, 6, 4, 7, 0};
		ArrayContentMatch.arrayMatch(array1,array2);	

	}

	

}
