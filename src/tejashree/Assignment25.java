package tejashree;

public class Assignment25 {
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
		System.out.println("sum of digits in a above string is " + sum);

	}

	public static void main(String[] a) {
		Assignment25 assignment25 = new Assignment25();
		String s = "I have 15 years and 2 months of experience";
		System.out.println(s);
		assignment25.sumOfNumbersFromString(s);

	}
}
