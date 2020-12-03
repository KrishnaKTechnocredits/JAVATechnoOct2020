/*Program 1: return a reserve number.
input : 1234
output : 4321
*/
package poojap;

import java.util.Scanner;

public class ReverseNumber {

	void getReverseNumber(int num) {
		int reverseNum = 0, reminder;
		while (num != 0) {
			reminder = num % 10;
			reverseNum = reverseNum * 10 + reminder;
			num = num / 10;
		}
		System.out.print("Reverse Number is : "+reverseNum);
	}

	public static void main(String[] args) {
		ReverseNumber reverseNumber = new ReverseNumber();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number");
		int num = scanner.nextInt();
		System.out.println("Number is : " + num);
		reverseNumber.getReverseNumber(num);
	}
}
