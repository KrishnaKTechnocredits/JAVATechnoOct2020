package ruby;
/*Exam 2 : WAP for below given requirement. [30][45]
input : teCh@N12JCR#iT8s_B
output : letters -> 12
         uppercase -> 7
         lowercase -> 5
         digit -> 3
         special char -> 3   */

public class Exam2 {
	
	void checkCharType(String word) {
		int letterCnt=0,upperCaseCnt=0, lowerCaseCnt=0,digitCnt=0,specialCnt=0;
		for(int index=0;index<word.length();index++) {
			char ch= word.charAt(index);
			if (Character.isLetter(ch)) {
				letterCnt++;
				if(Character.isUpperCase(ch)) 
					upperCaseCnt++;
				else 
					lowerCaseCnt++;
			}else if(Character.isDigit(ch)) {
				digitCnt++;
			}else
				specialCnt++;
		}
		System.out.println("Letters: "+letterCnt);
		System.out.println("Number of Upper Case character: "+upperCaseCnt);
		System.out.println("Number of Lower Case character: "+lowerCaseCnt);
		System.out.println("Number of digits: "+digitCnt);
		System.out.println("Number of Special characters: "+specialCnt);
	}

	public static void main(String[] args) {
		Exam2 exam2 = new Exam2();
		String word = "teCh@N12JCR#iT8s_B";
		exam2.checkCharType(word);
	}

}
