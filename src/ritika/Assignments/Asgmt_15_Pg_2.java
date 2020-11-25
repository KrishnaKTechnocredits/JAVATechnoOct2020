package ritika.Assignments;

/*Program 2: [ Optional ]
Create a class where you need to check given number is there in predefined array or not, if present then print frequency of the number. [Estimated time: 15 mins]

Input : Predefined array -> {10,3,9,-99,81,3,-11}
Number to be check -> 33
Output : Given number 33 is not present in predefined array.

Input : Number to be check -> 3
output : Given number 3 is present in predefined array with frequency 2.
*/
public class Asgmt_15_Pg_2 {

	void findNumberPresence(int[] arr, int num) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				count++;
			}
		}
		if (count > 0)
			System.out.println("Given number " + num + " is present in predefined array with frequency " + count);
		else
			System.out.println("Given number " + num + " is not present in predefined array");
	}

	public static void main(String[] args) {
		int[] array = { 10, 3, 9, -99, 81, 3, +11 };
		Asgmt_15_Pg_2 program2 = new Asgmt_15_Pg_2();
		program2.findNumberPresence(array, 33);
		program2.findNumberPresence(array, 3);
	}
}