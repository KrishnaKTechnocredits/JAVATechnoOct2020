package prasad;
import java.util.Scanner;

/*Program 2: verify number is palindrome or not.
input : 121121*/

public class IsNumberPalindrome {
	
	boolean IsPalindrome(int number) {
		boolean flag = false;
		int tempInput=number;
		int output=0;
		int digit=0;
		while(number>0) {
			digit = number%10;
			output=(output*10)+digit;
			number = number/10;
		}
		if(output==tempInput)
			flag=true;
		
		
		return flag;
	}
	
	public static void main(String[]arg) {
		IsNumberPalindrome isnumberpalindrome = new IsNumberPalindrome();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter any number(atleast two digit number)");
		int input = scanner.nextInt();
		boolean flag = isnumberpalindrome.IsPalindrome(input);
		if(flag)
			System.out.println(input + " is a palindrome");
		else 
			System.out.println(input + " is NOT palindrome");
		
	}

}
