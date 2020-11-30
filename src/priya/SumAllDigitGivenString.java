//program 2 : sum of all numbers in a give string 
//input: te123ch9kj8/////output : 123 + 9 + 8 = 140

package priya;

public class SumAllDigitGivenString {

	void calculateDigitGivenString(String str) {
		String num ="";
		int sum =0;
		for(int index =0; index< str.length(); index++) {
			if(Character.isDigit(str.charAt(index)))
			num = num+str.charAt(index);
			else
			    if(!num.equals("")) {
				  sum = sum + Integer.parseInt(num);
				  num = "";
                }
			    if(index == str.length()-1 && num!="")
			    	sum = sum + Integer.parseInt(num);
		}
		System.out.println("Total Sum of Digits is: " + sum);

	}

	public static void main(String args[]) {
		SumAllDigitGivenString sumalldigitgivenstring = new SumAllDigitGivenString();
		String inputval = "te123ch9kj8";
		sumalldigitgivenstring.calculateDigitGivenString(inputval);	
	}
}
