package anjaliS;

public class SumOfDigit {
	void digitSumFromString(String str) {
		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				sum += Character.getNumericValue(ch);
			}
		}
		System.out.println("Sum of digit: " + sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfDigit sumofdigit = new SumOfDigit();
		sumofdigit.digitSumFromString("An5J9K1");

	}

}
