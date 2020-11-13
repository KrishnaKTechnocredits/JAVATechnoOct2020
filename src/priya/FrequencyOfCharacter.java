//Find the frequency of each character from user given word.
package priya;

import java.util.Scanner;

public class FrequencyOfCharacter {
	public static void occuranceOfCharacter(String word) {
		for (int index=0;index<word.length();index++) {
			int count = 0;
			char ch = word.charAt(index);
			for (int i=0;i<word.length();i++) {
				if(word.charAt(i)==ch)
					count++;
			}
			System.out.println("Character " +ch+ " is present " +count+ " times");
		}
	}
	public static void main(String[] args) {
		System.out.println("Please enter String");
		Scanner scanner = new Scanner(System.in);
		String word = scanner.next();
		FrequencyOfCharacter.occuranceOfCharacter(word);
		scanner.close();		
	}
}
