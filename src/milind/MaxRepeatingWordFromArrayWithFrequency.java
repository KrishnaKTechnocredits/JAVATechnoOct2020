/*
 * Program : 1
max repeating word with its freq.
input : Hi Hello Hi Techno Hello Hi
output : Hi -> 3
 * */

package milind;

public class MaxRepeatingWordFromArrayWithFrequency {
	
	void getMaxRepeatingWord(String input) {
		String[] stringSplit = input.split(" ");
		int maxFrequencyFromString = 0;
		int maxWordIndex = 0;
		for(int index = 0; index < stringSplit.length; index++) {
			int count = 0;
			for(int innerIndex = 0; innerIndex < stringSplit.length; innerIndex++) {
				if(stringSplit[index].equalsIgnoreCase(stringSplit[innerIndex])) {
					if(index > innerIndex) {
						break;
					} else
						count ++;
				}
			}
			if(maxFrequencyFromString < count) {
				maxFrequencyFromString = count;
				maxWordIndex = index;
			}
		}
		System.out.println(stringSplit[maxWordIndex] + " : " + maxFrequencyFromString);
	}
	
	public static void main(String[] args) {
		String input = "Hi Hello Hi Techno Hello Hi hello techno techno techno techno";
		MaxRepeatingWordFromArrayWithFrequency maxRepeatingWordFromArrayWithFrequency = new MaxRepeatingWordFromArrayWithFrequency();
		maxRepeatingWordFromArrayWithFrequency.getMaxRepeatingWord(input);
	}

}
