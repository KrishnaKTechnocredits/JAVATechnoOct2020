package suresh;

/*Find the frequency of character from a given String array. [Estimated time: 15-20 mins]
sample input array : { "technocredits","elephant","earthear"} and char is 'e'
output : technocredits -> 2
              elephant -> 2
              earth -> 1
              Total occurrence of e -> 5*/
public class CharFrequency {
	
	int totalcharcount;
	void charFrequencyFromArray(String input, char ch) {
		int count = 0;
		for(int index=0;index<input.length();index++) {
			if(input.charAt(index)== ch) {
				count++;
				totalcharcount++;
			}
		}
		System.out.println(input + "->"+ ch + "->"+count);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = { "technocredits","elephant","earthear"} ;
		char ch = 'e';
		CharFrequency charfrequency = new CharFrequency();
		for(int index=0;index<words.length;index++) {
			charfrequency.charFrequencyFromArray(words[index],ch);
		}
		System.out.println("Total Occurence of "+ ch +" ->"+ charfrequency.totalcharcount);
	}

}
