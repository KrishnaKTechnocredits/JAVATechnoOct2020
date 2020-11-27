package rohit;
/*sum of all numbers from give string.

String msg = I have 15 years and 2 months of experience.

hint : Integer.parseInt(String input) will help to convert string to int.
you may need spilt, charAt method as well.*/
public class Sumofdigitsinstring {
	void sumofdigits(String str1) {
		int sum = 0;
		String temp = "";
		String word = "";
		String[] str = str1.split(" ");
		for (int i = 0; i < str.length; i++) {
			word = str[i];
			for (int inner = 0; inner < word.length(); inner++) {
				if (Character.isDigit(word.charAt(inner))) {
					temp = temp + word.charAt(inner);
				} else if (!(temp.equals(""))) {
					sum = sum + Integer.parseInt(temp);
					temp = "";
				}
			}
		}
		System.out.println("sum of digits present in the given string is " + sum);

	}

	public static void main(String[] a) {
		Sumofdigitsinstring sumofdigitsinstring = new Sumofdigitsinstring();
		String str = "I have 17 years and 2 months of experience";
		System.out.println(str);
		sumofdigitsinstring.sumofdigits(str);

	}
}