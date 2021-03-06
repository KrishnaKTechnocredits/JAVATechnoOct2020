//Program 2: Find frequency of each number from the Array
//Integer arr[] = {23,12,45,67,23,12,67,33};

package priya;

import java.util.HashMap;

public class FrequencyOfEachNumberFromArray {

	public class IntegerFrequencyFromArrayWithHasmap {
		HashMap<Integer, Integer> displayFrequency(int array[]) {
			HashMap<Integer, Integer> charfreq = new HashMap<Integer, Integer>();
			for (int index = 0; index < array.length; index++) {
				int number = array[index];
				if (charfreq.containsKey(number)) {
					int count = charfreq.get(number);
					charfreq.put(number, count + 1);
				} else {
					charfreq.put(number, 1);
				}
			}
			return charfreq;
		}
		public void main(String[] args) {
			int arr[] = { 23, 12, 45, 67, 23, 12, 67, 33 };
			IntegerFrequencyFromArrayWithHasmap integerfrequency = new IntegerFrequencyFromArrayWithHasmap();
			HashMap<Integer, Integer> charFrequency = integerfrequency.displayFrequency(arr);
			System.out.println("Integer freqyency is: " + charFrequency);

		}
	}
}
