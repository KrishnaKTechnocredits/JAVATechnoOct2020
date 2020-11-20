package vaibhav;

//This program will display the characters occurred in a string

import java.util.Scanner;

public class FindingOccuranceEachChar {
	
	public static void occuranceOfCharacter(String givenString) {		
		for (int i = 0; i < givenString.length();i++){
			int count = 0;
			char temp = givenString.charAt(i);
			for (int j = 0; j < givenString.length();j++) {
				if (givenString.charAt(j) == temp)
					count++;			
			}
			System.out.println("Character "+temp+" is present "+count+" times");
		}
		
	}

	public static void main(String[] args) {
		System.out.println("Please input a string");
		Scanner scanner = new Scanner(System.in);
		String givenString = scanner.next();
		FindingOccuranceEachChar.occuranceOfCharacter(givenString);
		scanner.close();
	}

}
