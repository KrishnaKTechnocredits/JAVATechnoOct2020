/*Assignment - 46 : 27th Dec'2020 
Print the words having maximum frequency. 
String input = "Hi globant Hello Hi Hi globant Hi
  				Hello Hi Hi Hello globant Hi Techno Credits Techno";
output :  Hi -> 7
*/ 
package mrunal;
import java.util.HashMap;
import java.util.Map.Entry;

public class frequencyOfMaxWords {

	void getFrequencyOfMaxWords(String st) {
		String[] words=st.split(" ");
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		for(int index=0;index<words.length;index++) {
			String eachWord=words[index];
			if(map.containsKey(eachWord)) {
				Integer keyValue=map.get(eachWord)+1;
				map.put(eachWord, keyValue);
			}
			else
				map.put(eachWord, 1);
		}
		displayMaxWord(map);
	}

	void displayMaxWord(HashMap<String,Integer> map) {
		int number=0;
		String st=null;
		for(Entry<String, Integer> temp:map.entrySet()) {
			if(temp.getValue()>number) {
				number=temp.getValue();
				 st=temp.getKey();
			}
		}
		System.out.print(st+":"+map.get(st));
	}
	public static void main(String[] args) {
		frequencyOfMaxWords findMaxFreq=new frequencyOfMaxWords();
		String st = "Hi globant Hello Hi Hi globant Hi Hello Hi Hi Hello globant Hi Techno Credits Techno";
		System.out.println(st);
		System.out.println("Word with highest frequency in above string:");
		findMaxFreq.getFrequencyOfMaxWords(st);
	}
}