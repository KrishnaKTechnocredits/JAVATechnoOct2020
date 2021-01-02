package technoCredits.collectionDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EntrySetExample {
	
	public static void main(String[] args) {
		HashMap<String,Integer> hm1 = new HashMap<String, Integer>();
		hm1.put("Techno", 1);
		hm1.put("Credits", 2);
		hm1.put("Bharat", 3);
		
		Set<String> setOfKeys = hm1.keySet();
		
		Set<Map.Entry<String,Integer>> map = hm1.entrySet();
		for(Map.Entry<String,Integer> temp : map) {
			System.out.println(temp.getKey() + ":" + temp.getValue());
		}
			
	}
}
