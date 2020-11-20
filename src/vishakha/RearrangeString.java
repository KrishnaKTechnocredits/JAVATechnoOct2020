/*Program : 2 
String input = "hmPZ23i9Ws"
output = "239PZWhmis";*/

package vishakha;

import java.util.Scanner;

public class RearrangeString {
	
	void rearrangeString(String str){
		String digits ="", capLetters="", smallLetters="", specialChar="";
		for(int index=0; index<str.length(); index++){
			char ch = str.charAt(index);
			if(Character.isDigit(ch))
				digits += ch;
			else if(Character.isUpperCase(ch))
				capLetters += ch;
			else if(Character.isLowerCase(ch))
				smallLetters += ch;
			else
				specialChar += ch;
		}
		System.out.println("Output is");
		System.out.println(digits + capLetters + smallLetters + specialChar);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String str = sc.next();
		new RearrangeString().rearrangeString(str);
	}	
}