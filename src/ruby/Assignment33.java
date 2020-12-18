package ruby;

/*Assignment 33 : [complete it before 4th Dec EOD].*/

public class Assignment33 {
	/*
	 * Program 1: return a reserve number. input : 1234 output : 4321
	 */

	int getReverseNum(int num) {
		int revNum = 0;
		while (num > 0) {
			int digit = num % 10;
			num = num / 10;
			revNum = (revNum * 10) + digit;
		}
		return revNum;
	}

	/*
	 * Program 2: verify number is armstrong or not. input : 153 output : 153 is an
	 * armstrong number. input : 154 output : 154 is an armstrong number
	 */

	void findArmstrongNum(int input) {
		int temp = 0, num = input;
		while (num > 0) {
			int dig = num % 10;
			num = num / 10;
			temp = temp + (dig * dig * dig);
		}
		if (temp == input) {
			System.out.println(input + " Number is an Armstrong Number");
		} else {
			System.out.println(input + " Number is not an Armstrong Number");
		}
	}

	public static void main(String[] args) {
		Assignment33 assign = new Assignment33();
		int num = assign.getReverseNum(12345);
		System.out.println("Reverse Number is  " + num);
		assign.findArmstrongNum(153);
		assign.findArmstrongNum(156);
	}
}
