
package monika;
/*Assignment - 25 : 22nd Nov'2020 

Program 1: sum of all numbers from give string.  

String msg = I have 15 years and 2 months of experience.

hint : Integer.parseInt(String input) will help to convert string to int.
you may need spilt, charAt method as well. */







public class SumAllNumbersFromString {

	void sumOfNumbersFromString(String str1) {
		int sum = 0;
		String temp = "";
		String word = "";
		String[] str = str1.split(" ");
		for (int index = 0; index < str.length; index++) {
			word = str[index];
			for (int i = 0; i < word.length(); i++) {
				if (Character.isDigit(word.charAt(i))) {
					temp = temp + word.charAt(i);
				} else if (!(temp.equals(""))) {
					sum = sum + Integer.parseInt(temp);
					temp = "";
				}
			}
		}
		System.out.println("Sum of numbers in a above string is " + sum);
	}

	public static void main(String[] a) {
		SumAllNumbersFromString sumallnumbers = new SumAllNumbersFromString();
		String s = "I have 15 years and 2 months of experience";
		System.out.println(s);
		sumallnumbers.sumOfNumbersFromString(s);
	}
}