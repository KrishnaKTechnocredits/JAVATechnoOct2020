package yogita;
/*
Program 1:
Find frequency of each word from the String
String str1 = "hello gm hi gm hello pune gn";

*/
import java.util.Arrays;
import java.util.HashMap;

public class FindFrequencyOfWord {
	static HashMap<String, Integer> findFrequency(String array) {
		System.out.println("String Is:" + array);
		String[] string = array.split(" ");
		HashMap<String, Integer> frequencyOfChar = new HashMap<String, Integer>();
		for (int i = 0; i < string.length; i++) {
			String str = string[i];
			if (frequencyOfChar.containsKey(str)) {
				int count = frequencyOfChar.get(str);
				frequencyOfChar.put(str, count+1);

			} else {
				frequencyOfChar.put(str, 1);
			}
		}
		return frequencyOfChar;
	}

	public static void main(String[] args) {

		String input = "hello gm hi gm hello pune gn";
		HashMap<String, Integer> frequencyCount = FindFrequencyOfWord.findFrequency(input);
		System.out.println("Frequency Count Is:\n" + frequencyCount);
	}
}
