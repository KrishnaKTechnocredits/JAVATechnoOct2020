package deepak.assignment26;

public class UpperCaseToLowerAndLowerCaseToUpper {
	
	void processData(String input) {
		String str="";
		
		for(int i=0; i<input.length(); i++) {
			
			char ch = input.charAt(i);
			
			if(Character.isUpperCase(ch)) {
				
				str = str + Character.toLowerCase(ch);
				
				
			}
			else if(Character.isLowerCase(ch)) {
				str = str + Character.toUpperCase(ch);
			}
		}
		
		System.out.println("OUTPUT after Processing "+ str);
		
	}

	public static void main(String[] args) {
		
		UpperCaseToLowerAndLowerCaseToUpper upperCaseToLowerAndLowerCaseToUpper = new UpperCaseToLowerAndLowerCaseToUpper();
		
		String str = "tE1GfrEsT";
		
		upperCaseToLowerAndLowerCaseToUpper.processData(str);
	}
}
