/*Assignment 17 : 13th Nov'2020 

Same as Assignment 16 but each frequency should be printed single time.
input : aakanksha
output : a -> 4
         k -> 2
         n -> 1
         s -> 1
         h -> 1*/
package shrutiS;

public class SingleTimeCharacterFrequency {

	void singleCharFrequency(String word) {
		for (int index = 0; index < word.length(); index++) {
			char ch = word.charAt(index);
			int count = 0;
			if (index == word.indexOf(ch)) {
				for (int innerIndex = 0; innerIndex < word.length(); innerIndex++) {
					if (word.charAt(innerIndex) == ch)
						count++;
				}
				System.out.println(ch + " in " + word + " occurs " + count + " times");
			}
		}
	}

	public static void main(String[] args) {
		SingleTimeCharacterFrequency charFrequency = new SingleTimeCharacterFrequency();
		charFrequency.singleCharFrequency("aakanksha");
	}
}
