/*Program 1: sum of all numbers from give string.  

String msg = I have 15 years and 2 months of experience.

hint : Integer.parseInt(String input) will help to convert string to int.
you may need spilt, charAt method as well. 
*/
package ankita.assignment.string;

public class SumOfAllNumber2 {

	void getSumOfAllNumber(String str) {
		String str1[] = str.split(" ");
		int sum = 0;

		for (int i = 0; i < str1.length; i++) {
			String temp = "";
			int sum1 = 0;

			String str2 = str1[i];
			boolean flag = false;
			for (int j = 0; j < str2.length(); j++) {
				if (Character.isLetter(str2.charAt(j))) {
					flag = true;
					break;
				} else if (Character.isDigit(str2.charAt(j))) {
					temp += Character.toString(str2.charAt(j));
				} else if (temp != "") {
					sum1 = sum1 + Integer.parseInt(temp);
					temp = "";
				}
			}
			if (temp != "")
				sum1 = sum1 + Integer.parseInt(temp);

			if (!flag)
				sum += sum1;
		}

		System.out.println("Input : " + str);
		System.out.println("Sum of Numbers : " + sum);
	}

	public static void main(String[] args) {
		new SumOfAllNumber2().getSumOfAllNumber("I have 15 years and 2 months of experience");
	}
}