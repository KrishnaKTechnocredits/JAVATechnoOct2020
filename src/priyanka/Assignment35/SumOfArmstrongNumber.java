package priyanka.Assignment35;

import java.util.Arrays;

public class SumOfArmstrongNumber {
	
	public void sumOfArmstrong(int[] arr) {
		System.out.println("Given input array: "+Arrays.toString(arr));
		int sum=0;
		for(int index=0; index<arr.length; index++) {
			if(isArmstrong(arr[index]))
				sum+=arr[index];
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
		int[] arr = {153, 111, 124, 371};
		SumOfArmstrongNumber sumOfArmstrongNumber = new SumOfArmstrongNumber();
		sumOfArmstrongNumber.sumOfArmstrong(arr);
	}
	

}
