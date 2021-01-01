package raghvendra.Collection;
/*Assignment - 45 : 27th Dec'2020 
Print all the words having frequency less than or equal to 2. 
String input = "Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno";
output :  Techno -> 2
                  Credits -> 1 */
import java.util.HashMap;
import java.util.Map.Entry;
public class PrintFreqLessThanTwo {
	void calculateFrequency(String st) {
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		String[] words=st.split(" ");
		for(int index=0;index<words.length;index++) {
			String eachWord=words[index];
			if(map.containsKey(eachWord)) {
				Integer keyValue = map.get(eachWord)+1;
				map.put(eachWord, keyValue);
			}
			else
				map.put(eachWord, 1);
		}
		printFreq(map);
	}
	
	void printFreq(HashMap<String,Integer> map) {
		System.out.println("All the words with Frequency less than or equal to two are");
		for(Entry<String, Integer> temp:map.entrySet()) {
			if(temp.getValue()<=2)
				System.out.println(temp.getKey()+"-->"+temp.getValue());
		}
	}
	
	public static void main(String[] args) {
		PrintFreqLessThanTwo printFreqLessThanTwo=new PrintFreqLessThanTwo();
		String st="Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno";
		System.out.println(st);
		printFreqLessThanTwo.calculateFrequency(st);
	}
}
