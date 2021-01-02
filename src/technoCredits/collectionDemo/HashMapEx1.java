package technoCredits.collectionDemo;

import java.util.HashMap;
import java.util.Set;

public class HashMapEx1 {
	
	int m1() {
		return 10;
	}
	
	
	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		String temp1 = hm.put(1, "Techno");
		System.out.println(temp1);
		System.out.println(temp1); // null
		hm.put(1, "OCT2020");
		hm.put(2, "Credits");
		hm.put(3, "Harsh");
		String temp = hm.put(1, "Pihu");
		System.out.println(temp);
		
		HashMap<String,Integer> hm1 = new HashMap<String, Integer>();
		hm1.put("Techno", 1);
		hm1.put("Credits", 2);
		hm1.put("Bharat", 3);
		
		Set<String> setOfKeys= hm1.keySet();
		for(String key : setOfKeys) {
			System.out.println(key + ":" + hm1.get(key));
		}
			
		
		
	}
}
