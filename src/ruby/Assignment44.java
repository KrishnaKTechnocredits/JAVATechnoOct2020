package ruby;

import java.util.HashMap;

/*Assignment : 44 [24th Dec'2020]*/

public class Assignment44 {

	static void findCharFreq(String str) {
		HashMap<Character, Integer> map = new HashMap<>();
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (map.containsKey(ch)) {
				Integer cnt = map.get(ch) + 1;
				map.put(ch, cnt);

			} else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);
	}

/*	Program 1:
		Find frequency of each word from the String
		String str1 = "hello gm hi gm hello pune gn";*/
	
	static void findWordFreq(String str) {
		String[] word = str.split(" ");
		HashMap<String, Integer> map = new HashMap<>();
		for (int index = 0; index < word.length; index++) {
			if (map.containsKey(word[index])) {
				Integer cnt = map.get(word[index]) + 1;
				map.put(word[index], cnt);
			} else {
				map.put(word[index], 1);
			}
		}
		System.out.println(map);
	}

/*	Program 2:
		Find frequency of each number from the Array
		Integer arr[] = {23,12,45,67,23,12,67,33};*/
	
	static void findNumberFreq(Integer[] num) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int index=0; index < num.length; index++) {
			if(map.containsKey(num[index])) {
				Integer cnt = map.get(num[index])+1;
				map.put(num[index], cnt);
			}else {
				map.put(num[index], 1);
			}
		}System.out.println(map);
	}
	

	public static void main(String[] args) {
		String str = "technocreditsss";
		Assignment44.findCharFreq(str);
		String str1 = "hello hi new world hello hi hi world";
		Assignment44.findWordFreq(str1);
		Integer arr[] = {23,12,45,67,23,12,67,33};
		Assignment44.findNumberFreq(arr);
	}
}
