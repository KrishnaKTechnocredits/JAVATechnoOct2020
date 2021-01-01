/* Do Sum of all numbers and Convert Uppercase into lowercase, lowercase into uppercase using ASCII.
Given String = "Te1ch8n9oC6reDi5TS1"
Expected String = "30tECHNOcREdIts" 

ASCII VALUE

0 - 9 : 48 to 57
A - Z : 65 to 90
a - z : 97 to 122

*/


package deepak.assignment31;

public class Program2 {
	
	
	void processData(String input) {
		
		int sum=0;
		String output = "";
		
		for(int i=0; i<input.length(); i++) {
			
			char ch = input.charAt(i);
			
			if(Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);
			}
			
			else if(ch >= 65 && ch <= 90) {
				
				char temp = (char) (ch + 32);
				output = output + temp;
			}
			
			else if(ch >= 97 && ch <= 122) {
				char temp = (char) (ch - 32);
				output = output + temp;	
			}	
			
		}
		
		System.out.println(sum + output);
	}

	
	public static void main(String[] args) {
		
		String str = "Te1ch8n9oC6reDi5TS1";
		Program2 refVar = new Program2();
		refVar.processData(str);

	}

}
