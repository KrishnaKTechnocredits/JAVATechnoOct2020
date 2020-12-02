package priyanka;

import java.util.Scanner;

/*Assignment 14 : 10th Oct 2020 

Find the frequency of character from a given String array.
Note: Take String and character from the user.*/

public class FrequencyOfCharater {

	void frequencyOfChar(String word, char ch) {
		int count = 0;
		for (int index = 0; index < word.length(); index++) {
			if (word.charAt(index) == ch)
				count++;
		}
		System.out.println(count);
	}
	public static void main(String[] arg) {
		FrequencyOfCharater frequencyOfCharater = new FrequencyOfCharater();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a word");
		String word = scanner.next();
		System.out.println("Enter the Charater to check Frequence");
		String charater = scanner.next();
		int count = 1;
		while (charater.length()!= 1 && count<3) {
			System.out.println("Please enter Single charater");
			System.out.println("Last " + (3 - count) + " attempts left");
			charater = scanner.next();
			count++;
		}
			if(charater.length() != 1)
				System.out.println("you have exceed the attempts, please try later");
			else {
				char ch = charater.charAt(0);
				System.out.println("Charater is : " + ch);
				frequencyOfCharater.frequencyOfChar(word, ch);
			}
}
}