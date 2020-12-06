package nagendra.logicalPrograms;

/*
Program 2: verify number is palindrom or not.
input : 121121
*/
public class VerifyNumberPalindrom {

	void verifyPallindromNumber(int number) {
		int pallindromNumber = 0;
		int userNumber = number;
		while (number > 0) {
			int reverseNumber = number % 10;
			pallindromNumber = (pallindromNumber * 10) + reverseNumber;
			number = number / 10;
		}
		if (pallindromNumber == userNumber) {
			System.out.println("Number " + userNumber + " is Palindrom");
		} else {
			System.out.println("Number " + userNumber + " is not  Palindrom");
		}
	}

	public static void main(String[] args) {
		VerifyNumberPalindrom palindrom = new VerifyNumberPalindrom();
		int userInput = 121121;
		palindrom.verifyPallindromNumber(userInput);
	}
}
