package technoCredits.array;

public class CharFreq {
	
	void findCharFreq(String input, char ch){
		int count = 0;
		for(int index = 0; index<input.length();index++) {
			if(input.charAt(index) == ch)
				count++;
		}
		System.out.println(ch + "->" + count);
	}
	
	public static void main(String[] args) {
		String word = "technocredits";
		char ch = 'n';
		CharFreq charFreq = new CharFreq();
		charFreq.findCharFreq(word, ch);
	}
	
}
