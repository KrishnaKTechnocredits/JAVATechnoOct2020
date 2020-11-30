package milind;

public class WordFromArrayMaxSumOfNumber {
	
	void printWordHavingMaxSumOfNumber(String[] input) {
		int maxSum = 0;
		String maxSumWord = "";
		for(int index = 0; index < input.length; index++) {
			int sum = 0;
			String word = input[index];
			for(int innerIndex = 0; innerIndex < word.length(); innerIndex++) {
				char ch = word.charAt(innerIndex);
				if(Character.isDigit(ch)) {
					sum = sum + Character.getNumericValue(ch);
				}
			}
			if(maxSum < sum) {
				maxSum = sum;
				maxSumWord = word;
			}
		}
		System.out.println("Max sum of integer of word is : " + maxSumWord);
	}
	
	public static void main(String[] args) {
		String[] input = {"Ma1s3gj3Pw", "r4f3sjk","te3ch2no9","sfjk4p4plpk","sajd","jsjasdjhs"};
		WordFromArrayMaxSumOfNumber wordFromArrayMaxSumOfNumber = new WordFromArrayMaxSumOfNumber();
		wordFromArrayMaxSumOfNumber.printWordHavingMaxSumOfNumber(input);
	}
}
