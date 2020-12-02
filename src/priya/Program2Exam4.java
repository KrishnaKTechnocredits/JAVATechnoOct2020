//Program 2: WAP to find two String are identical or not
//input 1:String s1 = "technoCredits";
//String s2 = "teChnoCreditS";///output 1: both string are not identical
//input 2:String s1 = "pune";
//String s2 = "pune";////output 2: both string are identical

package priya;

public class Program2Exam4 {

	void identicalString(String s1, String s2) {
		boolean flag = false;
		boolean word = false;
		for (int i = 0; i < s1.length(); i++) {
			word = false;
			if (s1.length() == s2.length()) {
				flag = true;
				if (s1.charAt(i) == s2.charAt(i)) {
					word = true;
				}
			}
		}
		if (!flag) {
			System.out.println("Input strings length is not same");
		} else if (word) {
			System.out.println("Input both strings are identicals");
		} else {
			System.out.println("Input both strings are not identicals");
		}
	}

	public static void main(String[] args) {
		Program2Exam4 program2exam4 = new Program2Exam4();
		String s1 = "technoCredits";
		String s2 = "teChnoCreditS";
		program2exam4.identicalString(s1, s2);
		String s3 = "pune";
		String s4 = "pune";
		program2exam4.identicalString(s3, s4);

	}
}
