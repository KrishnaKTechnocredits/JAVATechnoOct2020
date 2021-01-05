package sadhana;

/*Assignment : 43 

WAP to sum numbers from below String

input: I have 5.6 years of exp in automation and 2.3 in manual testing
output: 7.9

hint: Double's parse method
use exception handling */

public class SumNumbersInString_43 {

	public double printData(String str) {
		String[] stringArray = str.split(" ");
		double sum = 0;
		for (int index = 0; index < stringArray.length; index++) {
			String word = stringArray[index];
			try {
				if (Character.isDigit(word.charAt(0))) {
					sum = sum + Double.parseDouble(stringArray[index]);
				}
			} catch (NumberFormatException e) {
				System.out.println("Number format exception");
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		String str = "I have 2.6 years of exp in automation and 2.5 in manual testing";
		double sum= new SumNumbersInString_43().printData(str);
		System.out.println("Total EXP:" +sum);
	}

}
