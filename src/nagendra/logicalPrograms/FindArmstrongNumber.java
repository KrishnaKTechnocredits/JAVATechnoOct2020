package nagendra.logicalPrograms;

/*
Program 2: verify number is armstrong or not.
input : 153
output : 153 is an armstrong number.
input : 154 
output : 154 is an armstrong number.
*/

public class FindArmstrongNumber {

	void getArmstrongNumber(int input) {
		int userNumber = input;
		int number = 0;
		while (input > 0) {
			int output = input % 10;
			number += output * output * output;
			input = input / 10;
		}
		if (userNumber == number)
			System.out.println("Number " + userNumber + " is Armstrong");
		else
			System.out.println("Number " + userNumber + " is Not Armstrong");
	}

	public static void main(String[] args) {
		FindArmstrongNumber number = new FindArmstrongNumber();
		int input = 154;
		number.getArmstrongNumber(input);
	}
}
