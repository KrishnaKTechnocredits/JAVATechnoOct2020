package kajol;

import java.util.Scanner;

public class FrequencyOfEachCharInUserGivenWord {

	void findfrequencyOfChar(String inputString) {
		for(int index=0;index<inputString.length();index++) {
			int charFrequency=0;
			char inputCharacter= inputString.charAt(index);
			for(int innerIndex=0;innerIndex<inputString.length();innerIndex++) {
				if(inputString.charAt(innerIndex)==inputCharacter)
					charFrequency++;
			}	
			System.out.println("The frequency or occurence of character '"+inputCharacter+"' in String "+inputString+" is: "+charFrequency+" times.");
		}	
	}
	
	public static void main(String[] args) {
		FrequencyOfEachCharInUserGivenWord frequencyOfEachCharInUserGivenWord=new FrequencyOfEachCharInUserGivenWord();
		Scanner scanner= new Scanner(System.in);
		System.out.println("Please Enter a String:");
		frequencyOfEachCharInUserGivenWord.findfrequencyOfChar(scanner.next());
		scanner.close();
	}
}
