package monika;
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


public class ExamMethod {

	int digitCount,letterCount, upperCaseCount, lowerCaseCount, specialCount;

	void findFrequnecyOfChar( String str) {

		for(int i =0; i<str.length(); i++) {
			char ch = str.charAt(i);

			 if(Character.isLetter(ch)){
				letterCount++;		
				if(Character. isLowerCase(ch)) {
					lowerCaseCount++;
				}
				else
					upperCaseCount++;
			}	
			 else if(Character.isDigit(ch)) 
					digitCount++;
			 else
					specialCount++;
		}

		System.out.println("The String: " +str);
	
		System.out.println("string :- Digits of given input - "+digitCount+ ", Letters of given input- "+ letterCount+", lowercase letters of given input - "+lowerCaseCount+", Uppercase letters of given input - "+upperCaseCount+", Special charater of given input - " + specialCount);	
	}

	public static void main(String [] a) {
		ExamMethod  exammethod =new ExamMethod();
		String str ="teCh@N12JCR#iT8s_B";
		exammethod.findFrequnecyOfChar(str);

	}

}
