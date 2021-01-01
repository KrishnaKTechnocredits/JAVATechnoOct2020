/*
Convert UpperCase into a LowerCase using ASCII 
Given String = "TechnoCreditS"
Expected String = "technocredits"
*/

package vishakha;

public class Asgnmt31_ConvertCaseWithAscii {
	
	void convertCaseUsingAscii(String string) {
		String newString="";
		for(int index=0; index<string.length(); index++) {
			char character=string.charAt(index);
			if(character>=65 && character<=90)
				newString+=(char)(character+32);
			else
				newString+=character;
		}
		System.out.println("Case converted string is : "+newString);
	}

	public static void main(String[] args) {
		Asgnmt31_ConvertCaseWithAscii convertCase = new Asgnmt31_ConvertCaseWithAscii();
		convertCase.convertCaseUsingAscii("TechnoCreditS");
	}
}