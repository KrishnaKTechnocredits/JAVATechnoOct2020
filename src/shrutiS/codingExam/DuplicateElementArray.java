/*Exam3: find duplicate from given array.
input : int[] arr = {10,12,55,32,17,12,32};
output : 12
         32

String[] names = {"Techno", "Credits","Techno","Hi","Hello","Hi"};
output : Techno
         Hi*/

package shrutiS.codingExam;

public class DuplicateElementArray {

	void duplicateElementInt(int[] input) {

		for (int index = 0; index < input.length; index++) {
			int count = 0;
			for (int innerIndex = 0; innerIndex < input.length; innerIndex++) {
				if (input[index] == input[innerIndex]) {
					count++;
				}
			}
			if (count > 1)
				System.out.println(input[index] + " is Duplicate");
		}
	}

	void duplicateElementString(String[] input) {
		for (int index = 0; index < input.length; index++) {
			int count = 0;
			for (int innerIndex = 0; innerIndex < input.length; innerIndex++) {
				if (input[index] == input[innerIndex]) {
					count++;
				}
			}
			if (count > 1)
				System.out.println(input[index]+ " is Duplicate");
		}
	}

	public static void main(String[] args) {
		DuplicateElementArray duplicatElement = new DuplicateElementArray();
		int[] input1 = { 10, 12, 55, 32, 17, 12, 32 };
		String[] input2 = { "Techno", "Credits", "Techno", "Hi", "Hello", "Hi" };
		duplicatElement.duplicateElementInt(input1);
		duplicatElement.duplicateElementString(input2);
	}
}
