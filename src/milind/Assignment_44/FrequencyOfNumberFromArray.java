package milind.Assignment_44;

import java.util.HashMap;

public class FrequencyOfNumberFromArray {
	
	public void numberFrequency(Integer[] array) {
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		for(int index = 0; index < array.length; index++) {
			int singleIntFromArray = array[index];
			if(hashMap.containsKey(singleIntFromArray)) {
				Integer count = hashMap.get(singleIntFromArray) + 1;
				hashMap.put(singleIntFromArray, count);
			}else {
				hashMap.put(singleIntFromArray, 1);
			}
		}
		System.out.println(hashMap);
	}
	
	public static void main(String[] args) {
		Integer[] array = {23,12,45,67,23,12,67,33};
		FrequencyOfNumberFromArray frequencyOfNumberFromArray = new FrequencyOfNumberFromArray();
		frequencyOfNumberFromArray.numberFrequency(array);
	}
}
