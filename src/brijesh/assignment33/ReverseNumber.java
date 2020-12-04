package brijesh.assignment33;

/*
Program 1: return a reserve number.
input : 1234
output : 4321 
*/

public class ReverseNumber {
	
	public int reverseOfNumber(int number) {
		System.out.println("Given Number: "+number);
		String reverseNumber="";
		while(number>0) {
			int mod = number%10;
			number=number/10;
			reverseNumber+=mod;
		}
		return Integer.parseInt(reverseNumber);
	}

	public static void main(String[] args) {
		ReverseNumber reverseNumber = new ReverseNumber();
		System.out.println("Reverse Number is: "+reverseNumber.reverseOfNumber(12345));
		System.out.println("Reverse Number is: "+reverseNumber.reverseOfNumber(346849));
	}
}
