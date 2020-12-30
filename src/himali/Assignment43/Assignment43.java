/*Assignment : 43 [23rd Dec'2020]

WAP to sum numbers from below String

input: I have 5.6 years of exp in automation and 2.3 in manual testing
output: 7.9

hint: Double's parse method
use exception handling*/


package himali.Assignment43;

public class Assignment43 {
	void sumNumberFromString(String word) {
		String[] input = word.split(" ");
		float sum = 0;
		for (int i = 0; i < input.length; i++) {
			char ch = input[i].charAt(0);
			try {
				if (Character.isDigit(ch)) {
					sum += Double.parseDouble(input[i]);
				}
			} catch (NumberFormatException e) {
				e.printStackTrace();

			}
		}
		System.out.println("Sum Of Digits From String is:" + sum);
	}
	public static void main(String[] args) {
		Assignment43 assign43 =new Assignment43();
		String str="I have 5.6 years of exp in automation and 2.3 in manual testing";
		System.out.println(str);
		assign43.sumNumberFromString(str);
	}

}
