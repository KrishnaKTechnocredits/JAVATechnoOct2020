package rohan;

/*Assignment-22 : 18th Nov'2020 
Print all prime numbers between 2 to 100.*/

public class PrimeNumbersRange {

	void identifyPrimeNumbers(int startRange, int endRange) {
		if(startRange > endRange || startRange == endRange)
			System.out.println("Please enter correct range");
		else {
			for(int index=startRange;index<=endRange;index++) {
				//int cnt=0;
				boolean flag = true;
				for(int innerIndex=2;innerIndex<index;innerIndex++) {
					if(index%innerIndex==0) {
						flag=false;
						break;
					}
						//cnt++;
				}
				if(flag)
					System.out.print(" "+index);
			}
		}
	}
	
	public static void main(String[] args) {
		PrimeNumbersRange primeNumbersRange = new PrimeNumbersRange();
		primeNumbersRange.identifyPrimeNumbers(2,100);
	}
}
