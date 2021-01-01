package milind.Assignment_44;

import java.util.HashMap;

public class FrequencyOfWordFromString {
	
	void wordFrequency(String input) {
		String[] inputSeperate = input.split(" ");
		HashMap<String, Integer> map = new HashMap<>();
		for(int index = 0; index < inputSeperate.length; index++) {
			String input1 = inputSeperate[index];
			if(map.containsKey(input1)) {
				Integer count = map.get(input1) + 1;
				map.put(input1, count);
			}else {
				map.put(input1, 1);
			}
		}
		System.out.println(map);
	}
	
	public static void main(String[] args) {
		String input = "hello gm hi gm hello pune gn gn gn hello gm";
		FrequencyOfWordFromString frequencyOfWordFromString = new FrequencyOfWordFromString();
		frequencyOfWordFromString.wordFrequency(input);
	}

}
