//optional program from sunday lecture -Check if Given number is prime or not
package ankita.assignment.prime;

import java.util.Scanner;

public class PrimeNumber {
	
	void checkPrime(int number) {
		boolean flag = true;
		if(number!=0 && number!=1) {
		for(int i=2;i<=number/2;i++) {
			if(number%i==0) {
				flag = false;
				break;
			}
		}
		if(!flag)
			System.out.println(number + " Not is prime number");
		else 
			System.out.println(number + " is Prime Number");
		}
		else
			System.out.println(number + " is not a prime");
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check if prime or not");
		int number = sc.nextInt();
		PrimeNumber primeNumber = new PrimeNumber();
		primeNumber.checkPrime(number);
	}
}
