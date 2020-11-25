package prem;

import java.util.Scanner;

//Assignment 16 : 12th nov'2020 
//Find the frequency of each character from user given word.

public class FindCharaterFrequency {
	
		void findFrequency(String string) {
		int counter = 0;
		for (int i = 0; i < string.length(); i++) {
			Character Ch = string.charAt(i);
			if( string.indexOf(string.charAt(i))==i){
			for (int j = 0; j < string.length(); j++) {
				if (string.charAt(i) == string.charAt(j) ) {
					counter++;
				}
			}
			System.out.println("The Character " + string.charAt(i) + " occured  ->" + counter + " times");
			counter = 0;
			}
		}
	}
	public static void main(String[] args) {
		FindCharaterFrequency frequency = new FindCharaterFrequency();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input the String ");
		String userInput = scanner.next();
		frequency.findFrequency(userInput);
		scanner.close();
	}
}
