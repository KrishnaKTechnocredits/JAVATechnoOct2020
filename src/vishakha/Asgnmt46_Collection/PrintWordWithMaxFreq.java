/*Print the words having maximum frequency. 
String input = "Hi globant Hello Hi Hi globant Hi Hello Hi Hi Hello globant Hi Techno Credits Techno";
output :  Hi ->7 */

package vishakha.Asgnmt46_Collection;

import java.util.HashMap;
import java.util.Set;

public class PrintWordWithMaxFreq {
	
	static void findMaxFreqOfWord(String str){
		int maxKey=0;
		String maxWord = null;
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		String[] arrWord = str.split(" ");
		for(String word : arrWord){
			if(hm.containsKey(word)){
				hm.put(word, hm.get(word)+1);
			}else{
				hm.put(word, 1);
			}
		}
		Set<String> strSet = hm.keySet();
		System.out.println("Key set is : " +strSet);
		for(String key : strSet){
			if(hm.get(key) > maxKey){
				maxKey = hm.get(key);
				maxWord = key;
			}
		}
		System.out.println("----------------------------------------------------");
		System.out.println("Max Frequency word is "+maxWord+ " with frequency "+maxKey);
	}

	public static void main(String[] args) {
		String str = "Hi globant Hello Hi Hi globant Hi Hello Hi Hi Hello globant Hi Techno Credits Techno";
		findMaxFreqOfWord(str);
	}
}
