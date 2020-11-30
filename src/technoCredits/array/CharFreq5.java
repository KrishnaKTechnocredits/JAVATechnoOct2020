package technoCredits.array;

public class CharFreq5 {
	int totalCharCount;
	
	void findCharFreq(String input, char ch){
		int count = 0;
		for(int index = 0; index<input.length();index++) {
			if(input.charAt(index) == ch) {
				count++;
				totalCharCount++;
			}
		}
		System.out.println(input + "->" + ch + "->" + count);
	}
	
	void findCharFreqFromArray(String[] words, char ch) {
		for(int index=0;index<words.length;index++) {
			findCharFreq(words[index], ch);
		}
	}
	
	void findFreqOfEachCharFromWord(String word) {
		for(int index=0;index<word.length();index++) {
			char ch = word.charAt(index);
			int occurenceIndex = word.indexOf(ch);
			if(index == occurenceIndex)
				findCharFreq(word, ch);
		}
	}
	
	
	public static void main(String[] args) {
		String[] words = {"technocredits","nandini","nitin","neha","nupur"};
		char ch = 'n';
		CharFreq5 charFreq = new CharFreq5();
		charFreq.findFreqOfEachCharFromWord("technocredits");
	}
}
