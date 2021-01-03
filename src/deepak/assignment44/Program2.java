/*
Program 1:
Find frequency of each word from the String
String str1 = "hello gm hi gm hello pune gn";*/
package deepak.assignment44;

import java.util.HashMap;

public class Program2 {
	public void printFreq() {
		HashMap<String, Integer> map = new HashMap<>();
		String str = "hello gm hi gm hello pune gn";
		String[] array = str.split(" ");
		for (int i = 0; i < array.length; i++) {
			String word = array[i];
			if (map.containsKey(word)) {
				Integer cnt = map.get(word) + 1;
				map.put(word, cnt);
			} else {
				map.put(word, 1);
			}
		}System.out.println(map);

	}

	public static void main(String[] args) {
		new Program2().printFreq();
	}

}