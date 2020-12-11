/*Assignment - 27: 23rd Nov'2020  

Program 1: print all the words which does't have any digit. 
String[] input = {"Masgj3Pw", "r4fsjk","techno","sfjk44lk"};
output : techno*/


package kajol;

import java.util.Arrays;

public class PrintWordsWhichDoesnotHaveAnyDigit {
	
	void findWordsWithNoDigits(String[] inputArray) {
		int wordCount=0;
		System.out.println("Given String Array : "+Arrays.toString(inputArray));
		System.out.println();
		
		for(int index=0;index<inputArray.length;index++) {
			int digitCount=0;
			for(int innerIndex=0;innerIndex<inputArray[index].length();innerIndex++) {
				if(Character.isDigit(inputArray[index].charAt(innerIndex))) {
					digitCount++;
				    break;
				}	
			}
			if(digitCount==0) {
				wordCount++;//Optional
				System.out.println("Word which doesn't have any Digit : "+inputArray[index]);
			}			
		}
		if(wordCount==0)//Optional
		System.out.println("No word found with Digit Count as zero.");	//optional
	}
	
	public static void main(String[] args) {
		String[] inputArray = {"Masgj3Pw", "r4fsjk","techno","sfjk44lk"};
		new PrintWordsWhichDoesnotHaveAnyDigit().findWordsWithNoDigits(inputArray);
	}
}
