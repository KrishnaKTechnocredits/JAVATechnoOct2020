//Assignment : 43 [23rd Dec'2020]:WAP to sum numbers from below String
//input: I have 5.6 years of exp in automation and 2.3 in manual testing
//output: 7.9/// hint: Double's parse method

package priya;

public class SumOfNumbers {

	void findSumOfNumber(String string) {
		String[] str = string.split(" ");
		float sum = 0;
		for (int i = 0; i < str.length; i++) {
			char ch = str[i].charAt(0);
			try {
				if (Character.isDigit(ch)) {
					sum += Double.parseDouble(str[i]);
				}
			} catch (NumberFormatException ne) {
				System.out.println("Exception Occure");
			}
		}
		System.out.println("Sum Of Number : " + sum);
	}

	public static void main(String[] args) {
		SumOfNumbers sumofnumbers = new SumOfNumbers();
		String string = "I have 5.6 years of exp in automation and 2.3 in manual testing.";
		System.out.println("String Is : " + string);
		sumofnumbers.findSumOfNumber(string);
	}
}
