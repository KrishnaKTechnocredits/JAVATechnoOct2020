package ritika.Assignments;

/*Assignment 32: 3rd Dec'2020

Program 2: print Hi when you find 3 consecutive numbers.
1,2,3,5,8,9,11,12,13,14,15,18,19,20
output :1,2,3 -> Hi
11,12,13 -> Hi
12,13,14 -> Hi
13,14,15 -> Hi
18,19,20 -> Hi
*/
public class Asgmt_32_Pg2 {

	void printHiFor3ConsecutiveNumbers(int[] arr) {
		for (int i = 0; i < arr.length - 2; i++) {
			if (arr[i] + 1 == arr[i + 1] && arr[i] + 2 == arr[i + 2])
				System.out.println("" + arr[i] + "," + arr[i + 1] + "," + arr[i + 2] + " --> Hi");
		}
	}

	public static void main(String[] args) {
		int[] inputArray = { 1, 2, 3, 5, 8, 9, 11, 12, 13, 14, 15, 18, 19, 20 };
		Asgmt_32_Pg2 program2 = new Asgmt_32_Pg2();
		program2.printHiFor3ConsecutiveNumbers(inputArray);
	}
}
