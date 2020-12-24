package nandini.Assignment_44;

import java.util.HashMap;

public class FreqOfWord {
	
	public static void main(String args[]) {
		HashMap<String,Integer> map = new HashMap<>();
		String str = "hello gm hi gm hello pune gn";
		String [] strArray = str.split(" ");
		for(int index = 0; index < strArray.length;index++) {
			String word = strArray[index];
			if(map.containsKey(word)) {
				int cnt = map.get(word)+1;
				map.put(word, cnt);
			}
			else {
				map.put(word, 1);
			}
		}
		System.out.println(map);	
	}

}
