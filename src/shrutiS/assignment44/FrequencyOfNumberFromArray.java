/*Assignment : 44 
Program 2:
Find frequency of each number from the Array
Integer arr[] = {23,12,45,67,23,12,67,33};*/

package shrutiS.assignment44;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class FrequencyOfNumberFromArray {
	
	public void findFrequencyOfNumber(int[] numberArray) {
		System.out.println("Given Number Array: "+Arrays.toString(numberArray));
		Map<Integer,Integer> map = new TreeMap<>();
		for(Integer key : numberArray) {
			if(map.containsKey(key))
				map.put(key, map.get(key)+1);
			else
				map.put(key, 1);
		}
		System.out.println("Frequency of number:\n"+map);
	}
	
	public static void main(String[] args) {
		int arr[] = {23,12,45,67,23,12,67,33};
		new FrequencyOfNumberFromArray().findFrequencyOfNumber(arr);
	}
}
