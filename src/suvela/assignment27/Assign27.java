/*Program 1: print all the words which does't have any digit. 
String[] input = {"Masgj3Pw", "r4fsjk","techno","sfjk44lk"};
output : techno*/
package suvela.assignment27;

import java.util.Arrays;

public class Assign27 {
	void findWord(String[] arr) {
		System.out.println("Input :" + Arrays.toString(arr));
		System.out.print("Output :");
		for (int i = 0; i < arr.length; i++) {
			String word = arr[i];
			for (int j = 0; j < word.length(); j++) {
				char ch = word.charAt(j);
				if (Character.isDigit(ch))
					word="";
			}
			if(!arr[i].isEmpty())
				System.out.print(word);	
			else
				System.out.println("Array is empty");
		}
	}

	public static void main(String[] args) {
		String[] array = { "Masgj3Pw", "r4fsjk", "techno", "sfjk44lk" };
		Assign27 assign = new Assign27();
		assign.findWord(array);
	}

}
