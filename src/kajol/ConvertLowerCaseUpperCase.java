/*Assignment - 26: 23rd Nov'2020  
convert all capital letters to small and small to capitial.

String msg = "tE1GfrEsT";
output : Te1gFReSt

Hint : isUpperCase(), isLowerCase(), toUpperCase(), toLowerCase()*/

package kajol;

import java.util.Scanner;

public class ConvertLowerCaseUpperCase {
	
	void lowerCaseUpperCaseConvertor(String inputString) {	
		System.out.println("Given String is : "+inputString);
		String convertedword="";
		for(int index=0;index<inputString.length();index++) {
			if(Character.isLetter(inputString.charAt(index))) {
				if(Character.isLowerCase(inputString.charAt(index)))
					convertedword+=Character.toUpperCase(inputString.charAt(index));
				else
					convertedword+=Character.toLowerCase(inputString.charAt(index));
			}
			else
				convertedword+=inputString.charAt(index);
		}
		System.out.println("Converted Word is : "+convertedword);	
	}
	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Please Provide a String to Convert....");
		new ConvertLowerCaseUpperCase().lowerCaseUpperCaseConvertor(scanner.nextLine());
		scanner.close();		
	}
}
