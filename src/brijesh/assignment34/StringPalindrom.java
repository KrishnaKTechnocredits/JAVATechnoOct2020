package brijesh.assignment34;


/*
Program 1:  verify string is palindrom or not.
input : naman
output : naman is a palindrom string.
*/

public class StringPalindrom {
	
	public void isStringPalindrom(String string) {
		boolean flag=true;
		for(int i=0,j=string.length()-1; i<j; i++,j--) {
			if(string.charAt(i)!=string.charAt(j)) {
				System.out.println(string+" is not a palindrome string");
				flag=false;
				break;
			}
		}
		if(flag)
			System.out.println(string+" is a palindrome string");
	}

	public static void main(String[] args) {
		StringPalindrom stringPalindrom = new StringPalindrom();
		stringPalindrom.isStringPalindrom("naman");
		stringPalindrom.isStringPalindrom("techno");
	}
}
