package brijesh.assignment15;

import java.util.Scanner;

/*
Find the frequency of character from a given String array. [Estimated time: 15-20 mins]
sample input array : { "technocredits","elephant","earthear"} and char is 'e'
output : technocredits -> 2
              elephant -> 2
              earth -> 1
              Total occurrence of e -> 5
*/

public class Program1 {
	void findFrequency(String[] string, char character) {
		int totalCount=0;
		for(int outerLoop=0;outerLoop<string.length;outerLoop++) {
			int individualCount=0;
			for(int innerLoop=0;innerLoop<string[outerLoop].length();innerLoop++) {
				if(string[outerLoop].charAt(innerLoop)==character) {
					individualCount++;
					totalCount++;
				}
			}
			System.out.println("Occurance of '"+character+"' in "+string[outerLoop]+": "+individualCount);
		}
		System.out.println("Occurance of '"+character+"' in all strings: "+totalCount);
	}

	public static void main(String[] args) {
		System.out.println("Please enter number of string you want to scan: ");
		Scanner scanner = new Scanner(System.in);
		int number=scanner.nextInt();
		String[] string = new String[number];
		for (int index = 0; index < number; index++) {
			System.out.println("Please enter name" + (index + 1) + ": ");
			string[index]=scanner.next();
		}
		System.out.println("Please enter character you want to search in string: ");
		new Program1().findFrequency(string,scanner.next().charAt(0));
		scanner.close();
	}

}
