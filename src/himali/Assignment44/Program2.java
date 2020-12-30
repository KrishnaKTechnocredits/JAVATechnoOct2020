/*Program 2:
Find frequency of each number from the Array
Integer arr[] = {23,12,45,67,23,12,67,33};*/

package himali.Assignment44;

import java.util.HashMap;

public class Program2 {
			// TODO Auto-generated method stub
	public void numberFrequency(Integer[] array) {
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		
		for(int index = 0; index < array.length; index++) {
			int singleNum = array[index];
			if(hashMap.containsKey(singleNum)) {
				Integer count = hashMap.get(singleNum) + 1;
				hashMap.put(singleNum, count);
				
			}else {
				hashMap.put(singleNum, 1);
			}
			
		}
		System.out.println(hashMap);
	}
	
	public static void main(String[] args) {
		Integer[] array = {23,12,45,67,23,12,67,33};
		Program2 program2 = new Program2();
		program2.numberFrequency(array);
	}

}
