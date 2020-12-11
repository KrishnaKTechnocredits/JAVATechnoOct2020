package ritika.Assignments;

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
public class Asgmt_33 {

	int reverseNumber(int num) {
		System.out.println("Input is " + num);
		int revNum = 0;
		while (num > 0) {
			int digit = num % 10;
			revNum = (revNum * 10) + digit;
			num = num / 10;
		}
		return revNum;
	}

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
		Asgmt_33 program1 = new Asgmt_33();
		System.out.println("Reverse Number is " + program1.reverseNumber(1234));
		System.out.println("=======================================================");
		Asgmt_33 program2 = new Asgmt_33();
		program2.isNumberAsrmstrong(153);
		program2.isNumberAsrmstrong(154);
	}
}
