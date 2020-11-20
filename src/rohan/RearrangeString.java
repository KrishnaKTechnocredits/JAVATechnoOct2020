package rohan;

import java.util.Scanner;

/*Program : 2 
String input = "hmPZ23i9Ws"
output = "239PZWhmis";*/

public class RearrangeString {
	
	void reArrangingString(String str) {
		String numbers ="",capitalLetters="",smallLetters= "",specialChars="";
		for(int index=0;index<str.length();index++) {
			if(Character.isDigit(str.charAt(index))) 
				numbers +=(str.charAt(index));
			else if(Character.isUpperCase(str.charAt(index)))
				capitalLetters += (str.charAt(index));
			else if(Character.isLowerCase(str.charAt(index)))
				smallLetters +=(str.charAt(index));
			else
				specialChars +=(str.charAt(index));
		}
		System.out.println("-----Output-------");
		System.out.println(numbers+capitalLetters+smallLetters+specialChars);
	}
	
	public static void main(String[] args) {
		RearrangeString rearrangeString = new RearrangeString();		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string line: ");
		String str = sc.nextLine();
		rearrangeString.reArrangingString(str);
		sc.close();
	}
}
