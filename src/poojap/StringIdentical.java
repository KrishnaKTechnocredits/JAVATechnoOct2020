/*Program 2: WAP to find two String are identical or not
input 1: 
String s1 = "technoCredits";
String s2 = "teChnoCreditS";
output 1: both string are not identical
input 2:
String s1 = "pune";
String s2 = "pune";
*/
package poojap;

public class StringIdentical {
	void identicalString(String string1, String string2) {
		boolean flag = false;
		if (string1.length() == string2.length()) {
			for (int i = 0; i < string1.length(); i++) {
				char ch1 = string1.charAt(i);
				char ch2 = string2.charAt(i);
				if (ch1 != ch2)
					flag = true;
			}
			if (!flag)
				System.out.println("Strings Are  Identical");
			else
				System.out.println("Strings Are Not Identical");
		} else
			System.out.println("Strings Are Not identical");
	}

	public static void main(String[] args) {
		StringIdentical stringIdentical = new StringIdentical();
		String string1 = "technoCredits";
		String string2 = "teChnoCreditS";
		stringIdentical.identicalString(string1, string2);
		String string3 = "pune";
		String string4 = "pune";
		stringIdentical.identicalString(string3, string4);
	}
}
