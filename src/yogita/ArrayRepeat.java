/*
 WAP to Duplicate number from Array
 
*/

package yogita;

public class ArrayRepeat {

	void arrayRepeat(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j])
					System.out.println("Repeated number from array  is:" + arr[j]);

			}
		}

	}

	public static void main(String[] args) {
		ArrayRepeat repeat = new ArrayRepeat();
		int[] array = { 10, 20, 55, 33, 85, 68, 33, 10 };
		repeat.arrayRepeat(array);

	}
}