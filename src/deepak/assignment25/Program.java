/*Assignment - 25 : 22nd Nov'2020
Program 1: sum of all numbers from give string.  
String msg = I have 15 years and 2 months of experience. */

package deepak.assignment25;

public class Program {

	void sumOfDigitsInStringMessage(String input) {
		String temp="";
		int sum = 0;
		String[] arr = input.split(" ");
		
		for(int i=0; i<arr.length; i++) {
			String word = arr[i];
			
			for(int j=0; j<word.length(); j++) {
				char ch = word.charAt(j);
				
				if(Character.isDigit(ch)) {
	
					temp = temp + ch;
				}
				else {
					if(temp.length() > 0) {
					sum = sum + Integer.parseInt(temp);
					temp="";	
					}
				}	
			}
		}
		
		System.out.println("Sum of digits in message :"+ sum);
	}
	
	public static void main(String[] args) {
		
		String msg = "I have 15 years and 2 months of experience";
		Program program = new Program();
		program.sumOfDigitsInStringMessage(msg);
	}
}
