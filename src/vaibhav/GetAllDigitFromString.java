package vaibhav;

/*program 2 : sum of all numbers in a give string
input: te123ch9kj8
output : 123 + 9 + 8 = 140*/


public class GetAllDigitFromString {
	
	void getAllDigit(String str) {
		int sum = 0;
		String temp = "";
		boolean flag = false;
		for (int index = 0 ; index < str.length();index++) {
			char ch=str.charAt(index);
			if(Character.isDigit(ch)) {
				flag = true;
				temp = temp+Character.getNumericValue(ch);				
			}
			if (Character.isLetter(ch) && flag == true  || index == str.length()-1 )
			{
				sum = sum + Integer.parseInt(temp);
				flag = false;
				temp = "";
			}
		}		
		System.out.println("Addition of number from given string is "+sum);
 	}

	public static void main(String[] args) {		
		String given="te123ch9kj8";
		GetAllDigitFromString getLLDigitFromString = new GetAllDigitFromString();
		getLLDigitFromString.getAllDigit(given);
	}

}
