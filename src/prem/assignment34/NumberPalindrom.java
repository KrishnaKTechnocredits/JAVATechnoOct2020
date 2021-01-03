package prem.assignment34;

/*
Program 2: verify number is palindrom or not.
input : 121121 
*/

public class NumberPalindrom {
	
	public void isNumberPalindrome(int number) {
		boolean flag=true;
		String string=String.valueOf(number);
		for(int i=0,j=string.length()-1; i<j; i++,j--) {
			if(string.charAt(i)!=string.charAt(j)) {
				System.out.println(string+" is not a palindrome number");
				flag=false;
				break;
			}
		}
		if(flag)
			System.out.println(string+" is a palindrome number");
	}

	public static void main(String[] args) {
		NumberPalindrom numberPalindrom = new NumberPalindrom();
		numberPalindrom.isNumberPalindrome(1234);
		numberPalindrom.isNumberPalindrome(123454321);
	}
}
