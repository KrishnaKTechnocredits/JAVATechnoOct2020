package mrunal;
/*Assignment 33 : [complete it before 4th Dec EOD]
Program 1: return a reserve number.
input : 1234
output : 4321
Program 2: verify number is armstrong or not.
input : 153
output : 153 is an armstrong number.
input : 154
output : 154 is not an armstrong number.
*/
public class prog2 {

	void isNumberAsrmstrong(int number) {
		int num = number;
		int sum = 0;
		int digit = 0;
		while (num > 0) {
			digit = num % 10;
			sum = sum + (digit * digit * digit);
			num = num / 10;
		}
		if (sum == number)
			System.out.println(number + " is an Armstrong number");
		else
			System.out.println(number + " is Not an Armstrong number");
	}

public static void main(String[] args) {
		prog2 program2 = new prog2();

		program2.isNumberAsrmstrong(153);
		program2.isNumberAsrmstrong(154);
	}
} 