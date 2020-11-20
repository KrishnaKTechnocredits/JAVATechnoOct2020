package technoCredits.array;

public class CharFreq6 {
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
	
	void findFreqOfEachCharFromArray(String[] words) {
		for(int index=0;index<words.length;index++) {
			System.out.println("=================================");
			System.out.println(words[index]);
			System.out.println("================================");
			findFreqOfEachCharFromWord(words[index]);
		}
	}
	
	public static void main(String[] args) {
		String[] words = {"technocredits","nandini","nitin","neha","nupur"};
		char ch = 'n';
		CharFreq6 charFreq = new CharFreq6();
		charFreq.findFreqOfEachCharFromArray(words);
	}
}
