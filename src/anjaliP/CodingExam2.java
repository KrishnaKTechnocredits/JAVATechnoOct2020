package anjaliP;
/*Exam 2 : WAP for below given requirement. [30][45]
input : teCh@N12JCR#iT8s_B
output : letters -> 12
         uppercase -> 7
         lowercase -> 5
         digit -> 3
         special char -> 3   		
branch name : <Yourname>_Coding_Exam_2
commit <Yourname>_Coding_Exam_2_Time
 */
public class CodingExam2 {
	String str = "teCh@N12JCR#iT8s_B";
	int letter = 0,uppercase = 0, lowercase = 0,digit = 0,specialChar = 0;
	void showDetails() {
		for (int index = 0; index<str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isLetter(ch)) {
				letter++;
				if (Character.isUpperCase(ch))
					uppercase++;
				else
					lowercase++;
			} else if (Character.isDigit(ch))
				digit++;
			else
				specialChar++;
		}
		System.out.println("Input value is : "+str);
		System.out.println("Letters -> " + letter + "\nUpperCase Characters -> " + uppercase + "\nLowercase Characters -> "
				+ lowercase + "\nDigits -> " + digit + "\nSpecial Characters -> " + specialChar);
	}
	public static void main(String args[]) {
		CodingExam2 exam2 = new CodingExam2();
		exam2.showDetails();	
	}
}

