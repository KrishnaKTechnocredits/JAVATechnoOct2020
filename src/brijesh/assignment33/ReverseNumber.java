package brijesh.assignment33;

/*
Program 1: return a reserve number.
input : 1234
output : 4321 
*/

public class ReverseNumber {

	public int reverseOfNumber(int number) {
		System.out.println("Given Number: " + number);
		int reverseNumber = 0;
		while (number > 0) {
			int mod = number % 10;
			number = number / 10;
			reverseNumber = reverseNumber * 10 + mod;
		}
		return reverseNumber;
	}

	public static void main(String[] args) {
		ReverseNumber reverseNumber = new ReverseNumber();
		System.out.println("Reverse Number is: " + reverseNumber.reverseOfNumber(12345));
		System.out.println("Reverse Number is: " + reverseNumber.reverseOfNumber(346849));
	}
}
