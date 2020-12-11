package vaibhav.assignment34;

/*Program 1:  verify string is palindrom or not.
input : naman
output : naman is a palindrom string.
input : techno
output : techno is not a palindrom string.*/


public class StringPalindrome {

	private static void isPalindrome(String input) {
		boolean flag= true;
		for (int i = 0, j = input.length()-1; i < j; i++,j--)	{
			if(input.charAt(i) != input.charAt(j)) {
				System.out.println("String "+input+" is not palindrome");
				flag = false;
				break;
			}	
		}
		if(flag)
			System.out.println("String "+input+" is palindrome");
	}

	public static void main(String[] args) {
		String input = "naman";
		StringPalindrome.isPalindrome(input);	
	}
}
