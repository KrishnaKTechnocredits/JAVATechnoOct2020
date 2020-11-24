package prem;

//Assignment-22 : 18th Nov'2020 
//Print all prime numbers between 2 to 100.
//A number that can be divided exactly only by itself and 1, for example 7, 17 and 41

public class PrimeNumber {
	
	void findPrimeNumber(int number) {
		boolean flag = true;
		for(int i=2;i<=Math.sqrt(number);i++) {
			if(number%i==0) {
				System.out.println("Numbers is not Prime = " + number);
				flag = false;
			}
		}
		if(flag)
			System.out.println(number + "is prime");
				
		}
	
	public static void main(String[] args) {
		PrimeNumber primeNumber = new PrimeNumber();
		for (int j=2; j<=200; j++) {
		primeNumber.findPrimeNumber(j);
		}
	}
}
