package vaibhav.assignment34;

/*Program 2: verify number is palindrom or not.
input : 121121*/


public class NumberPalindrome {


	private static void isPalindrome(int num) {
		int original = num;
		String temp= "";
		while (num > 0) {
			temp += num % 10;
			num=num/10;
		}
		if (original == Integer.parseInt(temp))
			System.out.println("Number "+original+" is palindrome");
		else
			System.out.println("Number "+original+" is not palindrome");
	}

	public static void main(String[] args) {
		int x = 121121;
		NumberPalindrome.isPalindrome(x);

	}
}
