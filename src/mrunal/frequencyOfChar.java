package mrunal;
/*
Program 1:
Find frequency of each word from the String
String str1 = "hello gm hi gm hello pune gn";
*/
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class frequencyOfChar {

	void getFrequencyOfCharacter(String str) {
		String[] input = str.split(" ");
		int count = 1;
		HashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		for (int index = 0; index < input.length; index++) {
			if (map.containsKey(input[index])) {
				map.put(input[index], count + 1);
			} else {
				map.put(input[index], count);
			}
		}
		Set<Entry<String, Integer>> output = map.entrySet();
		for (Entry<String, Integer> value : output) {
			System.out.println("Frequency of " + value.getKey() + " :" + value.getValue());
		}
	}

	public static void main(String[] args) {
		frequencyOfChar object = new frequencyOfChar();
		String str1 = "hello gm hi gm hello pune gn";
		object.getFrequencyOfCharacter(str1);
	}
}
