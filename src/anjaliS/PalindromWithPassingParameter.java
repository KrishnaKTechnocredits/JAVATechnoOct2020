package anjaliS;

public class PalindromWithPassingParameter {
	void displayPalindromeNum(int num) {
		int rev = 0, rem = 0;
		int palin = num;
		while (num != 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		if (rev == palin)
			System.out.println("Number is palindrome ");
		else
			System.out.println("Number is not palindrome ");

	}

	public static void main(String[] args) {
		PalindromWithPassingParameter palindromwithpassingparameter = new PalindromWithPassingParameter();
		palindromwithpassingparameter.displayPalindromeNum(121121);
		palindromwithpassingparameter.displayPalindromeNum(223);

	}

}
