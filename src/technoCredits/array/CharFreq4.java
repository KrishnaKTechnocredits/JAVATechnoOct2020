package technoCredits.array;

public class CharFreq4 {
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
	
	public static void main(String[] args) {
		String[] words = {"technocredits","nandini","nitin","neha","nupur"};
		char ch = 'n';
		CharFreq4 charFreq = new CharFreq4();
		charFreq.findCharFreqFromArray(words, ch);
		System.out.println("Total " + ch + " : "+ charFreq.totalCharCount);
	}
}
