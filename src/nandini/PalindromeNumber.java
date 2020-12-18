package nandini;

public class PalindromeNumber {
	
	void printPalindromeNumber(int num) {
		int rev =0,rem;
		int temp = num;
		while(temp!=0) {
			rem = temp % 10;
			rev = rev*10 + rem;
			temp = temp/10;
		}
		if(num == rev)
			System.out.println(num + " is a Palindrome Number");
		else
			System.out.println(num + " is not a Palindrome Number");
	}
	public static void main(String args[]) {
		new PalindromeNumber().printPalindromeNumber(121);
	}
} 
