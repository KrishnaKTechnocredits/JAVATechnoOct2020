package ritika.Assignments;

/*Assignment 30 : 29th Nov 2020

Program 1: Find the missing number in integer array of 1 to 10?
Hint: You have given an integer array which contains numbers from 1 to 10 but exactly one number is missing, you need to write a Java program to find that missing number in an array.

*/
public class Asgmt_30_Pg1 {

	static void findMissingNumber(int[] input) {

		int[] matchArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		String temp = "";
		for (int i = 0; i < matchArray.length; i++) {
			boolean flag = true;
			for (int ii = 0; ii < input.length; ii++) {
				if (matchArray[i] == input[ii]) {
					flag = false;
					break;
				}
			}
			if (flag)
				temp = temp + matchArray[i] + " ";
		}
		System.out.println("Missing number from Array is: " + temp);
	}

	public static void main(String[] args) {
		int[] input = { 1, 6, 8, 7, 9, 6, 3, 10, 5 };
		Asgmt_30_Pg1.findMissingNumber(input);
	}
}
