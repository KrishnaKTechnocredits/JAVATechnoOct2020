/*program 2 : sum of all numbers in a give string 
input: te123ch9kj8 
output : 123 + 9 + 8 = 140*/

package kajol;

import java.util.Scanner;

public class SumOfConsecutiveDigitsinaString {
	
	int sum=0;
	String temp="0";
	void SumofConsecutiveDigits(String inputString) {
		for(int index=0;index<inputString.length();index++) {
			if(Character.isDigit(inputString.charAt(index)))
				temp+=inputString.charAt(index);
			else {
				sum+=Integer.parseInt(temp);
			    temp="0";
			}
		}
		sum+=Integer.parseInt(temp);
		System.out.println("Given String is: "+inputString);
		System.out.println("Sum of Digts: "+sum);	
	}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please Enter a AlphaNumeric String");
		new SumOfConsecutiveDigitsinaString().SumofConsecutiveDigits(scanner.next());
		scanner.close();
	}
}


