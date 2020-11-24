package ruby;

public class SumOfNumInString {
	/*
	 * Assignment - 24 : 22nd Nov'2020 
	 * program 1: sum of all digits from a given
	 * string input: te1ch9kj8 output:= 18	

	 * program 2 : sum of all numbers in a give string input: te123ch9kj8 
	 * output :123 + 9 + 8 = 140
	 */
	void sumOfNum(String word) {
		int sum = 0;
		String str = "";
		for (int index = 0; index < word.length(); index++) {
			char ch = word.charAt(index);
			if (Character.isDigit(ch)) {
				str += ch;
			} else if (!str.equals("")) {
				sum += Integer.parseInt(str);
				str = "";
			}
		}
		if (!str.equals(""))
		sum += Integer.parseInt(str);
		System.out.println("Sum of all digits in a given string: " + sum);
	}

	public static void main(String[] args) {
		SumOfNumInString sum = new SumOfNumInString();
		sum.sumOfNum("te1ch9kj8");
		sum.sumOfNum("te123ch9kj8");

	}

}
