/*Print all the words having frequency less than or equal to 2. 
String input = "Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno";
output :  Techno -> 2
          Credits -> 1 */

package vishakha.Asgnmt45;

import java.util.HashMap;
import java.util.Set;

public class FrequencyOfWords_Collection {
	
	void calFrequencyOfWords(String str){
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		String arr[] = str.split(" ");
		for(String word : arr){
			if(hm.containsKey(word)){
				hm.put(word, hm.get(word)+1);
			}else{
				hm.put(word, 1);
			}
		}
		Set<String> word = hm.keySet();
		System.out.println(word);
		for(String key : word){
			if(hm.get(key) <= 2){
				System.out.println(key);
			}
		}
	}

	public static void main(String[] args) {
		String str = "Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno";
		String str1 = "Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno Techno";
		FrequencyOfWords_Collection frequencyOfWords_Collection = new FrequencyOfWords_Collection();
		frequencyOfWords_Collection.calFrequencyOfWords(str);
		System.out.println("*************************************************************");
		frequencyOfWords_Collection.calFrequencyOfWords(str1);
	}
}
