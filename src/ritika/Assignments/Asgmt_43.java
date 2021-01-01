package ritika.Assignments;

/*Assignment : 43 [23rd Dec'2020]

WAP to sum numbers from below String

input: I have 5.6 years of exp in automation and 2.3 in manual testing
output: 7.9

hint: Double's parse method
use exception handling
*/

public class Asgmt_43 {

	static double sumOfNumbersFromAString(String message) {
		double output = 0;
		String[] array = message.split(" ");
		System.out.println("Numbers in given string are:");
		for (int index=0; index<array.length;index++) {
			try {
				output = output + Double.parseDouble(array[index]);
				System.out.print(array[index] + " ");
			}catch(NumberFormatException nfe) {
				
			}
		}
		System.out.println();
		return output;
	}
	
	public static void main(String[] args) {
		String message = "I have 5.6 years of exp in automation and 2.3 in manual testing";
		System.out.printf("Sum of numbers in given string is: " + "%.1f", sumOfNumbersFromAString(message));
	}
}
