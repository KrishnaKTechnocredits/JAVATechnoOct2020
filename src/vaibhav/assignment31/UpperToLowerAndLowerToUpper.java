package vaibhav.assignment31;
/*Program 2:
Do Sum of all numbers and Convert Uppercase into lowercase, lowercase into uppercase using ASCII.
Given String = "Te1ch8n9oC6reDi5TS1"
Expected String = "30tECHNOcREdIts"*/

public class UpperToLowerAndLowerToUpper {
	
	private void getConvertedCase(String givenString) {
		String convertedString="";
		int sum = 0;		
		for(int i = 0 ; i < givenString.length(); i++) {
			if(Character.isDigit(givenString.charAt(i))){
				char c = givenString.charAt(i);
				int temp = Integer.parseInt(givenString.valueOf(c));
				sum += temp;
			}
			else if( givenString.charAt(i) >= 65 && givenString.charAt(i) <= 90) {
				convertedString += (char)(givenString.charAt(i) + 32);
			}
			else if( givenString.charAt(i) >= 97 && givenString.charAt(i) <= 122) {
				convertedString += (char)(givenString.charAt(i) - 32);
			}			
		}	
		System.out.println("String After Conversion "+sum+convertedString);
	}

	public static void main(String[] args) {
		String givenString = "Te1ch8n9oC6reDi5TS1";
		UpperToLowerAndLowerToUpper  upperToLowerAndLowerToUpper = new UpperToLowerAndLowerToUpper(); 
		upperToLowerAndLowerToUpper.getConvertedCase(givenString);		
	}
}
