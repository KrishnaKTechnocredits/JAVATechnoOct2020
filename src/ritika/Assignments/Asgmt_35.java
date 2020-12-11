package ritika.Assignments;

import java.util.Arrays;

/*Assignment - 35 : 4th Dec'2020

return sum of all Armstrong number from given array.
input : [153, 111, 124, 371]
output : 524
*/
public class Asgmt_35 {

	int sumOfAllArmstrongNumbers(int[] array) {
		int sum = 0;
		for (int index = 0; index < array.length; index++) {
			// boolean flag= true;
			int num = array[index];
			int innerSum = 0;
			int digit = 0;
			while (num > 0) {
				digit = num % 10;
				innerSum = innerSum + (digit * digit * digit);
				num = num / 10;
			}
			if (innerSum == array[index])
				sum = sum + array[index];
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] input = { 153, 111, 124, 371 };
		Asgmt_35 program = new Asgmt_35();
		System.out.println("Input: " + Arrays.toString(input));
		System.out.println("Sum of all armstrong numbers is: " + program.sumOfAllArmstrongNumbers(input));
	}
}
