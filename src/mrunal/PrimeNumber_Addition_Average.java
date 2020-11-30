package mrunal;
import java.util.Arrays;

public class PrimeNumber_Addition_Average {

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
		System.out.println("Sum of prime number is : " + sum + "\n" +  "Average is : " + avg);
	}

	public static void main(String[] args) {
		int start = 2;
		int end = 100;
		PrimeNumber_Addition_Average primeNumberAndAdditionAndAverage = 
				new PrimeNumber_Addition_Average();
		System.out.println("Printing prime number from 2 to 100 : " );
		primeNumberAndAdditionAndAverage.primeNumber(start,end);
		
	}

}