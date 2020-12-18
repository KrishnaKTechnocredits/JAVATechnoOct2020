/*Program 2: print all the words where digit sum is > 10. 
String[] input = {"Ma1s3gj3Pw", "r4f3sjk","te3ch2no9","sfjk4p4plpk"};
output : te3ch2no9*/

package kajol;

import java.util.Arrays;

public class PrintWordWhichHaveDigitSumGreaterThanTen {
	
	void findWordsWithNoDigits(String[] inputArray) {
		int wordCount=0;
		System.out.println("Given String Array : "+Arrays.toString(inputArray));
		System.out.println();
		for(int index=0;index<inputArray.length;index++) {
			int sum=0;
			for(int innerIndex=0;innerIndex<inputArray[index].length();innerIndex++) {
				if(Character.isDigit(inputArray[index].charAt(innerIndex))) {
					sum+=Character.getNumericValue(inputArray[index].charAt(innerIndex));
				}	
			}
			if(sum>10) {
				wordCount++;//Optional
				System.out.println("Word which have Digit Sum Greater than Ten : "+inputArray[index]);
			}			
		}
		if(wordCount==0)//Optional
			System.out.println("No word found with Digit Sum greater than Ten.");	//optional
	}
	
	public static void main(String[] args) {
		String[] inputArray = {"Ma1s3gj3Pw", "r4f3sjk","te3ch2no9","sfjk4p4plpk"};
		new PrintWordWhichHaveDigitSumGreaterThanTen().findWordsWithNoDigits(inputArray);	
	}	
}
