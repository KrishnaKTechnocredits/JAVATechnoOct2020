package prasad.collections;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class FreqOfElement {

	static LinkedHashMap<String, Integer> wordCount(String[] arry) {
		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

		for (int index = 0; index < arry.length; index++) {
			String word = arry[index];
			if (map.containsKey(word)) {
				int count = map.get(word);
				map.put(word, count + 1);

			} else {
				map.put(word, 1);
			}
		}
		return map;
	}

	static TreeMap<Integer, Integer> noCount(int[] arry) {
		TreeMap<Integer, Integer> map = new TreeMap<>();

		for (int index = 0; index < arry.length; index++) {
			int num = arry[index];
			if (map.containsKey(num)) {
				int count = map.get(num);
				map.put(num, count + 1);

			} else {
				map.put(num, 1);
			}
		}
		return map;
	}

	static LinkedHashMap<Character, Integer> charCount(String word) {
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

		for (int index = 0; index < word.length(); index++) {
			char ch = word.charAt(index);
			if (map.containsKey(ch)) {
				int count = map.get(ch);
				map.put(ch, count + 1);

			} else {
				map.put(ch, 1);
			}
		}
		return map;
	}

	public static void main(String[] arg) {
		System.out.println("Printing frequency of word,number and character in given input using collections.");
		System.out.println("=================================================================================");
		String str = "Hello Hi Mumbai Hello Hi Good Morning Thane Good Evening Mumbai Thane";
		String[] arry = str.split(" ");
		System.out.println("Input Array:- " + Arrays.toString(arry));
		LinkedHashMap<String, Integer> output = FreqOfElement.wordCount(arry);
		System.out.println("Frequency of words in array:- " + output);
		System.out.println(" ");
		int[] numbers = { 1, 23, 45, 2, 2, 2, 2, 2, 90, 46, 45, 21, 75, 22, 75, 21, 100, 70, 21, 1, 22, 24, 23, 50, 75,
				74, 75 };
		System.out.println("Input Array:- " + Arrays.toString(numbers));
		TreeMap<Integer, Integer> numberOutput = FreqOfElement.noCount(numbers);
		System.out.println("Frequency of numbers in array:- " + numberOutput);
		System.out.println(" ");
		String word = "Prasad";
		System.out.println("Input word:- " + word);
		LinkedHashMap<Character, Integer> charOutput = FreqOfElement.charCount(word);
		System.out.println("Frequency of characters in word:- " + charOutput);
	}
}
