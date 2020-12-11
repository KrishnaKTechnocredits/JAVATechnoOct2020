package nagendra.logicalPrograms;

/*
Program 1:  verify string is palindrom or not.
input : naman
output : naman is a palindrom string.
*/

public class VerifyStringPalindrom {
	
	void verifyPalindrom(String userInput) {
		boolean flag = true;
		for (int i = 0, j = userInput.length() - 1; i < j; i++, j--) {
			if (userInput.charAt(i) != userInput.charAt(j))
				flag = false;
		}
		if (flag)
			System.out.println("String " + userInput + " is Palindrom");
		else {
			System.out.println("String " + userInput + " is not Palindrom");
		}
	}

	public static void main(String[] args) {
		VerifyStringPalindrom palindrom = new VerifyStringPalindrom();
		String userInput = "techno";
		palindrom.verifyPalindrom(userInput);
	}

}
