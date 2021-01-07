package vishakha.Adgnmt_43;

public class SumOfNumsFromString {

	void sumOfNumbersFromString(String string) {
		String[] splitted = string.split(" ");
		double sum=0;
		for (String value : splitted) {
			try {
				double number = Double.parseDouble(value);
				sum+=number;
			} catch (NumberFormatException numberFormat) {
				continue;
			}
		}
		System.out.println("Sum of all the numbers: "+String.format("%.2f", sum));
	}

	public static void main(String[] args) {
		SumOfNumsFromString numbersFromString = new SumOfNumsFromString();
		numbersFromString.sumOfNumbersFromString("I have 5.6 years of exp in automation and 2.3 in manual testing");
	}
}
