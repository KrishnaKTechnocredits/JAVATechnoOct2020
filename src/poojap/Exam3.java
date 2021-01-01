/*Exam3: find duplicate from given array.
input : int[] arr = {10,12,55,32,17,12,32};
output : 12
         32

String[] names = {"Techno", "Credits","Techno","Hi","Hello","Hi"};
output : Techno
         Hi
*/

package poojap;

public class Exam3 {

	void duplicateNumber(int[] arry) {
		for (int i = 0; i < arry.length; i++) {
			for (int j = i + 1; j < arry.length; j++) {
				if (arry[i] == arry[j])
					System.out.println("Duplicate Number is: " + arry[j]);
			}

		}
	}

	public static void main(String[] args) {
		Exam3 exam3 = new Exam3();
		int[] arr = { 10, 12, 55, 32, 17, 12, 32 };
		exam3.duplicateNumber(arr);
	}
}
