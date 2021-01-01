package ruby;
/*Program 2: WAP to find two String are identical or not

input 1: 
String s1 = "technoCredits";
String s2 = "teChnoCreditS";

output 1: both string are not identical

input 2:
String s1 = "pune";
String s2 = "pune";

output 2: both string are identical*/

public class Exam4Program2 {
	void CompareString(String s1, String s2) {
		boolean flag = false;
		int count = 0;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.length() == s2.length()) {
				flag = true;
				if (s1.charAt(i) != s2.charAt(i)) {
					count++;
				}
			}
		}
		if (!flag) {
			System.out.println("Strings length is not same");
		} else if (count > 0) {
			System.out.println("Both Strings are not identicals");
		} else {
			System.out.println("Both Strings are identicals");
		}
	}

	public static void main(String[] args) {
		Exam4Program2 exam = new Exam4Program2();
		String s1 = "teChnoCreditS";
		String s2 = "technoCredits";
		exam.CompareString(s1, s2);
		String s3 = "pune";
		String s4 = "pune";
		exam.CompareString(s3, s4);

	}
}
