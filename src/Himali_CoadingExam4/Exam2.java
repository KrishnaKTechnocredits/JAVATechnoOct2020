package Himali_CoadingExam4;

public class Exam2 {
	void checkStringIdentical(String s1, String s2) {
		char[] ch1 = s1.toCharArray();
		char ch2[] = s2.toCharArray();
		boolean isIdentical = true;
		if (ch1.length != ch2.length) {
			System.out.println("String length is not same");
			isIdentical = false;

		} else {
			for (int i = 0; i < ch1.length; i++) {
				if (ch1[i] != ch2[i]) {
					isIdentical = false;
					break;
				}

			}
		}
		if (isIdentical) {
			System.out.println("Both Strings are identical");
		} else {
			System.out.println("Both Strings are not identical");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exam2 exam2 = new Exam2();
		String s1 = "Pune";
		String s2 = "Pune";
		exam2.checkStringIdentical(s1, s2);
	}

}
