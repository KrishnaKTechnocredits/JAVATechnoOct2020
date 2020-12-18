/*Program 2: verify number is armstrong or not.
input : 153
output : 153 is an armstrong number.
input : 154 
output : 154 is an armstrong number.*/

package poojap;

import java.util.Scanner;

public class ArmstrongNumber {

	void findArmstrongNumber(int num) {
		int number = num;
		int reminder, sum = 0;
		while (number != 0) {

			reminder = number % 10;
			sum = sum + reminder * reminder * reminder;
			number = number / 10;
		}
		if (sum == num)
			System.out.println(num + " Number is Armstrong");
		else
			System.out.println(num + " Number is Not Armstrong");
	}

	public static void main(String[] args) {
		ArmstrongNumber armstrongNumber = new ArmstrongNumber();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Number");
		int num = scanner.nextInt();
		System.out.println("Number is: " + num);
		armstrongNumber.findArmstrongNumber(num);
	}
}
