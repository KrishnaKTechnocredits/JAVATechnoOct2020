package milind;

import java.util.Scanner;

public class VowelsInString {
	
	static void findVowelsFromString(String stringToFindVowels) {
		System.out.print("Vowels in string are : ");
		for(int index = 0; index < stringToFindVowels.length(); index++) {
			if(stringToFindVowels.charAt(index) == 'a' || stringToFindVowels.charAt(index) == 'e' || stringToFindVowels.charAt(index) == 'i' || stringToFindVowels.charAt(index) == 'o' || stringToFindVowels.charAt(index) == 'u' || stringToFindVowels.charAt(index) == 'A' || stringToFindVowels.charAt(index) == 'E' || stringToFindVowels.charAt(index) == 'I' || stringToFindVowels.charAt(index) == 'O' || stringToFindVowels.charAt(index) == 'U') {
				System.out.print(stringToFindVowels.charAt(index) + ",");
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter string : ");
		String stringToFindVowels = scanner.nextLine();
		findVowelsFromString(stringToFindVowels);
		scanner.close();
	}
}
