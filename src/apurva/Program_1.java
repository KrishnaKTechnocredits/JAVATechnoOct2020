package apurva;
/*Max repeating word with its frequency.
input: Hi Hello Hi Techno Hello Hi
output: Hi -> 3*/

public class Program_1 {
	void displayCount(String str) {
		int max = 0, maxWord = 0;
		String[] strArray = str.split(" ");
		for (int i = 0; i < strArray.length; i++) {
			String word = strArray[i];
			int count = 0;
			if (str.contains(word)) {
				for (int j = 0; j < strArray.length; j++) {
					if (word.equals(strArray[j])) {
						count++;
					}
					if (count > max) {
						max = count;
						maxWord = i;
					}
					str = str.replace(word, "");
				}
			}
		}
		System.out.println(" Word with its frequency " + strArray[maxWord] + "->" + max);
	}

	public static void main(String[] args) {
		Program_1 program_1 = new Program_1();
		program_1.displayCount(" Hi Hello Hi Techno Hello Hi ");
	}
}