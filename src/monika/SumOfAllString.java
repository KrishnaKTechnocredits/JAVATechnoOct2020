package monika;
/*

Assignment - 24 : 22nd Nov'2020 

program 1: sum of all digits from a given string  
input: te1ch9kj8 
output:= 18
*/

public class SumOfAllString {

	boolean isDigit(String name){
		boolean b1= false;
		int sum =0;
	 for(int i =0 ; i<name.length(); i++){
		 char ch = name.charAt(i);
		 b1 = Character.isDigit(ch);
		 if(b1)
			  sum = sum + Character.getNumericValue(ch);
		}
		System.out.println("Sum of Digits is: " + sum);
	return b1;
	}

	public static void main(String args []) {
		String input = "te1ch9kj8";
		SumOfAllString  sumofallstring = new SumOfAllString ();
		sumofallstring.isDigit(input);
	}
}
