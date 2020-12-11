package priyanka.Assignment33;

import java.util.Scanner;

/*Program 2: verify number is armstrong or not.
input : 153
output : 153 is an armstrong number.
input : 154 
output : 154 is not an armstrong number.
*/
public class ArmstrongNumber {

	void armstrongNo(int num) {

		int armstrongNum = 0, number, temp;
		number = num;
		while (number != 0) {
			temp = number % 10;
			armstrongNum = armstrongNum + temp * temp * temp;
			number = number / 10;
		}

		if (armstrongNum == num)
			System.out.println(num + " The entered number is Armstrong number ");
		else
			System.out.println(num + " The entered number is not an Armstrong number");

	}

	public static void main(String[] arg) {
		ArmstrongNumber ArmstrongNumber = new ArmstrongNumber();
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Enter the number : ");
		int number = scanner.nextInt();
		ArmstrongNumber.armstrongNo(number);
		System.out.println(" Enter the number : ");
		int number1 = scanner.nextInt();
		ArmstrongNumber.armstrongNo(number1);
	}

}
