package brijesh.assignment23;

public class PrimeNumbers {
	
	int countPrimeNumbers(int start, int end) {
		int counter=0;
		for(int index=start; index<= end; index++) {
			if(isPrimeNumber(index))
				counter++;
		}
		return counter;
	}
	
	int sumPrimeNumbers(int start, int end) {
		int sum=0;
		for(int index=start; index<= end; index++) {
			if(isPrimeNumber(index))
				sum+=index;
		}
		return sum;
	}
	
	double averagePrimeNumbers(int start, int end) {
		return sumPrimeNumbers(start, end)/countPrimeNumbers(start, end);
	}
	
	boolean isPrimeNumber(int number) {
		boolean flag=true;
		for (int index=2; index <= Math.ceil(Math.sqrt(index)); index++) {
			if(number%index==0) {
				flag=false;
				break;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		PrimeNumbers primeNumbers = new PrimeNumbers();
		System.out.println("Count of prime numbers between 2 and 100: "+ primeNumbers.countPrimeNumbers(2, 100));
		System.out.println("Sum of prime numbers between 2 and 100: "+ primeNumbers.sumPrimeNumbers(2, 100));
		System.out.println("Average of prime numbers between 2 and 100: "+ primeNumbers.averagePrimeNumbers(2, 100));
	}
}
