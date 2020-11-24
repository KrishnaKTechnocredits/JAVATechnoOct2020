package nagendra.string;

/*
Program 2: print all the words where digit sum is > 10. 
String[] input = {"Ma1s3gj3Pw", "r4f3sjk","te3ch2no9","sfjk4p4plpk"};
output : te3ch2no9
*/

public class PrintDigitWithWords {

	void wordsWithoutDigit(String[] words) {
		int sum = 0;
		String input = "";
		boolean flag = true;
		for (int index = 0; index < words.length; index++) {
			for (int inner = 0; inner < words[index].length(); inner++) {
				flag = false;
				sum = 0;
				if (Character.isDigit(words[index].charAt(inner))) {
					input += words[index].charAt(inner);
					flag = true;
				}
			}
			if (flag) {
				sum = Integer.parseInt(input);
				input = "";
				if (sum > 10)
					System.out.println(words[index]);
			}
		}
	}

	public static void main(String[] args) {

		PrintDigitWithWords object = new PrintDigitWithWords();
		String[] input = {"Masgj3Pw", "r4fsjk","techno","sfjk44lk"};
		System.out.println(" words with digit sum is > 10 ");
		object.wordsWithoutDigit(input);
	}
}
