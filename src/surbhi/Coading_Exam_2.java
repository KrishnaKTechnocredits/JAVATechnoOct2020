package surbhi;

public class Coading_Exam_2 {

	void totalNoOfLetter(String str) {

		int count = 0;
		System.out.println("String: " + str);
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLetter(str.charAt(i)))
				count++;
		}
		System.out.println("Letters: " + count);
	}

	void upperCase(String str1) {
		
		int upperCase = 0;
		char[] ch = str1.toCharArray();
		for (char chh : ch) {
			if (chh >= 'A' && chh <= 'Z')
				upperCase++;
		}
		System.out.println("Count of Uppercase letters are " + upperCase);
	}

	void lowercase(String str) {

		int lowerCase = 0;
		char[] ch = str.toCharArray();
		for (char chh : ch) {
			if (chh >= 'a' && chh <= 'z')
				lowerCase++;
		}
		System.out.println("Count of Lowercase letters are " + lowerCase);
	}

	void digitAndSpecialChar(String str) {
		// ch = str.toCharArray();
		int spl = 0;
		int digi = 0;
		int alph=0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' ) {
				alph++;
			}
			else if (ch >= '0' && ch <= '9') {
				digi++;
			} else {
				spl++;
			}
		}
		System.out.println("Spl: " + spl);
		System.out.println("number: " + digi);

	}

	public static void main(String args[]) {

		Coading_Exam_2 coadingexam2 = new Coading_Exam_2();
		coadingexam2.totalNoOfLetter("teCh@N12JCR#iT8s_B");
		coadingexam2.upperCase("teCh@N12JCR#iT8s_B");
		coadingexam2.lowercase("teCh@N12JCR#iT8s_B");
		coadingexam2.digitAndSpecialChar("teCh@N12JCR#iT8s_B");

	}
}
