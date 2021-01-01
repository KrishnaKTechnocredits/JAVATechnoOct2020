package vaibhav.assignment31;

/*Program 1:
Convert UpperCase into a LowerCase using ASCII
Given String = "TechnoCreditS"
Expected String = "technocredits"*/

public class ConvertUpperCase {
	
	public static void getLowerCase(String givenString) {
		String lowerCaseString = "";
		for (int i = 0 ; i < givenString.length();i++ ) {
			int temp = givenString.charAt(i);
			if( temp >= 65 && temp <= 90) {
				lowerCaseString += (char)(temp + 32);
			}
			else {
				lowerCaseString += (char)temp;
			}
		}
		System.out.println(lowerCaseString);
	}

	public static void main(String[] args) {
		String givenString = "TecHNOCreditS";
		ConvertUpperCase.getLowerCase(givenString);		
	}
}
