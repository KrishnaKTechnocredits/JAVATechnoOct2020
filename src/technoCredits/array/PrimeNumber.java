package technoCredits.array;

public class PrimeNumber {
	
	void verifyPrimeNumber(int number) {
		boolean flag = true;
		for(int i=2;i<=Math.sqrt(number);i++) {
			if(number%i == 0) {
				flag = false;
				break;
			}
		}
		 if(flag)
			System.out.println(number + " is prime"); 
			
	}
	
	public static void main(String[] args) {
		PrimeNumber primeNumber = new PrimeNumber();
		primeNumber.verifyPrimeNumber(21);
	}
}
