package anjaliS;

import java.util.HashMap;

public class CharacterFrequencyWithHashmap {
	HashMap<String, Integer> findFrequency(String array) {
		String[] word = array.split(" ");
		HashMap<String, Integer> charfreq = new HashMap<String, Integer>();
		for (int index = 0; index < word.length; index++) {
			String name = word[index];

			if (charfreq.containsKey(name)) {
				int count = charfreq.get(name);
				charfreq.put(name, count + 1);
			} else {
				charfreq.put(name, 1);
			}
		}
		return charfreq;

	}

	public static void main(String[] args) {

		String input = "hello gm hi gm hello pune gn";
		CharacterFrequencyWithHashmap charfreq = new CharacterFrequencyWithHashmap();
		HashMap<String, Integer> charfrequency = charfreq.findFrequency(input);
		System.out.println("Char frequency is: " + charfrequency);

	}

}
