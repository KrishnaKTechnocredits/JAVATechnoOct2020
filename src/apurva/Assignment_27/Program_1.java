package apurva.Assignment_27;

import java.util.Arrays;

/*print all the words which does't have any digit. 
String[] input = {"Masgj3Pw", "r4fsjk","techno","sfjk44lk"};
output : techno*/
public class Program_1 {
	void stringArray(String[] string) {
		System.out.println("Given String: " + Arrays.toString(string));
		String input = " ";
		for (int index = 0; index < string.length; index++) {
			input = string[index];
			printWordsWithoutDigit(input);
		}
	}

	void printWordsWithoutDigit(String input) {
		String temp = " ";
		boolean flag = false;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			temp = temp + ch;
			if (Character.isDigit(ch)) {
				temp = " ";
				flag = true;
			}
		}
		if (flag) {
			temp = " ";
		}
		if (temp != " ") {
			System.out.println("Words without Digit:" + temp);
		}
	}

	public static void main(String[] args) {
		String[] Array = { "Masgj3Pw", "r4fsjk", "techno", "sfjk44lk" };
		new Program_1().stringArray(Array);
	}
}