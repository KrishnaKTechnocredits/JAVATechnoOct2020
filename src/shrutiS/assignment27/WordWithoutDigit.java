/*Assignment - 27: 23rd Nov'2020  

Program 1: print all the words which does't have any digit. 
String[] input = {"Masgj3Pw", "r4fsjk","techno","sfjk44lk"};
output : techno*/
package shrutiS.assignment27;

public class WordWithoutDigit {

	void getInput(String[] input) {
		System.out.print("Input : {");
		for (int index = 0; index < input.length; index++) {
			System.out.print(input[index] + " ");
		}
	}

	void findWordsWithoutDigit(String[] input) {
		System.out.print("}\nOutput : {");
		for (int index = 0; index < input.length; index++) {
			boolean flag = true;
			String word = input[index];
			for (int innerIndex = 0; innerIndex < word.length(); innerIndex++) {
				if (Character.isDigit(word.charAt(innerIndex))) {
					flag = false;
					break;
				}
			}
			if (flag)
				System.out.print(word+" ");
		}
		System.out.println("}");
	}

	public static void main(String[] args) {
		WordWithoutDigit wordWithoutDigit = new WordWithoutDigit();
		String[] input = { "Masgj3Pw", "r4fsjk", "techno", "sfjk44lk" };
		wordWithoutDigit.getInput(input);
		wordWithoutDigit.findWordsWithoutDigit(input);
	}
}
