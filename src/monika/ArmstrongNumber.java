package monika;
import java.util.Scanner;

/*
Program 2: verify number is armstrong or not.
input : 153
output : 153 is an armstrong number.
input : 154 
output : 154 is an armstrong number
*/

public class ArmstrongNumber {

	void findArmstrongNumber(int num) {
		int number = num;
		int var, sum = 0;
		while (number != 0) {

			var = number % 10;
			sum = sum + var * var * var;
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
		System.out.println("Verify the number ");
		int num = scanner.nextInt();
		System.out.println("Number is: " + num);
		armstrongNumber.findArmstrongNumber(num);
	}
}