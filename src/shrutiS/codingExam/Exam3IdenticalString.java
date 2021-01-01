/*Program 2: WAP to find two String are idential or not

input 1: 
String s1 = "technoCredits";
String s2 = "teChnoCreditS";

output 1: both string are not idential

input 2:
String s1 = "pune";
String s2 = "pune";

output 2: both string are identical */

package shrutiS.codingExam;

public class Exam3IdenticalString {

	void getStringvalue(String s1, String s2) {
		System.out.println("String s1 ="+s1);
		System.out.println("String s2= "+s2);
	}
	void findIdeticalString(String s1, String s2) {
		if (s1.length() == s2.length()) {
			boolean flag = true;
			for (int index = 0; index < s1.length(); index++) {
				char ch1 = s1.charAt(index);
				char ch2 = s2.charAt(index);
				if (ch1 != ch2) {
					System.out.println("Both string are not idential");
					flag = false;
					break;
				}
			}
			if (flag)
				System.out.println("Both string are identical");
		} else
			System.out.println("Both string are not idential");
	}

	public static void main(String[] args) {
		Exam3IdenticalString ideticalString = new Exam3IdenticalString();
		String s1 = "pune";
		String s2 = "pune";
		ideticalString.getStringvalue(s1, s2);
		ideticalString.findIdeticalString(s1, s2);
	}
}
