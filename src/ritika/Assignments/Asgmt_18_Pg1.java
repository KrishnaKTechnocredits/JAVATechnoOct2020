package ritika.Assignments;

/* Assignment-18 : 14th Nov'2020
Program : 1
max repeating word with its freq.
input : Hi Hello Hi Techno Hello Hi
output : Hi -> 3
*/

public class Asgmt_18_Pg1 {
	int maxFreq = 0;
	String maxFreqWord = null;

	void findMaxFreqWordfromArray(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			String word = arr[i];
			for (int j = 0; j < arr.length; j++) {
				if (word.equals(arr[j]) && i == word.indexOf(word))
					count++;
				if (maxFreq < count) {
					maxFreq = count;
					maxFreqWord = word;
				}
			}
		}
		System.out.println("Max Freq word is " + maxFreqWord + "-->" + maxFreq);
	}

	public static void main(String[] args) {
		String input = "Hi Hello Hi Techno Hello Hi";
		String[] inputArr = input.split(" ");
		Asgmt_18_Pg1 program1 = new Asgmt_18_Pg1();
		program1.findMaxFreqWordfromArray(inputArr);
	}
}
