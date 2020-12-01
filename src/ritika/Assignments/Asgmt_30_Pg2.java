package ritika.Assignments;

import java.util.Arrays;

/*Assignment 30 : 29th Nov 2020

Program 2: Find duplicate number on Integer array in Java? [I know you have done this before, practice it one more time please]
Hint: There is exactly one number is repeated in the array. You need to write a program to
find that duplicate number. For example, if an array with length 6 contains numbers {0, 3, 1, 2, 3}, then duplicated number is 3.
*/
public class Asgmt_30_Pg2 {
	
	void findDuplicateNumber(int[] input) {
		String temp = "";
		for (int i=0; i<input.length; i++ ) {
			for (int ii=0; ii<input.length; ii++) {
				if (input[i] == input[ii]) {
					if (i<ii) {
						temp = temp+input[i]+" ";
						break;
					}
					if (i>ii)
						break;
				}
			}
		}
		System.out.print("Duplicate Numbers from Array are: " +temp);
	}
	
	public static void main(String[] args) {
		int[] input = {1,6,8,7,9,6,3,10,5,4,6};
		Asgmt_30_Pg2 duplicateNumber = new Asgmt_30_Pg2();	
		duplicateNumber.findDuplicateNumber(input);
	}
}
