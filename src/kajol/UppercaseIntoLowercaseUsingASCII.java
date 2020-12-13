/*Assignment 31 :  2nd Dec 2020
Program 1: 
Convert UpperCase into a LowerCase using ASCII 
Given String = "TechnoCreditS"
Expected String = "technocredits"*/

package kajol;

import java.util.Scanner;

public class UppercaseIntoLowercaseUsingASCII {
	void convertUppercaseIntoLowercase(String inputString) {
		System.out.println("Given String  : "+inputString);
		String convertedString="";
		for(int index=0;index<inputString.length();index++) {
			if(inputString.charAt(index)>=65 && inputString.charAt(index)<=90) 
				convertedString+=(char)(inputString.charAt(index)+32);
			else if(inputString.charAt(index)>=97 && inputString.charAt(index)<=122)
				convertedString+=(char)(inputString.charAt(index)-32);
			else
				convertedString+=inputString.charAt(index);
	 	}
		System.out.println("String After Conversion : "+convertedString);
	}
	
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please Enter the String you want to convert:");
		new UppercaseIntoLowercaseUsingASCII().convertUppercaseIntoLowercase(scanner.next());
		scanner.close();
			
	}

}
