package nitin.Collections.Assignment_46;
import java.util.LinkedHashMap;
import java.util.Set;
/* Assignment - 46 : 27th Dec'2020 - Print the words having maximum frequency. 
String input = "Hi globant Hello Hi Hi globant Hi Hello Hi Hi Hello globant Hi Techno Credits Techno";
output :  Hi ->7 */
public class FrequencyOfMaxWord {
	public void getFrequencyOfMaxWord(String str) {
		String[] word = str.split(" ");
		LinkedHashMap<String,Integer> map=new LinkedHashMap<>();
		for(String key : word) {
			if(map.containsKey(key))
				map.put(key, map.get(key)+1);
			else
				map.put(key, 1);
		}
		Set<String> set = map.keySet();
		int max =0;
		String maxkey=null;
		for(String key : set) {
			if(map.get(key)>max) {
				max=map.get(key);
				maxkey=key;
			}
		}
		System.out.println(maxkey +" -> "+max);
	}
	public static void main(String[] args) {
		new FrequencyOfMaxWord().getFrequencyOfMaxWord("Hi globant Hello Hi Hi globant Hi Hello Hi Hi Hello globant Hi Techno Credits Techno");
	}
}
