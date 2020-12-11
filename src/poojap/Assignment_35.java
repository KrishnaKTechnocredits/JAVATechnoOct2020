/*Assignment - 35 : 4th Dec'2020 

return sum of all Armstrong number from given array.
input : [153, 111, 124, 371]
output : 524*/
package poojap;

import java.util.Arrays;

public class Assignment_35 {

	void sumOfArmstrongNumber(int[] num) {
		int reminder, temp, sumOfArmstrong = 0;
		for (int i = 0; i < num.length; i++) {
			temp = num[i];
			int sum = 0;
			while (temp != 0) {
				reminder = temp % 10;
				sum = sum + (reminder * reminder * reminder);
				temp = temp / 10;
			}
			if (num[i] == sum) {
				sumOfArmstrong = sumOfArmstrong + num[i];
			}
		}
		System.out.println("Sum Of Armstrong Is : " + sumOfArmstrong);
	}

	public static void main(String[] args) {
		Assignment_35 assignment_35 = new Assignment_35();
		int[] input = { 153, 111, 124, 371 };
		System.out.println("Array Is : " + Arrays.toString(input));
		assignment_35.sumOfArmstrongNumber(input);
	}
}
