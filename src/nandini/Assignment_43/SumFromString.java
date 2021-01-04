package nandini.Assignment_43;

public class SumFromString {

	void sumOfNumFromString(String str) {
		String[] splitStr = str.split(" ");
		double sum=0;
		for (String value : splitStr) {
			try {
				double number = Double.parseDouble(value);
				sum+=number;
			} catch (NumberFormatException numberFormat) {
				continue;
			}
		}
		System.out.println("Sum of numbers: "+String.format("%.2f", sum));
	}
	
	public static void main(String[] args) {
		SumFromString numString = new SumFromString();
		numString.sumOfNumFromString("I have 5.6 years of exp in automation and 2.3 in manual testing");
	}
}
