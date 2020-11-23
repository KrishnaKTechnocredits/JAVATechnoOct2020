/*Program 1: print all the words which does't have any digit. 
String[] input = {"Masgj3Pw", "r4fsjk","techno","sfjk44lk"};
output : techno
*/
package ankita.assignment.string;

import java.util.Arrays;

public class WordsWithoutDigit {

	void getWordsWithoutDigit(String[] str) {
		System.out.println("Input :" + Arrays.toString(str));
		System.out.print("Output :");
		for (int i = 0; i < str.length; i++) {
			String str1 = str[i];
			boolean flag = false;
			for (int j = 0; j < str1.length(); j++) {
				if (Character.isDigit(str1.charAt(j))) {
					flag = true;
					break;
				}
			}
			if (!flag)
				System.out.print(str1 + ", ");
		}
	}

	public static void main(String[] args) {
		String str[] = { "Masgj3Pw", "r4fsjk", "techno", "sfjk44lk" };
		new WordsWithoutDigit().getWordsWithoutDigit(str);
	}
}
