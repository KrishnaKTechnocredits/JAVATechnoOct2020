/*Program 1: sum of all numbers from give string.  

String msg = I have 15 years and 2 months of experience.

hint : Integer.parseInt(String input) will help to convert string to int.
you may need spilt, charAt method as well. */

package vishakha;

public class AddOfNosInString {

	void add(String input) {
		String[] strArr = input.split(" ");
		int sum = 0;
		for (int i = 0; i < strArr.length; i++) {
			if (isNumber(strArr[i]))
				sum += Integer.parseInt(strArr[i]);
		}
		System.out.println("Sum is : " + sum);
	}

	boolean isNumber(String string) {
		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			if (!Character.isDigit(ch))
				return false;
		}
		return true;
	}

	public static void main(String[] args) {

		AddOfNosInString addOfNosInString = new AddOfNosInString();
		String input = "I have 15 years and 2 months of experience";
		System.out.println("Input - " + input);
		addOfNosInString.add(input);
	}

}