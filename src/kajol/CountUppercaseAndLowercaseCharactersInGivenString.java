/*Assignment 32: 3rd Dec'2020

Program 1:  return true if UpperCase characters count are more than lowercase else return false.
input : TechnoCrediTS
output : false*/

package kajol;

import java.util.Scanner;

public class CountUppercaseAndLowercaseCharactersInGivenString {
	int uppercaseCount=0;
	int lowercaseCount=0;
	boolean countCharacters(String inputString) {
		int uppercaseCount=0;
		int lowercaseCount=0;
		for(int index=0;index<inputString.length();index++) {
			if(inputString.charAt(index)>=65 && inputString.charAt(index)<=90)
				uppercaseCount++;
			else if(inputString.charAt(index)>=97 && inputString.charAt(index)<=122)
				lowercaseCount++;
		}
		if(uppercaseCount>lowercaseCount)
		return true;
		else if(uppercaseCount<lowercaseCount) 
		return false;
		else
		System.out.println("Both Counts are equal or there are no characters in a string");
		return false;	
	}
	
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please Enter a String to Count Uppercase and Lowercase Characters:");
		System.out.println("Is Uppercase characters count is more than Lowercase characters count :"+new CountUppercaseAndLowercaseCharactersInGivenString().countCharacters(scanner.next()));
		scanner.close();
	}
}
