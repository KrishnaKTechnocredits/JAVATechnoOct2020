package technoCredits.array;

import java.util.Arrays;

public class StringReverse4 {
	
	String reverseWord(String word) {
		String revWord = "";
		for(int index=word.length()-1;index>=0;index--) {
			revWord = revWord + word.charAt(index);
		}
		return revWord;
	}
	
	void reverseWordFromArray(String[] input) {
		for(int index=0;index<input.length;index++) {
			String revWord = reverseWord(input[index]);
			input[index] = revWord; 
		}
	}
	
	public static void main(String[] args) {
		StringReverse4 stringReverse = new StringReverse4();
		String[] words = {"Apurva", "Pooja", "Nagendra", "Suresh", "Suvela", "Ankita"};
		stringReverse.reverseWordFromArray(words);
		System.out.println(Arrays.toString(words));
	}
	
}
