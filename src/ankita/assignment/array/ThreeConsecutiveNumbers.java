/*Program 2: print Hi when you find 3 consecutive numbers.
1,2,3,5,8,9,11,12,13,14,15,18,19,20
output :1,2,3 -> Hi
11,12,13 -> Hi
12,13,14 -> Hi
13,14,15 -> Hi
18,19,20 -> Hi
*/
package ankita.assignment.array;

public class ThreeConsecutiveNumbers {
	void isThreeConsecutiveNumbers(int[] arr) {
		for (int i = 0; i < arr.length - 2; i++) {
			if ((arr[i + 1] == arr[i] + 1) && (arr[i + 2] == arr[i] + 2)) {
				System.out.println(arr[i] + "," + arr[i + 1] + "," + arr[i + 2] + "-> Hi");
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 5, 8, 9, 11, 12, 13, 14, 15, 18, 19, 20 };
		new ThreeConsecutiveNumbers().isThreeConsecutiveNumbers(arr);
	}
}