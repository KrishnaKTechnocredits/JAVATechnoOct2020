/*max repeating word with its freq.
input : Hi Hello Hi Techno Hello Hi
output : Hi -> 3
*/
package ankita;

import java.util.Arrays;

public class MaxRepeatingWordWithFreq {
	void getMaxRepeatingWord(String input) {
		String[] strArr = input.split(" ");
		int max = 0;
		String maxWord = "";
		System.out.println("Entered String : " +input);
		for (int i = 0; i < strArr.length; i++) {
			String word = strArr[i];
			int cnt = 0;
			if (!word.equals("")) {
				for (int j = 0; j < strArr.length; j++) {
					if (word.equals(strArr[j])) {
						cnt++;
						strArr[j] = "";
					}
				}
				if (max < cnt) {
					max = cnt;
					maxWord = word;
				}
			}
		}
		System.out.println("Maximum frequency word :" + maxWord + "->" + max);
	}

	public static void main(String[] args) {
		String input = "Hi Hello Hi Techno Hello Hi";
		MaxRepeatingWordWithFreq freq = new MaxRepeatingWordWithFreq();
		freq.getMaxRepeatingWord(input);
	}
}