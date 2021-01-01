package suvela.assignment35;

import java.util.Arrays;

public class SumOfArmstrong {
	void armstrongSum(int[] array) {
		System.out.println("Given array:"+Arrays.toString(array));
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			int num = array[i];
			int ans = 0;
			int digit = 0;
			while (num > 0) {
				digit = num % 10;
				ans = ans + (digit * digit * digit);
				num = num / 10;
			}
			if (ans == array[i])
				sum = sum + array[i];
		}
		System.out.println("Sum of armstrong numbers is:"+sum);

	}

	public static void main(String[] args) {
		int[] array = { 153, 111, 124, 371 };
		SumOfArmstrong sum = new SumOfArmstrong();
		sum.armstrongSum(array);

	}

}
