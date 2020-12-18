/*Program 2:
Do Sum of all numbers and Convert Uppercase into lowercase, lowercase into uppercase using ASCII.
Given String = "Te1ch8n9oC6reDi5TS1"
Expected String = "30tECHNOcREdIts"*/

package kajol;

import java.util.Scanner;

public class SumOfNumbersAndConvertCaseUsingASCII {
	
	void findsumOfNumbersAndConvertUppercaseIntoLowercase(String inputString) {
		System.out.println("Given String  : "+inputString);
		int sumOfNumbers=0;
		String convertedString="";
		for(int index=0;index<inputString.length();index++) {
			if(inputString.charAt(index)>=65 && inputString.charAt(index)<=90) 
				convertedString+=(char)(inputString.charAt(index)+32);
			else if(inputString.charAt(index)>=97 && inputString.charAt(index)<=122)
				convertedString+=(char)(inputString.charAt(index)-32);
			else if(inputString.charAt(index)>=48 && inputString.charAt(index)<=57)
				sumOfNumbers+=Integer.parseInt(String.valueOf(inputString.charAt(index)));
			else
				convertedString+=inputString.charAt(index);
	 	}
		System.out.println("String After Conversion and with Sum of Numbers : "+sumOfNumbers+convertedString);
	}
	
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please Enter the String you want to convert:");
		new SumOfNumbersAndConvertCaseUsingASCII().findsumOfNumbersAndConvertUppercaseIntoLowercase(scanner.next());
		scanner.close();
			
	}

}
