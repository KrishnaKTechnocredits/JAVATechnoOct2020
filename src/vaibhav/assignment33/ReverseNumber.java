package vaibhav.assignment33;

/*Assignment 33 : [complete it before 4th Dec EOD] 
Program 1: return a reserve number.
input : 1234
output : 4321*/


public class ReverseNumber {
	
	public static void getReverse(int number) {
		String reverse = "";
		while(number > 0 ) {
			reverse += number % 10;
			number = number/10;
		}
		System.out.println(reverse);
	}

	public static void main(String[] args) {
		int x = 1234;
		ReverseNumber.getReverse(x);
	}
}
