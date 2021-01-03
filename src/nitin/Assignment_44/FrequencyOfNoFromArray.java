package nitin.Assignment_44;
import java.util.Arrays;
import java.util.TreeMap;
/* Assignment : 44 [24th Dec'2020] - Program 2: Find frequency of each number from the Array
Integer arr[] = {23,12,45,67,23,12,67,33};*/
public class FrequencyOfNoFromArray {
	public void getFrequencyOfEachNumberInArray(int[] arr) {
		System.out.println("Input Array -> "+Arrays.toString(arr));
		TreeMap<Integer,Integer> map = new TreeMap<>();
		for(Integer key : arr) {
			if(map.containsKey(key))
				map.put(key, map.get(key)+1);
			else
				map.put(key,1);
		}
		System.out.println("Frequency of Number : \n"+map);
	}
	public static void main(String[] args) {
		int[] input = {23,12,45,67,23,12,67,33};
		new FrequencyOfNoFromArray().getFrequencyOfEachNumberInArray(input);
	}
}
