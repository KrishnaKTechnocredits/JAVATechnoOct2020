package priyanka.Exam;

import java.util.Arrays;

/*Program 1: WAP to Find Common Element Between Two Arrays

input: 

int array1 [] = [1, 2, 5, 5, 8, 9, 7, 10]
int array2 [] = [1, 0, 6, 15, 6, 4, 7, 0]

output: 1 7*/

public class ExamProgram4 {

	void examProgramCommonElement(int arr1[], int arr2[]) {

		System.out.println("The Common Elements ");
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.print("  " + arr1[i] + " ");
					break;
				}
			}
		}
	}

	public static void main(String[] arg) {
		ExamProgram4 examProgram4 = new ExamProgram4();
		int arr1[] = { 1, 2, 5, 5, 8, 9, 7, 10 };
		int arr2[] = { 1, 0, 6, 15, 6, 4, 7, 0 };
		System.out.println("The Array 1 is  " + Arrays.toString(arr1));
		System.out.println("The Array 2 is  " + Arrays.toString(arr2));
		examProgram4.examProgramCommonElement(arr1, arr2);
	}
}
