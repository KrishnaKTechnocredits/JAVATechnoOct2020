package nandini.Assignment_44;

import java.util.HashMap;

public class FreqOfNumber {

	public static void main(String args[]) {
		HashMap<Integer,Integer> map = new HashMap<>();
		Integer arr[] = {23,12,45,67,23,12,67,33};
		for(int index = 0; index < arr.length;index++) {
			int num = arr[index];
			if(map.containsKey(num)) {
				int cnt = map.get(num)+1;
				map.put(num, cnt);
			}
			else {
				map.put(num, 1);
			}
		}
		System.out.println(map);
	}
}
