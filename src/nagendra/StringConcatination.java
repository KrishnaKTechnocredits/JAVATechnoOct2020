package nagendra;

/*
String input = "hmPZ23i9Ws"
output = "239PZWhmis";

*/

public class StringConcatination {
	
	String getDigitNumber(String input){
		String outputDigitCase = "" ;
		for(int i=0;i<input.length();i++){
				if(Character.isDigit(input.charAt(i))){
					outputDigitCase +=input.charAt(i);
				}		
			}
		return outputDigitCase;	
	}
	
	String getLowerCaseString(String input){
		String outputLowerCase = "" ;
		for(int i=0;i<input.length();i++){
				if(Character.isLowerCase(input.charAt(i))){
					outputLowerCase +=input.charAt(i);
				}		
			}
		return outputLowerCase;	
	}
	
	String getUpperCaseString(String input){
		String outputUpparCase= "" ;
		for(int i=0;i<input.length();i++){
				if(Character.isUpperCase(input.charAt(i))){
					outputUpparCase +=input.charAt(i);
				}		
			}
		return outputUpparCase;	
	}

	public static void main(String[] args) {
		StringConcatination test =new StringConcatination();
		String userInput="hmPZ23i9Ws";
		String digit=test.getDigitNumber(userInput);
		String loweCase=test.getLowerCaseString(userInput);
		String upparCase=test.getUpperCaseString(userInput);
		System.out.println("<------Output for input "+userInput+"   is  -------->");
		String output=digit+upparCase+loweCase;
		System.out.println(output);
	}
}
