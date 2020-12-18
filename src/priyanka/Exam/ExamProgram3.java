package priyanka.Exam;

import java.util.Arrays;

/*Exam3: find duplicate from given array.
input : int[] arr = {10,12,55,32,17,12,32};
output : 12
         32

String[] names = {"Techno", "Credits","Techno","Hi","Hello","Hi"};
output : Techno
         Hi
*/
public class ExamProgram3 {

	void duplicateNumber(int[] numbers) {

		for (int index = 0; index < numbers.length; index++) {
			for (int innerIndex = 0; innerIndex < numbers.length; innerIndex++) {
				if (numbers[index] == numbers[innerIndex])
					if(index<innerIndex) {
					System.out.println("The Duplicate no is  : " + numbers[innerIndex]);
					break;
					}else if (innerIndex<index)
						break;
			}
		}
	}

	void duplicateWords(String[] str) {

		for (int index = 0; index < str.length; index++) {
			for (int innerIndex = 0; innerIndex < str.length; innerIndex++) {
				if (str[index] == str[innerIndex])
					if(index<innerIndex) {
						System.out.println("The Duplicate string is  : " + str[innerIndex]);
						break;
						}else if (innerIndex<index)
							break;
			}
		}
	}

	public static void main(String[] a) {
		ExamProgram3 examProgram3 = new ExamProgram3();
		int[] arr = { 10, 12, 55, 32, 17, 12, 32, 32, 12, 32, 12, 14 };
		String[] names = { "Techno", "Credits", "Techno", "Hi", "Hello", "Hi", "Hi","Techno", "Hi", "Hi" };
		System.out.println("The given Array is  " + Arrays.toString(arr));
		examProgram3.duplicateNumber(arr);
		System.out.println("************************************************* ");
		System.out.println("The given Array is  " + Arrays.toString(names));
		examProgram3.duplicateWords(names);
	}
}
