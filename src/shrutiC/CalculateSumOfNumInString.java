package shrutiC;

public class CalculateSumOfNumInString {

	void sumOfNumbersInStringLine(String string) {
		String[] strArray = string.split(" ");
		int sum = 0;
		for (int index = 0; index < strArray.length; index++) {
			if (isDigit(strArray[index]))
				sum += Integer.parseInt(strArray[index]);
		}
		System.out.println("Sum : " + sum);
	}

	boolean isDigit(String string) {
		for (int index = 0; index < string.length(); index++) {
			char ch = string.charAt(index);
			if (!Character.isDigit(ch))
				return false;
		}
		return true;
	}

	public static void main(String[] args) {

		CalculateSumOfNumInString object = new CalculateSumOfNumInString();
		String input = "I have 15 years and 2 months of experience";
		System.out.println("Input - " + input);

		object.sumOfNumbersInStringLine(input);
	}

}
