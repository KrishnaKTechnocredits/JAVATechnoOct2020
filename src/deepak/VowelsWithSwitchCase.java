/*Java Program to Count the Number of Vowels in user defined string.

Input : technocredits
output : vowels are e , o, i */

package deepak;

public class VowelsWithSwitchCase {
	
	void printVowelsInString(String inputWord) {
		int aCount=0;
		int eCount=0;
		int iCount=0;
		int oCount=0;
		int uCount=0;
		
		for(int index=0; index < inputWord.length(); index++) {
			
			switch(inputWord.charAt(index)){
				
			case'a':
			case'A':
				aCount++;
				System.out.println(inputWord.charAt(index));
				break;
				
			case'e':
			case'E':
				eCount++;
				System.out.println(inputWord.charAt(index));
				break;
				
			case'i':
			case'I':
				iCount++;
				System.out.println(inputWord.charAt(index));
				break;
				
			case'o':
			case'O':
				oCount++;
				System.out.println(inputWord.charAt(index));
				break;
				
			case'u':
			case'U':
				uCount++;
				System.out.println(inputWord.charAt(index));
				break;
			}
			
		}
			
			if(aCount !=0 || eCount !=0 || iCount !=0 || oCount !=0 || uCount !=0)
		
				System.out.println("A count: "+ aCount + "; E count: " + eCount + "; I count: " + iCount + "; O count: " + oCount + "; U count: " + uCount);
				else 
					System.out.println("No vowels present in the given string.");
	
		}		
			

	
	

	public static void main(String[] args) {
		
		String word = "technocredits";
		
		VowelsWithSwitchCase vowelsWithSwitchCase = new VowelsWithSwitchCase();
		
		vowelsWithSwitchCase.printVowelsInString(word);
		
	

	}

}
