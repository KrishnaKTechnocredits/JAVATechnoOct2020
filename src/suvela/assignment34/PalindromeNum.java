/*Program 2: verify number is palindrom or not.
input : 121121*/
package suvela.assignment34;

public class PalindromeNum {
	void isPalindrome(int num) {
		int ans=0;
		int number=num;
		while(num>0) {
			int digit=num%10;
			ans= (ans*10)+digit;
			num=num/10;
		}if(ans==number)
			System.out.println("Number "+number+" is palindrome");
		else
			System.out.println("Number "+number+" is not palindrome");
	}
	public static void main(String[] args) {
		int num=121121
				;
		PalindromeNum pn= new PalindromeNum();
		pn.isPalindrome(num);
	}

}
