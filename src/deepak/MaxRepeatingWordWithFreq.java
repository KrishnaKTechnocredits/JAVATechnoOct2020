/* max repeating word with its freq.
input : Hi Hello Hi Techno Hello Hi
output : Hi -> 3 */

package deepak;

public class MaxRepeatingWordWithFreq {
	
	static void freq(String str) {
		String [] input=str.split(" ");
		int max = 0;
		String maxName = null; 
		for (int index = 0; index < input.length;index++) {
			int count = 0;
			String word = input[index];	
			if (str.contains(word)) {
				for ( int innerIndex = 0 ; innerIndex < input.length ; innerIndex++) {
					if (word.equals(input[innerIndex]))
						count++;
				}	
				str = str.replace(word," ");
				if(count > max) {
					max = count;
					maxName = word;
				}
			}
		}	
		System.out.println("Frequency of "+maxName+" is "+ max);
	}

	public static void main(String[] args) {
		
		String input = "Hi Hello Hi Techno Hello Hi";
		MaxRepeatingWordWithFreq.freq(input);	
	}
}
