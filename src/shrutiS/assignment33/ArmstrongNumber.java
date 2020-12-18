/*Assignment 33
Program 2: verify number is armstrong or not.
input : 153
output : 153 is an armstrong number.
input : 154 
output : 154 is not an armstrong number.*/

package shrutiS.assignment33;

public class ArmstrongNumber {
	void findArmstrongNumber(int input) {
		int i = input;
		int armstrongNumber = 0;
		while (input > 0) {
			int n = input % 10;
			armstrongNumber += (n * n * n);
			input = input / 10;
		}
		if (i == armstrongNumber)
			System.out.println("Output: " + i + " is an armstrong number");
		else
			System.out.println("Output: " + i + " is not an armstrong number");
	}

	public static void main(String[] args) {
		ArmstrongNumber armstrongNumber = new ArmstrongNumber();
		int input = 153;
		System.out.println("Input : " + input);
		armstrongNumber.findArmstrongNumber(input);
	}
}
