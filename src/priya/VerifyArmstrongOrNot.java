//Program 2: verify number is armstrong or not.///input : 153///output : 153 is an armstrong number.
//input : 154 ///output : 154 is an armstrong number.

package priya;

public class VerifyArmstrongOrNot {

	public static void armstrongOrNot(int num) {
		int original = num;
		int sum = 0;
		int temp = 0 ;
		while (num > 0) {
			temp = num % 10;
			sum += (temp * temp * temp);
			num = num / 10;
		}
		if (sum == original)
			System.out.println("Number is armstrong");
		else
			System.out.println("Number is not armstrong");		

	}

	public static void main(String[] args) {
		int number = 153;
		VerifyArmstrongOrNot.armstrongOrNot(number);
	}
}
