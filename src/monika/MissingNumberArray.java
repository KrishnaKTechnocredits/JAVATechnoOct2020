package monika;
/*Assignment 30 

Program 1:  Find the missing number in integer array of 1 to 10?
Hint: You have given an integer array which contains numbers from 1 to 10 but exactly one number is missing, you need to write a Java program to find that missing number in an array.
*/
public class MissingNumberArray {
	

	void findMissingNumber(int[] array) {
		int Num = 0;
		for (int i = 0; i < array.length; i++) {
			if (i + 1 != array[i]) {
				Num = i + 1;
				break;
			}
		}
		System.out.println("Missing Number from array given : " + Num);
	}

	public static void main(String[] args) {
		int[] input = { 1, 3, 4, 5, 6, 7,8, 9, 10 ,11};
		MissingNumberArray missingNumberArray = new MissingNumberArray();
		missingNumberArray.findMissingNumber(input);

	}
}