package milind;

import java.util.Arrays;

public class PrimeNumberAndAdditionAndAverage {
	
	void primeNumber(int startRange, int endRange) {
		int sum = 0;
		int countPrimeNumber = 0;
		for(int index = startRange; index <= endRange; index++) {
			int count = 0;
			for(int innerIndex = startRange; innerIndex <= index; innerIndex++) {
				if(index % innerIndex == 0) {
					count++;
				}
			}
			if(count <= 1) {
				countPrimeNumber++;
				sum = sum + index;
				System.out.println(index);
			}
		}	
		float avg = sum/countPrimeNumber;
		System.out.println("Sum of prime number is : " + sum + " Average is : " + avg);
	}
	
	public static void main(String[] args) {
		int start = 2;
		int end = 100;
		PrimeNumberAndAdditionAndAverage primeNumberAndAdditionAndAverage = new PrimeNumberAndAdditionAndAverage();
		primeNumberAndAdditionAndAverage.primeNumber(start,end);
	}

}
