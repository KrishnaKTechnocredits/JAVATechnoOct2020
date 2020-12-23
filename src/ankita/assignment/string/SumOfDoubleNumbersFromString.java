/*Assignment : 43 [23rd Dec'2020]

WAP to sum numbers from below String

input: I have 5.6 years of exp in automation and 2.3 in manual testing
output: 7.9

hint: Double's parse method 
use exception handling
*/
package ankita.assignment.string;

public class SumOfDoubleNumbersFromString {

	void getSumOfDoubleNumbersFromString(String str) {
		System.out.println("Input :" + str);
		String[] arr = str.split(" ");
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			String word = arr[i];
			if (Character.isDigit(arr[i].charAt(0))) {
				sum = sum + Double.parseDouble(word);
			}
		}
		System.out.println("Output:" + sum);
	}

	public static void main(String[] args) {
		String str = "I have 5.6 years of exp in automation and 2.3 in manual testing";
		SumOfDoubleNumbersFromString sum = new SumOfDoubleNumbersFromString();
		sum.getSumOfDoubleNumbersFromString(str);
	}
}
