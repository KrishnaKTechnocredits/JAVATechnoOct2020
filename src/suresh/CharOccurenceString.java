package suresh;

/* Assignment - 17 - frequency should be printed single time.
input : aakanksha
output : a -> 4
              k -> 2
              n -> 1
              s -> 1
              h -> 1 */
public class CharOccurenceString {
	int totalcharcount;
	void charOccurenceofString(String input,char ch) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == ch)
				count++;
			totalcharcount++;
		}
		System.out.println(input+"->"+ch +"->" + count);
		
	}
	void FindFrequency(String word) {
		for(int index=0;index<word.length();index++) {
			char ch = word.charAt(index);
			int occurenceindex = word.indexOf(ch);
			if(index== occurenceindex)
			charOccurenceofString(word,ch);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "aakanksha";
		char ch = 'a';
	
		CharOccurenceString charoccurence = new CharOccurenceString();
				charoccurence.FindFrequency("aakanksha");
	}

}
