/*Assignment : 43 [23rd Dec'2020]

WAP to sum numbers from below String

input: I have 5.6 years of exp in automation and 2.3 in manual testing
output: 7.9

hint: Double's parse method
use exception handling*/
package suvela.assignment43;

public class SumOfNumFromString {

	public double printSum(String str) {
		String[] arrstr = str.split(" ");
		double sum = 0;
		for (int index = 0; index < arrstr.length; index++) {
			String word = arrstr[index];
			try {
				if (Character.isDigit(word.charAt(0))) {
					sum = sum + Double.parseDouble(arrstr[index]);
				}
			} catch (NumberFormatException e) {
				System.out.println("Number format exception");
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		String str = "I have 5.6 years of exp in automation and 2.3 in manual testing";
		double sum= new SumOfNumFromString().printSum(str);
		System.out.println("Sum from string is:" +sum);
	}

}
