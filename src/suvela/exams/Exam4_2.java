
/*Program 2: WAP to find two String are identical or not

input 1: 
String s1 = "technoCredits";
String s2 = "teChnoCreditS";

output 1: both string are not identical

input 2:
String s1 = "pune";
String s2 = "pune";

output 2: both string are identical*/
package suvela.exams;

public class Exam4_2 {
	void isStringIdentical(String s, String s2) {
		System.out.println("given strings are:" + s + "," + s2);
		boolean flag = false;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			char ch1 = s2.charAt(i);
			if (s.length() == s2.length()) {
			if (Character.isLowerCase(ch) == Character.isLowerCase(ch1)
					&& Character.isUpperCase(ch) == Character.isUpperCase(ch1))
				flag = true;
			}
			else
				flag = false;

		}
		if (flag)
			System.out.println("both strings are identical");
		else
			System.out.println("both strings are not identical");

	}

	public static void main(String[] args) {
		String s1 = "technoCredits";
		String s2 = "teChnoCreditS";
		new Exam4_2().isStringIdentical(s1, s2);
		String s3 = "pune";
		String s4 = "pune";
		new Exam4_2().isStringIdentical(s3, s4);
	}

}
