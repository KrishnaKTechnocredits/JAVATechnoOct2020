/*
 Create a class where you need to check given number is there in predefined array or not, 
if present then print frequency of the number.

*/

package yogita;

public class FindNumber {

	void findNumber(int[] arr, int num) {
		int nCnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num)
				nCnt++;
		}
		System.out.println("Number to be search is:" + num);
		if (nCnt == 0)
			System.out.println("The given number is Not present ");
		else
			System.out.println("Count of given number is:" + nCnt);
	}

	public static void main(String[] args) {
		FindNumber f = new FindNumber();
		int[] array = { 10, 20, 55, 33, 85, 55, 68, 55, 55 };
		f.findNumber(array, 55);
	}
}
