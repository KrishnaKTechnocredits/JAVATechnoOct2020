/*
 Practice Program
*/
package yogita;

import java.util.HashMap;

public class FindFrequencyOfChar {
	static HashMap<Character, Integer> findFrequency(String str) {
		System.out.println("String Is:" + str);
		HashMap<Character, Integer> frequencyOfChar = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (frequencyOfChar.containsKey(ch)) {
				int count = frequencyOfChar.get(ch);
				frequencyOfChar.put(ch, count + 1);
			} else {
				frequencyOfChar.put(ch, 1);
			}
		}
		return frequencyOfChar;
	}

	public static void main(String[] args) {

		String input = "technocredits";
		HashMap<Character, Integer> frequencyCount = FindFrequencyOfChar.findFrequency(input);
		System.out.println("Frequency Count Is:\n" + frequencyCount);
	}
}
