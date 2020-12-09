/*Program 1:  verify string is palindrom or not.
input : naman
output : naman is a palindrom string.
input : techno
output : techno is not a palindrom string.*/

package vishakha.Asgnmt34;

public class PalindromeString {
	
	void verifyPalindromeString(String str){
		String temp = str, newStr = "";
		for(int i=str.length()-1; i>=0;i--){
			char ch = str.charAt(i);
			newStr = newStr + ch;
		}
		if(newStr.equalsIgnoreCase(temp))
			System.out.println(temp + " is a palindrome");
		else
			System.out.println(temp + " is not a palindrome");
	}

	public static void main(String[] args) {
		String str = "Malayalam";
		new PalindromeString().verifyPalindromeString(str);
	}
}
