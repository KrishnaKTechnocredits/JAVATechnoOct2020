package himali.Assignment18;

import java.util.Scanner;

public class Program1 {

	void maxWordFrequency(String input) {
		int max=0;
		String maxOccurWord=null;
		String[] inputArray=input.split(" ");
		for(int index=0;index<inputArray.length;index++) {
			String matchWord=inputArray[index];
			int freqCount=0;
			if(input.contains(matchWord)){
				for(int occurenceIndex=0;occurenceIndex<inputArray.length;occurenceIndex++) {
					if(matchWord.equals(inputArray[occurenceIndex]))
						freqCount++;	
				     }				
			     } 
			     if(freqCount>max) {
			    	 max=freqCount;
			    	 maxOccurWord=inputArray[index];
			     }   
			     input=input.replace(maxOccurWord, " ");	     
			}
         System.out.println("Maximum occuring word is '"+maxOccurWord+"' with occurence of "+max+" times.");
		}


	public static void main(String[] args) {
		Program1 program = new Program1();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = scanner.nextLine();
		program.maxWordFrequency(str);
		scanner.close();
	}
}
