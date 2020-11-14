package ruby;
/*Same as Assignment 16 but each frequency should be printed single time.
input : aakanksha
output : a -> 4
              k -> 2
              n -> 1
              s -> 1
              h -> 1*/
public class OnceCharFreq {

	public static void main(String[] args) {		
		OnceCharFreq onceCharFreq = new OnceCharFreq();
		String word = "aakanksha";
		onceCharFreq.charFreq(word);	
	}
	
	void charFreq(String word) {	
		for(int index=0;index<word.length();index++) {
		char ch1 = Character.toLowerCase(word.charAt(index));
		int count=0;
			if(index == word.indexOf(ch1))
				for(int j=0; j<word.length();j++) {
				char ch2=Character.toLowerCase(word.charAt(j));
				if(ch2 == ch1)
					count++;
				}
			if (count != 0)
			System.out.println(word.charAt(index)+" --> "+count);
			}
	}
}
