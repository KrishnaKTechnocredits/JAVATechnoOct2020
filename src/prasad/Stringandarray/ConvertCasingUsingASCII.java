package prasad.Stringandarray;

/*Program 1: 
Convert UpperCase into a LowerCase using ASCII 
Given String = "TechnoCreditS"
Expected String = "technocredits"*/

public class ConvertCasingUsingASCII {
	
	String convertCasing(String input) {
		String output ="";
		for(int index=0;index<input.length();index++) {
			char ch = input.charAt(index);
			int chrValue= ch;
			if(chrValue>=65 && chrValue<=90) {
				ch=(char)(ch+32);
				output=output+ch;
			}
			else
				output=output+ch;
		}
		
		return output;
		
	}
	
	public static void main(String[]arg) {
		ConvertCasingUsingASCII convertcasingusingASCII = new ConvertCasingUsingASCII();
		String input = "TechnoCreditS";
		System.out.println("Input:- " + input);
		System.out.println("Converting all uppercase char in the given string to smallcase & printing the string -> ");
		String output= convertcasingusingASCII.convertCasing(input);
		System.out.println("Output:- " + output);
	}

}
