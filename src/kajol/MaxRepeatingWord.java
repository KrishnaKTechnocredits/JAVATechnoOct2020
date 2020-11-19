/*Assignment-18 : 14th Nov'2020 

Program : 1
max repeating word with its freq.
input : Hi Hello Hi Techno Hello Hi
output : Hi -> 3*/

package kajol;

public class MaxRepeatingWord {
	
	void WordFrequency(String inputString) {
		int max=0;
		String maxOccuringWord=null;
		String[] inputSplitedArray=inputString.split(" ");
		for(int index=0;index<inputSplitedArray.length;index++) {
			String matchWord=inputSplitedArray[index];
			int freqCount=0;
			if(inputString.contains(matchWord)){
				for(int occurenceIndex=0;occurenceIndex<inputSplitedArray.length;occurenceIndex++) {
					if(matchWord.equals(inputSplitedArray[occurenceIndex]))
						freqCount++;	
				     }				
			     } 
			     if(freqCount>max) {
			    	 max=freqCount;
			    	 maxOccuringWord=inputSplitedArray[index];
			     }   
			     inputString=inputString.replace(maxOccuringWord, " ");	     
			}
         System.out.println("Maximum occuring word is '"+maxOccuringWord+"' with occurence of "+max+" times.");
		}
	
	public static void main(String[] args) {
		String inputString="Hi Hello Hi Techno Hello Hi";
		new MaxRepeatingWord().WordFrequency(inputString);
	}
	
		
	}
	
	
	


