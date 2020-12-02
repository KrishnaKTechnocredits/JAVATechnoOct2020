/*Assignment 18:
String input = "hmPZ23i9Ws"
String output = "239PZWhmis"
*/
package ankit.Scanner;

import java.util.Scanner;

public class StringArrangment {

		void reArrangingString(String string) {
			String numbers ="",upperCaseLetters="",lowerCaseLetters= "",specialCharacters="";
			for(int index=0;index<string.length();index++) {
				if(Character.isDigit(string.charAt(index))) 
					numbers +=(string.charAt(index));
				else if(Character.isUpperCase(string.charAt(index)))
					upperCaseLetters += (string.charAt(index));
				else if(Character.isLowerCase(string.charAt(index)))
					lowerCaseLetters +=(string.charAt(index));
				else
					specialCharacters +=(string.charAt(index));
			}
			System.out.println("Output to given string is: " +numbers+upperCaseLetters+lowerCaseLetters+specialCharacters);
		}

		public static void main(String[] args) {
			StringArrangment stringArrangment = new StringArrangment();		
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the mixed string with all the values: ");
			String string = scanner.nextLine();
			stringArrangment.reArrangingString(string);
			scanner.close();
		}
	
}
