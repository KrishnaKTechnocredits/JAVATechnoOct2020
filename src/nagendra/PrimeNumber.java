package nagendra;

/*
Print all prime numbers between 2 to 100.
*/

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
			System.out.print(number + ","); 	
	}
	
	void getPrimeNumberFromRange(int from,int to){
		System.out.println("Prime Numbers from "+from+" to "+to+" are");
		for(int index=from;index<to;index++){
			verifyPrimeNumber(index);
		}
	}
	
	public static void main(String[] args) {
		PrimeNumber primeNumber = new PrimeNumber();
		primeNumber.getPrimeNumberFromRange(2,100);
	}
}
