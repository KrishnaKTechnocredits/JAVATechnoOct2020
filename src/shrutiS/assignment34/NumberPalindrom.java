/*Program 2: verify number is palindrom or not.
input : 121121*/

package shrutiS.assignment34;

public class NumberPalindrom {

	void isNumberPalindrom(int num) {
		int rem, sum = 0, temp = 0;
		temp = num;
		while (num > 0) {
			rem = num % 10;
			sum = (sum * 10) + rem;
			num = num / 10;
		}
		if (temp == sum)
			System.out.println(temp + " is a palindrom number");
		else
			System.out.println(temp + " is not a palindrom number");
	}

	public static void main(String[] args) {
		NumberPalindrom noPalindrom = new NumberPalindrom();
		int num = 121121;
		System.out.println("Input : " + num);
		noPalindrom.isNumberPalindrom(num);
	}
}
