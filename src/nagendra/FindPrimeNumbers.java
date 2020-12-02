package nagendra;

/*
1) Find count of prime numbers between 2-100.
2) find sum of all prime numbers between 2-100.
3) find average of all prime numbers between 2-100.
*/

public class FindPrimeNumbers {

	int getTotalPrimeNumber(int start,int end) {
		boolean flag = true;
		int count = 0;
		while(start<=end){
			flag = true;
		for (int i = 2; i <= Math.sqrt(start); i++) {
			if (start % i == 0) {
				flag = false;
				break;
			}
		}
		if(flag==true){
			count++;
		}
		start++;
		}
		return count;
	}
	
	int getTotalSumOfPrimeNumber(int start,int end) {
		boolean flag = true;
		int primeNumberSum=0;
		while(start<=end){
			flag = true;
		for (int i = 2; i <= Math.sqrt(start); i++) {
			if (start % i == 0) {
				flag = false;
				break;
			}
		}
		if(flag==true){
			primeNumberSum+=start;
		}
		start++;
		}
		return primeNumberSum;
	}
	
	float findPrimeNumbersAverage(int from,int to){
		float average;
		int totalPrimeNumber=getTotalPrimeNumber(from,to);
		int totalSumOfPrimeNumber=getTotalSumOfPrimeNumber(from,to);
		average=totalSumOfPrimeNumber/totalPrimeNumber;
		return average;
	}

	public static void main(String[] args) {
		FindPrimeNumbers primeNumber = new FindPrimeNumbers();
		int total=primeNumber.getTotalPrimeNumber(2,100);
		System.out.println("Total Prime Numbers Are ->"+total);
		int totalSum=primeNumber.getTotalSumOfPrimeNumber(2,100);
		System.out.println("Sum of all prime numbers ->"+totalSum);
		float average=primeNumber.findPrimeNumbersAverage(2, 100);
		System.out.println("Average of Prime Number ->"+average);
	}

}
