/*Assignment - 35 : 4th Dec'2020 

return sum of all Armstrong number from given array.
input : [153, 111, 124, 371]
output : 524*/

package shrutiS.assignment35;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class SumOfArmstrongNumber {

	void setInputValue(int[] input) {
		System.out.print("Input : ");
		for (int index = 0; index < input.length; index++) {
			System.out.print(input[index] + " ");
		}
	}

	void findSumOfArmstrongNumbers(int[] input) {
		int sum = 0;
		for (int index = 0; index < input.length; index++) {
			int i = input[index];
			int armstrongNumber = 0;
			while (input[index] > 0) {
				int n = input[index] % 10;
				armstrongNumber += (n * n * n);
				input[index] = input[index] / 10;
			}
			if (i == armstrongNumber)
				sum += i;
		}
		System.out.println("\nOutput: " + sum);
	}

	public static void main(String[] args) {
		SumOfArmstrongNumber armstrongNumber = new SumOfArmstrongNumber();
		int[] input = { 153, 111, 124, 371 };
		armstrongNumber.setInputValue(input);
		armstrongNumber.findSumOfArmstrongNumbers(input);
	}
}
