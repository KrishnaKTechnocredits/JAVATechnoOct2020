package technoCredits.array;

public class CharFreq3 {
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
	
	public static void main(String[] args) {
		String[] words = {"technocredits","nandini","nitin","neha","nupur"};
		char ch = 'n';
		CharFreq3 charFreq = new CharFreq3();
		for(int index=0;index<words.length;index++) {
			charFreq.findCharFreq(words[index], ch);
		}
		System.out.println("Total " + ch + " : "+ charFreq.totalCharCount);
		
		
	}
	
}
