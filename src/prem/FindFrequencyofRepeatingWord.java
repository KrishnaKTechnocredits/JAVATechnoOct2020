package prem;

public class FindFrequencyofRepeatingWord {
	
//Assignment-18 : 14th Nov'2020 

/* Program : 1
max repeating word with its freq.
input : Hi Hello Hi Techno Hello Hi
output : Hi -> 3

Program : 2 
String input = "hmPZ23i9Ws"
output = "239PZWhmis";

*/	
	
	void wordFrequencyCount(String string) {
		System.out.println("Given string: "+string);
		int max=0, maxWordIndex=0;
		String[] strArray = string.split(" ");
		for (int index = 0; index < strArray.length; index++) {
			String word = strArray[index];
			int counter = 0;
			if (string.contains(word)) {
				for (int innerIndex = 0; innerIndex < strArray.length; innerIndex++) {
					if (word.equals(strArray[innerIndex])) {
						counter += 1;
					}
				}
				if(counter>max) {
					max=counter;
					maxWordIndex=index;
				}
				string = string.replace(word, "");
			}
		}
		System.out.println("Word with maximum frequency: "+strArray[maxWordIndex] +" ---> "+max);
	}

	public static void main(String[] args) {
		new FindFrequencyofRepeatingWord().wordFrequencyCount("Hi Hello Hi Techno Hello Hi");
		}
}