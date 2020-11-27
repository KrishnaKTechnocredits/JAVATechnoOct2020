/*Assignment - 24 : 22nd Nov'2020 ----

program 1: sum of all digits from a given string  
input: te1ch9kj8 
output:= 18*/

package kajol;

import java.util.Scanner;

public class SumofallDigitsfromGivenString {
	int sum=0;
	void SumofallDigits(String inputString) {
		for(int index=0;index<inputString.length();index++) {
			if(Character.isDigit(inputString.charAt(index)))
				sum+=Character.getNumericValue(inputString.charAt(index));
		}
		System.out.println("Given String is: "+inputString);
		System.out.println("Sum of Digts: "+sum);	
	}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please Enter a AlphaNumeric String");
		new SumofallDigitsfromGivenString().SumofallDigits(scanner.next());
		scanner.close();
	}
}
