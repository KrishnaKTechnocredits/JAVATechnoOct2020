package monika;
/*
 Program 2:  [ Optional ]
Create a class where you need to check given number is there in predefined array or not, if present then print frequency of the number. [Estimated time: 15 mins]

Input : Predefined array -> {10,3,9,-99,81,3,-11}
           Number to be check -> 33
Output : Given number 33 is not present in predefined array.

Input : Number to be check -> 3
output : Given number 3 is present in predefined array with frequency 2.
*/



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
		int[] array = { 10,3,9,-99,81,3,-11 };
		f.findNumber(array, 33);
	}
}