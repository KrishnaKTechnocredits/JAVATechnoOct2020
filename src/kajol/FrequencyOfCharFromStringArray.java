/*Assignment 15 : 11th Oct 2020 

Program 1  :  [ Compulsory ]
Find the frequency of character from a given String array. [Estimated time: 15-20 mins]
sample input array : { "technocredits","elephant","earthear"} and char is 'e'
output : technocredits -> 2
              elephant -> 2
              earth -> 1
              Total occurrence of e -> 5
*/


package kajol;

public class FrequencyOfCharFromStringArray {
	int totalFrequency;
	void FrequencyOfChar(String[] inputArray,char inputCharacter) {
		for(int arrayIndex=0;arrayIndex<inputArray.length;arrayIndex++) {
			int charFrequency=0;
			String inputString=inputArray[arrayIndex];
			for(int stringIndex=0;stringIndex<inputString.length();stringIndex++) {
				if(inputString.charAt(stringIndex)==inputCharacter) {
				charFrequency++;
				totalFrequency++;
				}	
		    }
		System.out.println("String "+inputString+" has ocurence of character '"+inputCharacter+"' : "+charFrequency+" times.");	
		}
		System.out.println("Total occurence of character '"+inputCharacter+"' in given Array : "+totalFrequency+ " times.");
	}
		
	public static void main(String[] args) {
		String [] inputArray= {"technocredits","elephant","earthear"};
		new FrequencyOfCharFromStringArray().FrequencyOfChar(inputArray, 'e');
		
	}

}
