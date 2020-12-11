/*Program 2: WAP to find two String are identical or not

input 1: 
String s1 = "technoCredits";
String s2 = "teChnoCreditS";

output 1: both string are not identical

input 2:
String s1 = "pune";
String s2 = "pune";

output 2: both string are identical 
*/
package ankita.assignment.exam;

public class Exam4StringIdentical {
	void isStringIdentical(String str1, String str2) {
		System.out.println("input 1 :" + str1);
		System.out.println("input 2 :" + str2);
		if (str1.length() == str2.length()) {
			boolean flag = true;
			for (int i = 0; i < str1.length(); i++) {
				if (str1.charAt(i) != str2.charAt(i)) {
					flag = false;
					break;
				}
			}
			if (!flag)
				System.out.println("Not Identical string ..Content mismatch");
			else
				System.out.println("Identical String");

		} else
			System.out.println("String not Identical..length mismatch");
	}

	public static void main(String[] args) {
		Exam4StringIdentical exam4StringIdentical = new Exam4StringIdentical();
		String s1 = "technoCredits";
		String s2 = "teChnoCreditS";
		exam4StringIdentical.isStringIdentical(s1, s2);
		String s3 = "pune";
		String s4 = "pune";
		exam4StringIdentical.isStringIdentical(s3, s4);
	}
}
