/*Program 2:
Find frequency of each number from the Array
Integer arr[] = {23,12,45,67,23,12,67,33};
*/

package MapPrograms;

import java.util.Arrays;
import java.util.HashMap;

public class FrequencyofEachNumberFromArrayUsingMap {
	
	HashMap<Integer,Integer> findFrequency(int [] inputArray){	
		HashMap<Integer,Integer> map= new HashMap<>();
		for(int index=0;index<inputArray.length;index++) {
			if(map.containsKey(inputArray[index]))
				map.put(inputArray[index], map.get(inputArray[index])+1);
			else
				map.put(inputArray[index], 1);
		}
		return map;	
	}

	public static void main(String[] args) {
		int[] array= {23,12,45,67,23,12,67,33};
		System.out.println("Given Array is: "+Arrays.toString(array));
		System.out.println("Frequency of Numbers in above Array: "+new FrequencyofEachNumberFromArrayUsingMap().findFrequency(array));
		
	}
}
