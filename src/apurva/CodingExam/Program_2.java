package apurva.CodingExam;

/*WAP to find two String are identical or not

input 1: 
String s1 = "technoCredits";
String s2 = "teChnoCreditS";

output 1: both string are not identical

input 2:
String s1 = "pune";
String s2 = "pune";

output 2: both string are identical*/
public class Program_2 {
	void isIdentical(String s1, String s2) {
		System.out.println("Given strings s1 = " + s1);
		System.out.println("Given strings s2 = " + s2);
		boolean flag = false;
		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			for (int j = 0; j < s2.length(); j++) {
				char character = s2.charAt(j);
				if (s1.length() != s2.length())
					System.out.println("String length is not match");
				else if (Character.isLowerCase(ch) == Character.isLowerCase(character)
						&& Character.isUpperCase(ch) == Character.isUpperCase(character))
					flag = true;
				else
					flag = false;
			}

		}
		if (flag)
			System.out.println("both strings are identical");
		else
			System.out.println("both strings are not identical");

	}

	public static void main(String[] args) {
		String s1 = "technoCredits";
		String s2 = "teChnoCreditS";
		new Program_2().isIdentical(s1, s2);
		String s3 = "pune";
		String s4 = "pune";
		new Program_2().isIdentical(s3, s4);
	}

}