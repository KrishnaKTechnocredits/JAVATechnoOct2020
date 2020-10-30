package ankita.practise;

public class PrimeNumber {
	
	void findPrimeNumber(int number) {
		boolean isPrime = true;
		
		for(int i =2;i<number;i++) {
			if(number%i == 0) {
				isPrime = false;
				break;
			}
		}
		if(isPrime)
			System.out.println(number + " Number is Prime");
		else
			System.out.println(number +" Number is not prime");
	}
	public static void main(String[] args) {
		PrimeNumber primeNumber = new PrimeNumber();
		primeNumber.findPrimeNumber(51);
	}
}
