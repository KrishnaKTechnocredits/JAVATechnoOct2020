/*Assignment 17 : 13th nov'2020 
Find the frequency of each character from user given word
but each frequency should be printed single time.
input : aakanksha
output : a -> 4
              k -> 2
              n -> 1
              s -> 1
              h -> 1
 */


package kajol;

import java.util.Scanner;

public class FrequencyOfEachCharInUserGivenWord {

		void findfrequencyOfChar(String inputString) {
			for(int index=0;index<inputString.length();index++) {
				int charFrequency=0;
				char inputCharacter= inputString.charAt(index);
				for(int innerIndex=0;innerIndex<inputString.length();innerIndex++) {
					if(inputString.charAt(innerIndex)==inputCharacter && index==inputString.indexOf(inputCharacter))
						charFrequency++;
				}	
				if(charFrequency>0)
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