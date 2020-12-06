/*Program 1: return a reserve number.
input : 1234
output : 4321
*/
package ankita.assignment.string;

public class ReverseNumber {
	void getReversedNumber1(int number) {
		System.out.println("==Method 1==");
		System.out.println("Input Number : " + number);
		String str1 = "";
		String str = String.valueOf(number);
		for (int i = str.length() - 1; i >= 0; i--) {
			str1 += str.charAt(i);
		}
		System.out.println("Output Number: " + (Integer.valueOf(str1)));
	}

	void getReversedNumber2(int number) {
		System.out.println("==Method 2==");
		System.out.println("Input Number : " + number);
		String str = number + "";
		String temp = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			temp += str.charAt(i);
		}
		System.out.println("Output Number: " + (Integer.valueOf(temp)));
	}

	void getReversedNumber3(int number) {
		System.out.println("==Method 3==");
		System.out.println("Input Number : " + number);
		int num1 = 0;
		while (number > 0) {
			num1 = (num1 * 10) + (number % 10);
			number = number / 10;
		}
		System.out.println("output Number: " + num1);
	}

	public static void main(String[] args) {
		int number = 12345;
		ReverseNumber reverseNumber = new ReverseNumber();
		reverseNumber.getReversedNumber1(number);
		reverseNumber.getReversedNumber2(number);
		reverseNumber.getReversedNumber3(number);
	}
}
