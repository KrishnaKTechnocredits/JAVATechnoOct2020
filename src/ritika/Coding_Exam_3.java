/*
 * Exam3: find duplicate from given array.
input : int[] arr = {10,12,55,32,17,12,32};
output : 12
32

String[] names = {"Techno", "Credits","Techno","Hi","Hello","Hi"};
output : Techno
Hi
*/

package ritika;

public class Coding_Exam_3 {

	void findDuplicateValueInArray(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
				for (int j = 0; j < arr.length; j++) {
					if (arr[i].equals(arr[j]))
						count++;
				}
			if (count > 1) {
				System.out.println(arr[i]);
				arr[i] = " ";
			}
		}
	}
	public static void main(String[] args) {
		String[] input = { "Techno", "Credits", "Techno", "Hi", "Hello", "Hi" };
		Coding_Exam_3 exam3 = new Coding_Exam_3();
		exam3.findDuplicateValueInArray(input);
	}
}
