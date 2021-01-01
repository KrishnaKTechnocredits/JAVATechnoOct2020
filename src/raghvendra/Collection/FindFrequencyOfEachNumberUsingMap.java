package raghvendra.Collection;
import java.util.Arrays;
import java.util.HashMap;
/*Program 2:
Find frequency of each number from the Array
Integer arr[] = {23,12,45,67,23,12,67,33};*/
public class FindFrequencyOfEachNumberUsingMap {
	void displayFrequencyOfEachNumberUsingMap(Integer[] arr) {
		HashMap<Integer,Integer>map=new HashMap<>();
		for(int index=0;index<arr.length;index++) {
			Integer number=arr[index];
			if(map.containsKey(number)) {
				Integer count=map.get(number)+1;
				map.put(number, count);
			}
			else
				map.put(number, 1);
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Frequency of each Number are"+"\n"+map);
	}
	public static void main(String[] args) {
		FindFrequencyOfEachNumberUsingMap findFrequencyOfEachNumberUsingMap=new FindFrequencyOfEachNumberUsingMap();
		Integer arr[] = {23,12,45,67,23,12,67,33};
		findFrequencyOfEachNumberUsingMap.displayFrequencyOfEachNumberUsingMap(arr);
	}
}
