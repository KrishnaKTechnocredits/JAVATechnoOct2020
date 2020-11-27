/*program 1: sum of all digits from a given string  
input: te1ch9kj8 */

package deepak.assignment24;

public class Program_1 {
	
	void sumOfDigits(String input) {
		int sum=0;
		
		for(int index=0; index<input.length(); index++) {
			
			char ch = input.charAt(index);
			
			if(Character.isDigit(ch)) {
				
				sum = sum+Character.getNumericValue(ch);
			}
		}
		
		System.out.println("Sum of digits in given string :"+ sum);
	}

	public static void main(String[] args) {
		
		Program_1 program1 = new Program_1();
		
		String str="te1ch9kj8";
		program1.sumOfDigits(str);
	}
}
