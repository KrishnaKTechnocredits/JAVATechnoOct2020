package technoCredits.collectionDemo;

import java.util.Hashtable;
import java.util.LinkedHashMap;

public class ExampleOfNullKey {
	
	public static void main(String[] args) {
		LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();
		lhm.put("Hi", "Hufasdfa");
		lhm.put(null, null);
		System.out.println(lhm);
	}
}
