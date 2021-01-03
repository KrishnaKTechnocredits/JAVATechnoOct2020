package sadhana;

public class SumOfNumbersInString_Assignment_31 {

	static String lCase = "";
	static String uCase = "";
	String specialCase = "";

	static int printSum(String str) {

		int i;
		int sum = 0;
		String temp = "0";
		for (i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (Character.isDigit(c)) {
				temp += c;
			} else {
				sum += Integer.parseInt(temp);
				temp = "0";
			}
		}
		return sum + Integer.parseInt(temp);
	}

	static void procrssData(String str1) {
		for (int index = 0; index < str1.length(); index++) {
			char ch = str1.charAt(index);
			if (Character.isLowerCase(ch))
				lCase += ch;
			else if (Character.isUpperCase(ch))
				uCase += ch;
		}
		System.out.println(uCase.toLowerCase() + lCase.toUpperCase());
	}

	public static void main(String[] args) {
		String s = "Te1ch8n9oC6reDi5TS1";
		System.out.println("Given String is : " + s);
		int num = printSum(s);
		System.out.print("Expected String is : "+num);
		procrssData(s);

	}
}