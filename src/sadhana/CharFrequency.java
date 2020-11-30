package sadhana;

/* 
Assignment 17 : 13th Nov'2020
Find occunameence of each character in string but each frequency should be printed single time.
input : aakanksha
output : a -> 4
k -> 2
n -> 1
s -> 1
h -> 1
*/
import java.util.Scanner;

public class CharFrequency {

	void printCharFrequencySingleTime(String name) {
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			int count = 0;
			if (name.indexOf(ch) == i) {
				for (int j = 0; j < name.length(); j++) {
					if (name.charAt(j) == ch)
						count++;
				}
				System.out.println("Character " + ch + " " + count + " times");
			}
		}
	}

	public static void main(String[] args) {
		String input = "aakanksha";
		System.out.println("Input string is: " + input);
		CharFrequency charFrequency = new CharFrequency();
		System.out.println("Frequency of each character in given string is: ");
		charFrequency.printCharFrequencySingleTime(input);

	}
}