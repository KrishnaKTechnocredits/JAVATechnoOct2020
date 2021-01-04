package prem.assignment35;

import java.util.Arrays;

/*return sum of all Armstrong number from given array.
input : [153, 111, 124, 371]
output : 524
*/

public class ArmstrongSum {
	
	public void sumOfArmstrong(int[] input) {
		System.out.println("Given input array: "+Arrays.toString(input));
		int sum=0;
		for(int index=0; index<input.length; index++) {
			if(isArmstrong(input[index]))
				sum+=input[index];
		}
		System.out.println("Sum of Armstrong numbers: "+sum);
	}
	
	public boolean isArmstrong(int number) {
		int originalNumber=number, sum=0;
		while(number>0) {
			int mod = number%10;
			number= number/10;
			sum+=mod*mod*mod;
		}
		if(sum==originalNumber)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		int[] input1 = {153, 111, 124, 371};
		ArmstrongSum armstrongSum = new ArmstrongSum();
		armstrongSum.sumOfArmstrong(input1);
	}
}
