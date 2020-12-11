package anjaliS;

public class SumOfDigitsCon {
	void digSum(String msg) {
		System.out.println("Message: " + msg);
		int sum = 0;
		String dig = "";
		for (int index = 0; index < msg.length(); index++) {
			char ch = msg.charAt(index);
			if (Character.isDigit(ch)) {
				dig = dig + ch;
			} else if (dig.length() > 0) {
				sum += Integer.parseInt(dig);
				System.out.println("Number is : " + dig);
				dig = "";
			}
		}
		if (dig.length() > 0) {
			sum += Integer.parseInt(dig);
		}
		System.out.println("Sum of numbers is " + sum);

	}

	public static void main(String args[]) {
		SumOfDigitsCon sumofdigitscon = new SumOfDigitsCon();
		sumofdigitscon.digSum("te123ch9kj8");
	}
}
