package suresh;

/*Do Sum of all numbers and Convert Uppercase into lowercase, lowercase into uppercase using ASCII.
Given String = "Te1ch8n9oC6reDi5TS1"
Expected String = "30tECHNOcREdIts"*/
public class SumOfNumbersCharsConversion {

	static String lowerCase = "";
	static String upperCase = "";
	String specialCase = "";

	static int findSum(String s) {

		int i;
		int sum = 0;
		String temp = "0";
		for (i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isDigit(c)) {
				temp += c;
			} else {
				sum += Integer.parseInt(temp);
				temp = "0";
			}
		}
		return sum + Integer.parseInt(temp);
	}

	static void Stringdata(String data) {
		for (int index = 0; index < data.length(); index++) {
			char ch = data.charAt(index);
			if (Character.isLowerCase(ch))
				lowerCase += ch;

			else if (Character.isUpperCase(ch))

				upperCase += ch;
		}
		System.out.println(upperCase.toLowerCase() + lowerCase.toUpperCase());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Te1ch8n9oC6reDi5TS1";
		String data = "Te1ch8n9oC6reDi5TS1";
		System.out.println("Given String is : " + s);
		int value = findSum(s);
		System.out.print(value);
		Stringdata(s);

	}

}
