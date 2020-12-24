package ritika.Assignments;

import java.util.LinkedHashMap;

/*Assignment : 44 [24th Dec'2020]

Program 1:
Find frequency of each word from the String
String str1 = "hello gm hi gm hello pune gn";

Program 2:
Find frequency of each number from the Array
Integer arr[] = {23,12,45,67,23,12,67,33};
*/
public class Asgmt_44 {

	public static LinkedHashMap<String, Integer> findFreqOfEachValue(String input) {
		String[] inputArr = input.split(" ");
		LinkedHashMap<String, Integer> mapStr = new LinkedHashMap<String, Integer>();
		for (int index=0; index<inputArr.length; index++) {
			String str = inputArr[index];
			if(mapStr.containsKey(str)) {
				Integer cnt = mapStr.get(str)+1;
				mapStr.put(str, cnt);
			}
			else {
				mapStr.put(str,1);
			}
		}
		return mapStr;
	}
	
	public static LinkedHashMap<Integer, Integer> findFreqOfEachValue(Integer[] inputArr) {
		LinkedHashMap<Integer, Integer> mapInt = new LinkedHashMap<Integer, Integer>();
		for (int index=0; index<inputArr.length; index++) {
			Integer value = inputArr[index];
			if(mapInt.containsKey(value)) {
				Integer cnt = mapInt.get(value)+1;
				mapInt.put(value, cnt);
			}
			else {
				mapInt.put(value,1);
			}
		}
		return mapInt;
	}
		
	public static void main(String[] args) {
		String input = "hello gm hi gm hello pune gn";
		Integer inputArr[] = {23,12,45,67,23,12,67,33};
		System.out.println("Frequency of each word from given String is: ");
		System.out.println(findFreqOfEachValue(input));
		System.out.println("Frequency of each integer from given Integer Array is: ");
		System.out.println(findFreqOfEachValue(inputArr));
	}
}
