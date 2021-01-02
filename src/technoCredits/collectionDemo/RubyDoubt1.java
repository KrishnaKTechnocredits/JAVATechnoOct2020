package technoCredits.collectionDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class RubyDoubt1 {

	static void findMaxFreqWord(String input) {
		int count = 0;
		String[] word = input.split(" ");
		HashMap<String, Integer> hMap = new HashMap<>();
		for (int index = 0; index < word.length; index++) {
			if (hMap.containsKey(word[index])) {
				hMap.put(word[index], hMap.get(word[index]) + 1);
			} else {
				hMap.put(word[index], 1);
			}
		}
		Set<String> setOfWord = hMap.keySet();
		
		Iterator<String> itr = setOfWord.iterator();
		
		/*while(itr.hasNext()) {
			if(itr.next() != null) {
				System.out.println(itr.next());
			}
		}*/
		
		while(itr.hasNext()) {
			String name = itr.next();
			if (count <= hMap.get(name)) {
				count = hMap.get(name);
			}
		}
		
		/*for (String name : setOfWord) {
			if (count <= hMap.get(name)) {
				count = hMap.get(name);
			}
		}*/
		
		for(String name : setOfWord) {
			if(hMap.get(name) == count)
				System.out.println(name + ":" + count);
		}
	}

	public static void main(String[] args) {
		String input = "Hi globant globant Hello Hi Hi Hi globant Hi Hello Hi Hi Hello globant Hi Techno Credits globant globant globant globant Techno";
		RubyDoubt1.findMaxFreqWord(input);
	}
}
