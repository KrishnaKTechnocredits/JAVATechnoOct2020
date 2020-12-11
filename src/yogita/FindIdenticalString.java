/*Program 2: WAP to find two String are identical or not
input 1: 
String s1 = "technoCredits";
String s2 = "teChnoCreditS";
output 1: both string are not identical
input 2:
String s1 = "pune";
String s2 = "pune";
output 2: both string are identical*/

package yogita;

import java.util.Arrays;

public class FindIdenticalString {
	void findIdenticalString(String str1, String str2) {

		boolean flag = false;
		if (str1.length() == str2.length()) {
			for (int i = 0; i < str1.length(); i++) {
				char ch1 = str1.charAt(i);
				char ch2 = str2.charAt(i);
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
		FindIdenticalString identicalString = new FindIdenticalString();
		String input1 = "pune";
		String input2 = "pune";
		identicalString.findIdenticalString(input1, input2);
		String input3 = "technoCredits";
		String input4 = "teChnoCredits";
		identicalString.findIdenticalString(input3, input4);

	}
}
