/*Assignment - 27: 23rd Nov'2020  
Program 2: print all the words where digit sum is > 10. 
String[] input = {"Ma1s3gj3Pw", "r4f3sjk","te3ch2no9","sfjk4p4plpk"};
output : te3ch2no9*/
package shrutiS.assignment27;

public class WordWithDigitSum {

	void getInput(String[] input) {
		System.out.print("Input : {");
		for (int index = 0; index < input.length; index++) {
			System.out.print(input[index] + " ");
		}
	}

	void findWordsWithoutDigit(String[] input) {
		System.out.print("}\nOutput : {");
		for (int index = 0; index < input.length; index++) {
			int sum = 0;
			String word = input[index];
			for (int innerIndex = 0; innerIndex < word.length(); innerIndex++) {
				if (Character.isDigit(word.charAt(innerIndex))) {
					sum += Character.getNumericValue(word.charAt(innerIndex));
				}
				if (sum > 10)
					System.out.print(word + " ");
			}
		}
		System.out.print("}");
	}

	public static void main(String[] args) {
		WordWithDigitSum wordWithDigit = new WordWithDigitSum();
		String[] input = { "Ma1s3gj3Pw", "r4f3sjk", "te3ch2no9", "sfjk4p4plpk" };
		wordWithDigit.getInput(input);
		wordWithDigit.findWordsWithoutDigit(input);
	}
}
