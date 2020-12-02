package technoCredits.array;

public class StringReverse2 {
	
	String reverseWord(String word) {
		String revWord = "";
		for(int index=word.length()-1;index>=0;index--) {
			revWord = revWord + word.charAt(index);
		}
		return revWord;
	}
	
	void reverseWordFromArray(String[] words) {
		for(int index=0;index<words.length;index++) {
			String revWord = reverseWord(words[index]);
			System.out.println(revWord);
		}
	}
	
	public static void main(String[] args) {
		StringReverse2 stringReverse = new StringReverse2();
		String[] words = {"Apurva", "Pooja", "Nagendra", "Suresh", "Suvela", "Ankita"};
		//String processedWord = stringReverse.reverseWord("Apurva");
		//System.out.println(processedWord);
		stringReverse.reverseWordFromArray(words);
	}
	
}
