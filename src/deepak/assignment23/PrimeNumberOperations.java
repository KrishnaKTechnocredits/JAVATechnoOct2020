/*Assignment_23 : 20th Nov'2020
1) Find count of prime numbers between 2-100.
2) find sum of all prime numbers between 2-100.
3) find average of all prime numbers between 2-100 */


package deepak.assignment23;

import java.util.Scanner;

public class PrimeNumberOperations {

	void avgSumPrimeNumbers(int start, int end) {
		int count=0,sum=0;
		float avg=0f;
		if(start > end || start == end)
			System.out.println("Please enter correct range");
		else {
			for(int index=start;index<=end;index++) {
				boolean flag = true;
				for(int innerIndex=2;innerIndex<index;innerIndex++) {
					if(index%innerIndex==0) {
						flag=false;
						break;
					}
				}
				if(flag) {
					count++;
					System.out.print(" "+index);
					sum=sum+index;
				}
			}
			avg=sum/count;
			System.out.println();
			System.out.println("Total count of prime numbers between "+start+" & "+end+": "+count);
			System.out.println("Average of Prime Numbers: "+avg);
			System.out.println("Sum of Prime Numbers: "+sum);
		}
	}

	public static void main(String[] args) {
		PrimeNumberOperations primeAvgSum = new PrimeNumberOperations();
		primeAvgSum.avgSumPrimeNumbers(2,100);
	}
}
