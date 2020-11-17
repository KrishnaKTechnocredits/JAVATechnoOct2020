/*WAP to print Reverse a given String.
input : This is technocredits
output : stiderconhcet si sihT  */

package deepak;

public class ReverseString {
	
	void reverse(String str) {
		char[] ch = str.toCharArray();
		for( int i=ch.length-1; i>=0; i--) {
			System.out.print(ch[i]);	
		}	
	}

	public static void main(String[] args) {
		
		String input = "This is technocredits";
		
		ReverseString reverseString = new ReverseString();
		reverseString.reverse(input);
	}
}
