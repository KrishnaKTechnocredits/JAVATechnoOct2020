package ankit;

import java.util.Scanner;

public class EachCharacterFrequency {
	
	void scannerOperation(String word, int length) {
		
		for(int index =0; index<length; index++) {
			int counter=0;
			char character =word.charAt(index);
			for(int charIndex=0; charIndex<length; charIndex++) {
				if(character == word.charAt(charIndex))
					counter++;
			}
			System.out.println(character+ " is present " +counter+ " times in String");
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the word");
		String word= scanner.next();
		int length = word.length();
		EachCharacterFrequency eachCharacterFrequency = new EachCharacterFrequency();
		eachCharacterFrequency.scannerOperation(word, length);
		

	}

}
