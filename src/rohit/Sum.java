package rohit;

/*program 1: sum of all digits from a given string
input: te1ch9kj8
output:= 18
*/
public class Sum {

	void isDigit(String str) {
		boolean digitFlag = false;
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			char chr = str.charAt(i);
			digitFlag = Character.isDigit(chr);
			if (digitFlag)
				sum = sum + Character.getNumericValue(chr);
		}
		System.out.println("Sum of digits in given string " + str + " is: " + sum);
	}

	public static void main(String args[]) {
		String str = "te1ch9kj8";
		Sum sum = new Sum();
		sum.isDigit(str);
	}
}