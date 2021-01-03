package suvela.assignment44.prog2;

/*Program 2:
Find frequency of each number from the Array
Integer arr[] = {23,12,45,67,23,12,67,33};*/
import java.util.HashMap;

public class FreqOfNums {
	public void printFreq() {
		HashMap<Integer, Integer> map = new HashMap<>();
		Integer arr[] = {23,12,45,67,23,12,67,33};
		for (int i = 0; i < arr.length; i++) {
			int temp = arr[i];
			if (map.containsKey(temp)) {
				Integer cnt = map.get(temp) + 1;
				map.put(temp, cnt);
			} else {
				map.put(temp, 1);
			}
		}System.out.println(map);
		
	}
	public static void main(String[] args) {
		new FreqOfNums().printFreq();

	}

}
