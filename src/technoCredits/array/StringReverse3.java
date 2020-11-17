package technoCredits.array;

import java.util.Arrays;

public class StringReverse3 {
	
	String reverseWord(String word) {
		String revWord = "";
		for(int index=word.length()-1;index>=0;index--) {
			revWord = revWord + word.charAt(index);
		}
		return revWord;
	}
	
	String[] reverseWordFromArray(String[] words) {
		String[] temp = new String[words.length];
		for(int index=0;index<words.length;index++) {
			String revWord = reverseWord(words[index]);
			temp[index] = revWord; 
		}
		return temp;
	}
	
	public static void main(String[] args) {
		StringReverse3 stringReverse = new StringReverse3();
		String[] words = {"Apurva", "Pooja", "Nagendra", "Suresh", "Suvela", "Ankita"};
		//String processedWord = stringReverse.reverseWord("Apurva");
		//System.out.println(processedWord);
		String[] output = stringReverse.reverseWordFromArray(words);
		System.out.println(Arrays.toString(output));
	}
	
}
