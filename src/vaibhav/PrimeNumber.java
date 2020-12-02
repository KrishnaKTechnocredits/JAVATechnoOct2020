package vaibhav;

/* This program will display prime numbers from 2 to 100*/

public class PrimeNumber {
	
	public static void primeNumbers(){
		System.out.println("Below are the prime numbers");
		for (int i =2 ; i <= 100; i++) {
			int counter = 0;
			for(int j = 1; j <= i; j++) {
				if ( i % j == 0 ) 
					counter ++;
			}
				if (counter == 2)
					System.out.print(" "+i);
			}
			
	}

	public static void main(String[] args) {
		PrimeNumber.primeNumbers();
		
		// TODO Auto-generated method stub

	}

}
