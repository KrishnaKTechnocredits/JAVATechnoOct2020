package milind;

import java.util.Scanner;

public class FrequencyOfCharFromString {
	static void frequencyOfChar(String inputString) {
		for(int index = 0; index < inputString.length(); index++) {
			char ch = inputString.charAt(index);
			char ch1 = Character.toUpperCase(ch);
			int count = 0;
			for(int index1 = 0; index1 < inputString.length(); index1++) {
				char charForCompare = inputString.charAt(index1);
				char charForCompare1 = Character.toUpperCase(charForCompare);
				if(ch1 == charForCompare1) {
					count++;
				}
			}
			System.out.println("Character " + ch1 + " frequency is : " + count);
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter string for check frequency of each character : ");
		String input = scanner.nextLine();
		frequencyOfChar(input);
		scanner.close();
	}

}
