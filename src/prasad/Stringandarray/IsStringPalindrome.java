package prasad.Stringandarray;
import java.util.Scanner;
/*Program 1:  verify string is palindrom or not.
input : naman
output : naman is a palindrom string.
input : techno
output : techno is not a palindrom string.*/

public class IsStringPalindrome {
	String output;
	boolean isPalindrome(String input) {
		boolean flag = false;
		for(int index=input.length()-1;index>=0;index--) {
			char ch = input.charAt(index);
			output+=ch;
		}
		output=output.substring(4);
		if(output.equalsIgnoreCase(input)) {
			flag=true;
		}
		
		return flag;
	}
	
	public static void main(String[]arg) {
		Scanner scanner = new Scanner(System.in);
		IsStringPalindrome isstringpalindrome = new IsStringPalindrome();
		System.out.println("Please enter any string.");
		String input=scanner.next();
		boolean flag = isstringpalindrome.isPalindrome(input);
		if(flag)
			System.out.println(input + " is palindrome");
		else 
			System.out.println(input+ " is NOT palindrome");
		System.out.println("=============================");
		System.out.println("Please enter any string.");
		input=scanner.next();
		flag = isstringpalindrome.isPalindrome(input);
		if(flag)
			System.out.println(input + " is palindrome");
		else 
			System.out.println(input+ " is NOT palindrome");
		
	}
}
