package milind;

import java.util.Scanner;

public class StringPalindrom {
	
	void checkISStringPalindrom(String input) {
		String reverseString = "";
		for(int index = input.length()-1; index >=0; index--) {
			reverseString = reverseString + input.charAt(index);
		}
		if(input.equalsIgnoreCase(reverseString)) {
			System.out.println(input + " string is palindrom");
		}else {
			System.out.println(input + " string is not palindrom");
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter string : ");
		String input = scanner.nextLine();
		StringPalindrom stringPalindrom = new StringPalindrom();
		stringPalindrom.checkISStringPalindrom(input);
		scanner.close();
	}
}
