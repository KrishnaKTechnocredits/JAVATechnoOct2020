package prem.assignment27;

import java.util.Arrays;

/*Assignment - 27: 23rd Nov'2020  

Program 1: print all the words which does't have any digit. 
String[] input = {"Masgj3Pw", "r4fsjk","techno","sfjk44lk"};
output : techno*/

public class WordWithNoDigit {

	void printWordWithNoDigit(String[] str) {
		for (int index = 0; index < str.length; index++) {
			String word = str[index];
			boolean flag = false;
			for (int innerIndex = 0; innerIndex < word.length(); innerIndex++) {
				char ch = word.charAt(innerIndex);
				if (Character.isDigit(ch)) {
					flag = true;
					break;
				}
			}
			if (!flag)
				System.out.println(" The words that does't have any digit :  " + word);
		}
	}

	public static void main(String[] arg) {
		WordWithNoDigit wordWithNoDigit = new WordWithNoDigit();
		String[] arr = { "Masgj3Pw", "r4fsjk", "techno", "sfjk44lk" };
		System.out.println(" The Array is :  " + Arrays.toString(arr));
		wordWithNoDigit.printWordWithNoDigit(arr);
	}
}
