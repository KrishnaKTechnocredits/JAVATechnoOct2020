
/*Program 2: verify number is armstrong or not.
input : 153
output : 153 is an armstrong number.
input : 154
output : 154 is an armstrong number.
*/
package ankita.assignment.string;

public class Armstrong {
	void checkArmstrong(int num) {
		int num1 = 0;
		int num2 = num;
		int sum = 0;
		while (num > 0) {
			num1 = num % 10;
			sum = sum + (num1 * num1 * num1);
			num = num / 10;
		}
		if (num2 == sum)
			System.out.println(num2 + " is Armstrong Number ");
		else
			System.out.println(num2 + " is not Armstrong Number ");
	}

	public static void main(String[] args) {
		Armstrong armstrong = new Armstrong();
		armstrong.checkArmstrong(153);
		armstrong.checkArmstrong(154);
	}
}