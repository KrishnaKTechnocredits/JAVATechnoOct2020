/*Program 2: verify number is palindrom or not.
input : 121121
*/
package ankita.assignment.string;

public class PalindromNumber {
	void checkPalindrom(int num) {
		int temp = 0;
		int num1 =num;
		while (num > 0) {
			temp = (temp * 10) + num % 10;
			num = num / 10;
		}
		if (temp == num1)
			System.out.println(num1 + " is palindrom");
		else
			System.out.println(num1 + " is not palindrom");

	}

	public static void main(String[] args) {
		PalindromNumber number = new PalindromNumber();
		number.checkPalindrom(121121);
		number.checkPalindrom(126);

	}
}
