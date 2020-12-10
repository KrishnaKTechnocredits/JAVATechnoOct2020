package mrunal;
/*Program 1: return a reserve number.
input : 1234
output : 4321*/

public class prog1 {

	int reverseNumber(int num) {
		System.out.println("Input is " + num);
		int revNum = 0;
		while (num > 0) {
			int digit = num % 10;
			revNum = (revNum * 10) + digit;
			num = num / 10;
		}
		return revNum;
	}
	public static void main(String[] args) {
		prog1 program1 = new prog1();
		System.out.println("Reverse Number is " + program1.reverseNumber(1234));
	}
}
