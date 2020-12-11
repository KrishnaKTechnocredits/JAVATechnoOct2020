//Assignment - 24 : 22nd Nov'2020 Raise PR before Monday EOD
//program 1: sum of all digits from a given string  
//input: te1ch9kj8////output:= 18


package priya;

public class SumOfAllDigits {

	boolean isDigit(String name){
		boolean b1= false;
		int sum =0;
	 for(int index =0 ; index<name.length(); index++){
		 char ch = name.charAt(index);
		 b1 = Character.isDigit(ch);
		 if(b1)
			  sum = sum + Character.getNumericValue(ch);
		}
		System.out.println("Sum of Digits is: " + sum);
	return b1;
	}

	public static void main(String args []) {
		String input = "te1ch9kj8";
		SumOfAllDigits sumofdigit = new SumOfAllDigits();
		sumofdigit.isDigit(input);
	}
}
