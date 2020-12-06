package prasad.Stringandarray;

/*Program 2:
Do Sum of all numbers and Convert Uppercase into lowercase, lowercase into uppercase using ASCII.
Given String = "Te1ch8n9oC6reDi5TS1"
Expected String = "30tECHNOcREdIts"*/

public class ConvertCasingUsingASCIIandSumOfNos {
	
	String processString(String input) {
		int numbers = 0;
		String outputString="";
		for(int index=0;index<input.length();index++) {
			char ch = input.charAt(index);
			if(Character.isDigit(ch)) {
				numbers+= Character.getNumericValue(ch); 
			}
			else if(Character.isAlphabetic(ch)) {
				if(ch>=97&&ch<=122) {
					outputString+= (char)(ch-32);
				}
				else if(ch>=65&&ch<=90) {
					outputString+= (char)(ch+32);
				}
			}
		}
		
		
		return numbers+outputString;
	}
	
	public static void main (String[]arg) {
		ConvertCasingUsingASCIIandSumOfNos refVar = new ConvertCasingUsingASCIIandSumOfNos();
		String input = "Te1ch8n9oC6reDi5TS1";
		System.out.println("Input String:- " + input);
		System.out.println("Converting Uppercase into lowercase, lowercase into uppercase..");
		System.out.println("Calculating sum of all digits if present in the given string..");
		String output = refVar.processString(input);
		System.out.println("");
		System.out.println("Output String:- " + output);

	} 

}
