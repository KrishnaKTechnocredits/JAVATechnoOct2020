package anjaliS;

public class SumOfNumberFromParse {
	void sumOfNumbers(String array) {
		String[] input = array.split(" ");
		float sum = 0;
		for (int i = 0; i < input.length; i++) {
			char ch = input[i].charAt(0);
			try {
				if (Character.isDigit(ch)) {
					sum += Double.parseDouble(input[i]);
				}
			} catch (NumberFormatException n) {

			}
		}
		System.out.println("Sum Of Digits From String is:" + sum);
	}

	public static void main(String[] args) {
		SumOfNumberFromParse sumofnumberfromstring = new SumOfNumberFromParse();
		String input = "I have 5.6 years of exp in automation and 2.3 in manual testing";
		sumofnumberfromstring.sumOfNumbers(input);
	}
}
