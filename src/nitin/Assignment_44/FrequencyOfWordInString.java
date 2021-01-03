package nitin.Assignment_44;
import java.util.HashMap;
/* Assignment : 44 [24th Dec'2020] - Program 1: Find frequency of each word from the String
String str1 = "hello gm hi gm hello pune gn";*/
public class FrequencyOfWordInString {
	public void getFrequencyofEachWordInString(String str) {
		System.out.println("Input String -> "+str);
		String[] word=str.split(" ");
		HashMap<String,Integer> map = new HashMap<>();
			for(String key : word) {
				if(map.containsKey(key)) 
					map.put(key, map.get(key)+1);
				else
					map.put(key, 1);
			}
			System.out.println("Frequency of words : \n"+map);
	}
	public static void main(String[] args) {
		FrequencyOfWordInString frequencyOfWordInString = new FrequencyOfWordInString();
		frequencyOfWordInString.getFrequencyofEachWordInString("hello gm hi gm hello pune gn");
	}
}
