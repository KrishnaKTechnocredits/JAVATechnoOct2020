package ruby;
/*Assignment : 43 [23rd Dec'2020]

WAP to sum numbers from below String

input: I have 5.6 years of exp in automation and 2.3 in manual testing
output: 7.9

hint: Double's parse method
use exception handling*/

public class Assignment43 {
	static void sumOfNumInString(String input) {
		System.out.println("Input String: "+input);
		String[] arr = input.split(" ");
		double sum = 0;
		for (int index = 0; index < arr.length; index++) {
			try {
				double num = Double.parseDouble(arr[index]);
				sum += num;
			} catch (NumberFormatException nEx) {
				continue;
			}
		}
		System.out.println("Sum of all number in String: "+ String.format("%.1f", sum));
	}

	public static void main(String[] args) {
		String input = "I have 5.6 years of exp in automation and 2.3 in manual testing";
		Assignment43.sumOfNumInString(input);
	}
}
