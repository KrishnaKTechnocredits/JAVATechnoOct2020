
package monika;
/*Assignment - 29 :

Find second maximum from array without sorting the array
*/

public class SecondMaxNum {

	void MaxSecondNum(int arr[]) {
		int first = 0;
		int second = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > first) {
				second = first;
				first = arr[i];
			} else if (arr[i] > second) {
				second = arr[i];
			}
		}
		System.out.println("Second max number in array " + second);
	}

	public static void main(String[] args) {
		int array[] = { 60, 80, 10, 12, 15, 11 };
		SecondMaxNum secondmaxnum = new SecondMaxNum();
		secondmaxnum.MaxSecondNum(array);
	}

}