/*Assignment - 25 : 22nd Nov'2020 

Program 1: sum of all numbers from give string.  

String msg = I have 15 years and 2 months of experience.

hint : Integer.parseInt(String input) will help to convert string to int.
you may need spilt, charAt method as well. */

package shrutiS.assignment25;

public class NumberSumInString {
	int sum;

	void findSumOfNUmberInString(String msg) {
		System.out.print("Sum of all numbers in a give string \n'" + msg + "' = ");
		String temp = "";
		String[] string = msg.split(" ");
		for (int index = 0; index < string.length; index++) {
			String word = string[index];
			for (int innerIndex = 0; innerIndex < word.length(); innerIndex++) {
				if (Character.isDigit(word.charAt(innerIndex)))
					temp += word.charAt(innerIndex);
				else {
					if (temp.length() > 0) {
						sum += Integer.parseInt(temp);
						temp = "";
					}
				}
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		NumberSumInString numberSum = new NumberSumInString();
		String msg = "I have 15 years and 2 months of experience.";
		numberSum.findSumOfNUmberInString(msg);
	}
}
