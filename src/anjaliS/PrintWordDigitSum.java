package anjaliS;

public class PrintWordDigitSum {
	void sumofdigitgreaterthan10(String[] arr) {
		for (int index = 0; index < arr.length; index++) {
			String word = arr[index];
			int sum = 0;
			for (int index1 = 0; index1 < word.length(); index1++) {
				char ch = word.charAt(index1);
				if (Character.isDigit(ch)) {
					sum += Character.getNumericValue(ch);
				}
				if (sum > 10) {
					System.out.println("Digits in a word whose sum is greater than 10 is: " + word);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array = { "Ma1s3gj3Pw", "r4f3sjk", "te3ch2no9", "sfjk4p4plpk" };
		PrintWordDigitSum printWorddigitsum = new PrintWordDigitSum();
		printWorddigitsum.sumofdigitgreaterthan10(array);
	}

}
