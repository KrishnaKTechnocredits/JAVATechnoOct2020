package monika;
/*Assignment 17 : 13th Nov'2020 

Same as Assignment 16 but each frequency should be printed single time.
input : aakanksha
output : a -> 4
              k -> 2
              n -> 1
              s -> 1
              h -> 1
			  
			  */

import java.util.Scanner;

public class FrequencyOfEachCharacter {

	public static void occuranceOfEachChar(String word) {
		for (int i = 0; i < word.length(); i++) {
			int count = 0;
			char ch = word.charAt(i);
			int index = word.indexOf(word.charAt(i));
			if(i==index) {
			for (int j = 0; j < word.length(); j++) {
				if (word.charAt(i) == word.charAt(j))
					count++;
			}
			System.out.println(ch + " -> " + count);
			}
		}

	}

	public static void main(String[] args) {
		System.out.println("Please enter a word");
		Scanner scanner = new Scanner(System.in);
		String givenString = scanner.next();
		FrequencyOfEachCharacter.occuranceOfEachChar(givenString);
		scanner.close();
	}
}
