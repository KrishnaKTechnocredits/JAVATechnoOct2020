/*Assignment 33
Program 1: return a reserve number.
input : 1234
output : 4321*/

package shrutiS.assignment33;

public class ReserveNumber {

	void findReverseNunber(int input) {
		int revNo = 0;
		while (input > 0) {
			int n = input % 10;
			revNo = (revNo * 10) + n;
			input = input / 10;
		}
		System.out.println("Output: " + revNo);
	}

	public static void main(String[] args) {
		ReserveNumber reverseNumber = new ReserveNumber();
		int input = 1234;
		System.out.println("Input : " + input);
		reverseNumber.findReverseNunber(input);
	}
}
