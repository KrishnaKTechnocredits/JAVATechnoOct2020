package yogita;

import java.util.Arrays;

/*
 * Program 1: WAP to Find Common Element Between Two Arrays


input: 

int array1 [] = [1, 2, 5, 5, 8, 9, 7, 10]
int array2 [] = [1, 0, 6, 15, 6, 4, 7, 0]

output: 1 7

*/
public class FindIdenticalElement {
	void identicalElementFRomArray(int[] array1, int[] array2) {
		System.out.println("Array1 is:" + Arrays.toString(array1));
		System.out.println("Array2 is:" + Arrays.toString(array2));

		System.out.println("Identical Elemets From Array Are:");
		for (int i = 0; i < array1.length; i++) {
			boolean flag = false;
			for (int j = 0; j < array2.length; j++) {
				if (array1[i] == array2[j])
					flag = true;
			}
			if (flag)
				System.out.println(array1[i] + " ");
		}
	}

	public static void main(String[] args) {
		FindIdenticalElement findIdentical = new FindIdenticalElement();
		int[] input1 = { 1, 2, 5, 5, 8, 9, 7, 10 };
		int[] input2 = { 1, 0, 6, 15, 6, 4, 7, 0 };
		findIdentical.identicalElementFRomArray(input1, input2);
	}
}
