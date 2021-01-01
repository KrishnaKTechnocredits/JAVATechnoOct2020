package monika;
/*
Assignment - 24 : 22nd Nov'2020 

 program 2 : sum of all numbers in a give string 
input: te123ch9kj8 
output : 123 + 9 + 8 = 140

Raise PR before Monday EOD
*/

public class SumOfAllGiven {

	void calculateConsecutiveSeqNumbers(String str) {
		String num ="";
		int sum =0;
		for(int i =0; i< str.length(); i++) {
			if(Character.isDigit(str.charAt(i)))
			num = num+str.charAt(i);
			else
			    if(!num.equals("")) {
				  sum = sum + Integer.parseInt(num);
				  num = "";
                }
			    if(i == str.length()-1 && num!="")
			    	sum = sum + Integer.parseInt(num);
		}
		System.out.println("Sum of all number in given string : " + sum);

	}

	public static void main(String args[]) {
		SumOfAllGiven sumofallgiven = new SumOfAllGiven();
		String inputval = "te123ch9kj8";
		sumofallgiven.calculateConsecutiveSeqNumbers(inputval);	
	}
}