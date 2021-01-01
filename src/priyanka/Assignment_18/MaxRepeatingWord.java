package priyanka.Assignment_18;

/*Program : 1
max repeating word with its freq.
input : Hi Hello Hi Techno Hello Hi
output : Hi -> 3*/

public class MaxRepeatingWord {

	void maxRepeatWord(String str) {

		String[] strArr = str.split(" ");
		int max = 0;
		String maxWord = "";
		for (int index = 0; index < strArr.length; index++) {
			int count = 0;
			String word = strArr[index];
			if (str.contains(word)) {
				for (int innerIndex = 0; innerIndex < strArr.length; innerIndex++) {
					if (word.equals(strArr[innerIndex]))
						count++;
				}
				if (max < count) {
					max = count;
					maxWord = word;
				}	
			}
		}
		System.out.println(maxWord + " occured " + max);
	}

	public static void main(String[] args) {
		MaxRepeatingWord maxRepeatingWord = new MaxRepeatingWord();
		String str = "Hi Hello Hi Techno Hello Hi";
		System.out.println("The input string is: " +str);
		maxRepeatingWord.maxRepeatWord(str);
	}
}
