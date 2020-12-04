//Assignment 33 : [complete it before 4th Dec EOD] 
//Program 1: return a reserve number.///input : 1234/// output : 4321

package priya;

public class ReturnReverseNumber {

	void reverseNumber(int num) {
		int reverse = 0, remainder = 0;
		while (num != 0) {
			remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num / 10;
		}
		System.out.println("Reverse number is : " + reverse);
	}

	public static void main(String[] args) {
		ReturnReverseNumber returnreversenumber = new ReturnReverseNumber();
		returnreversenumber.reverseNumber(1234);

	}
}
