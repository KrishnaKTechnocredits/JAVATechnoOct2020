/*
 Program 2: verify number is armstrong or not.

input : 153
output : 153 is an armstrong number.
input : 154 
output : 154 is an armstrong number.
*/

package yogita;

import java.util.Scanner;

public class ArmstrongNumber {
	void findArmstrongNumber(int num) {
		int sum = 0;
		int remainder = 0;
		int temp = num;
		while (num != 0) {
			remainder = num % 10;
			sum += (remainder * remainder * remainder);
			num = num / 10;
		}
		if (temp == sum)
			System.out.println(temp + "-->" + "Is Armstrong Number");
		else
			System.out.println(temp + "-->" + "Is Not Armstrong Number");
	}

	public static void main(String[] args) {
		ArmstrongNumber findArmstrong = new ArmstrongNumber();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int input = sc.nextInt();
		findArmstrong.findArmstrongNumber(input);

	}

}
