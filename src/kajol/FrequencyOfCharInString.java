package kajol;

import java.util.Scanner;

public class FrequencyOfCharInString {
	
	int findfrequencyOfChar(String inputString, char inputCharacter) {
		int charFrequency=0;
		for(int index=0;index<inputString.length();index++) {
			if(inputString.charAt(index)==inputCharacter)
				charFrequency++;
		}
		System.out.println("The frequency or occurence of character '"+inputCharacter+"' in String "+inputString+" is: "+charFrequency+" times.");
		return charFrequency;	
	}
	
	public static void main(String[] args) {
		FrequencyOfCharInString frequencyOfCharInString=new FrequencyOfCharInString();
		Scanner scanner= new Scanner(System.in);
		System.out.println("Please Enter a String:");
		String inputString=scanner.next();
		System.out.println("Please Enter a character for which you want to find frequency or occurence of in "+inputString+" :");
		frequencyOfCharInString.findfrequencyOfChar(inputString, scanner.next().charAt(0));
		scanner.close();
	}

}
