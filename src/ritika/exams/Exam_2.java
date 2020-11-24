package ritika.exams;
/* Exam 2 : WAP for below given requirement. [30][45]
input : teCh@N12JCR#iT8s_B
output : letters -> 12
uppercase -> 7
lowercase -> 5
digit -> 3
special char -> 3
*/
public class Exam_2 {

	String input = "teCh@N12JCR#iT8s_B";
	int cntLetters;
	int cntUppercase;
	int cntLowerCase;
	int cntDigit;
	int cntSpecialChars;
	
	
	void display() {
		char ch;
		for (int i=0; i<input.length(); i++) {
			ch = input.charAt(i);
			if (Character.isLetter(ch) == true) {
				cntLetters++;
				if (Character.isUpperCase(ch)==true)
					cntUppercase++;
				else if (Character.isLowerCase(ch)==true)
					cntLowerCase++;
			}
			else if (Character.isDigit(ch)==true)
				cntDigit++;
			else
				cntSpecialChars++;
		}
	}

	public static void main(String[] args) {
		Exam_2 exam2 = new Exam_2();
		exam2.display();
		System.out.println("Letters count is "+ exam2.cntLetters);
		System.out.println("Uppercase count is " + exam2.cntUppercase);
		System.out.println("Lowercase count is " + exam2.cntLowerCase);
		System.out.println("Digit count is " + exam2.cntDigit);
		System.out.println("Special characters count is " + exam2.cntSpecialChars);
	}

}
