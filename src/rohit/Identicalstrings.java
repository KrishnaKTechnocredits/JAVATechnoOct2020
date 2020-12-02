package rohit;

/*Program 2: WAP to find two String are identical or not

input 1:
String s1 = "technoCredits";
String s2 = "teChnoCreditS";

output 1: both string are not identical

input 2:
String s1 = "pune";
String s2 = "pune";

output 2: both string are identical*/
public class Identicalstrings {

	void isStringIdentical(String str1, String str2) {
		boolean flag = false;
		if (str1.length() != str2.length()) {
			System.out.println("String length doesn't match! ");
		} else {
			for (int i = 0; i < str1.length(); i++) {
				if (str1.charAt(i) != str2.charAt(i)) {
					flag = true;
				}
			}
			if (!flag)
				System.out.println("Strings are Identical! ");
			else
				System.out.println("Strings are Not Identical! ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "technoCredits";
		String str2 = "teChnoCreditS";
		Identicalstrings identicalstrings1 = new Identicalstrings();
		identicalstrings1.isStringIdentical(str1, str2);
		String str3 = "pune";
		String str4 = "pune";
		Identicalstrings identicalstrings2 = new Identicalstrings();
		identicalstrings2.isStringIdentical(str3, str4);
	}

}
