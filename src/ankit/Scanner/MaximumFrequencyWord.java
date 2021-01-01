/*Assignment-18 : max repeating word with its frequency.
*/
package ankit.Scanner;

import java.util.Scanner;

public class MaximumFrequencyWord {

		void maxWordFrequency(String str) {
			String[] strArray = new String[str.length()];
			strArray = str.split(" ");
			int maximumCount=0;
			String word = null;
			for(int index=0;index<strArray.length;index++) {
				maximumCount = 0;
				word = strArray[index];
				for(int occurenceIndex=0;occurenceIndex<strArray.length;occurenceIndex++) {
					if(strArray[occurenceIndex].equalsIgnoreCase(strArray[index])) {
						maximumCount++;
						word = strArray[occurenceIndex];
						strArray[occurenceIndex].replace(strArray[occurenceIndex]," ");
					}
				}
			}
			System.out.println(word+"-->"+maximumCount);
		}

		public static void main(String[] args) {
			MaximumFrequencyWord maximumFrequencyWord = new MaximumFrequencyWord();
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the string line: ");
			String str = scanner.nextLine();
			maximumFrequencyWord.maxWordFrequency(str);
			scanner.close();
		}
	
}
