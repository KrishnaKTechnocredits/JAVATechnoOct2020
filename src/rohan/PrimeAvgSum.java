package rohan;
/*
 * 1) Find count of prime numbers between 2-100.
2) find sum of all prime numbers between 2-100.
3) find average of all prime numbers between 2-100.
 */

public class PrimeAvgSum {

	void avgSumPrimeNumbers(int startRange, int endRange) {
		int cnt=0,sum=0;
		float avg=0f;
		if(startRange > endRange || startRange == endRange)
			System.out.println("Please enter correct range");
		else {
			for(int index=startRange;index<=endRange;index++) {
				boolean flag = true;
				for(int innerIndex=2;innerIndex<index;innerIndex++) {
					if(index%innerIndex==0) {
						flag=false;
						break;
					}
						//cnt++;
				}
				if(flag) {
					cnt++;
					System.out.print(" "+index);
					sum=sum+index;
				}
			}
			avg=sum/cnt;
			System.out.println();
			System.out.println("Total count of prime numbers between "+startRange+" & "+endRange+": "+cnt);
			System.out.println("Average of Prime Numbers: "+avg);
			System.out.println("Sum of Prime Numbers: "+sum);
		}
	}
	
	public static void main(String[] args) {
		PrimeAvgSum primeAvgSum = new PrimeAvgSum();
		primeAvgSum.avgSumPrimeNumbers(2,100);
	}
}
