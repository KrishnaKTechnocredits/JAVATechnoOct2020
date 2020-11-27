package technoCredits.array;

public class StringReverse {
	
	void reverseWord(String word) {
		for(int index=word.length()-1;index>=0;index--) {
			System.out.print(word.charAt(index));
		}
		System.out.println();
	}
	
	void reverseWordFromArray(String[] words) {
		for(int index=0;index<words.length;index++) {
			reverseWord(words[index]);
		}
	}
	
	public static void main(String[] args) {
		StringReverse stringReverse = new StringReverse();
		String[] words = {"Apurva", "Pooja", "Nagendra", "Suresh", "Suvela", "Ankita"};
		stringReverse.reverseWordFromArray(words);
	}
	
}
