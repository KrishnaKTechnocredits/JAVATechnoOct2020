package rohan;

/*
Exam 2 : WAP for below given requirement. [30][45]
input : teCh@N12JCR#iT8s_B
output : letters -> 12
         uppercase -> 7
         lowercase -> 5
         digit -> 3
         special char -> 3   		 

branch name : <Yourname>_Coding_Exam_2
commit <Yourname>_Coding_Exam_2_Time

*/
public class Exam2 {
	int letterCnt,upperCnt,lowerCnt,digitCnt,specialCnt=0;
	
	void diagnizeString(String str) {
		System.out.println("Input string: "+str);
		for(int i=0;i<str.length();i++) {
			if(Character.isUpperCase(str.charAt(i)))
				upperCnt++;
			if(Character.isLowerCase(str.charAt(i)))
				lowerCnt++;
			if(Character.isLetter(str.charAt(i)))
				letterCnt++;
			else if(Character.isDigit(str.charAt(i)))
				digitCnt++;
			else
				specialCnt++;
		}
		System.out.println("Total letters: "+letterCnt);
		System.out.println("Total Upper case letters: "+upperCnt);
		System.out.println("Total Lower Case letters: "+lowerCnt);
		System.out.println("Total Digits: "+digitCnt);
		System.out.println("Total special characters: "+specialCnt);
	}
	public static void main(String[] args) {
		Exam2 exam2 = new Exam2();
		String str = "teCh@N12JCR#iT8s_B";
		exam2.diagnizeString(str);
	}
}
