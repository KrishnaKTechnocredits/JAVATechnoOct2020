package vaibhav;

public class MaxOccuranceWord {
	
	static void occuranceWord(String str) {
		String [] splitted=str.split(" ");
		int max = 0;
		String maxName = null; 
		for (int index = 0; index < splitted.length;index++) {
			int count = 0;
			String word = splitted[index];	
			if (str.contains(word)) {
				for ( int innerIndex = 0 ; innerIndex < splitted.length ; innerIndex++) {
					if (word.equals(splitted[innerIndex]))
						count++;
				}	
				str = str.replace(word," ");
				if(count > max) {
					max = count;
					maxName = word;
				}
			}
		}	
		System.out.println("Frequency of "+maxName+" is "+ max);
	}

	public static void main(String[] args) {
		String given = "hi vaibhav hi hi hi hi";
		MaxOccuranceWord.occuranceWord(given);
	}

}
