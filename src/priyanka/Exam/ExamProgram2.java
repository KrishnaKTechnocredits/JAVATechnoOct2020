package priyanka.Exam;

/*Exam 2 : WAP for below given requirement. [30][45]
input : teCh@N12JCR#iT8s_B
output : letters -> 12
         uppercase -> 7
         lowercase -> 5
         digit -> 3
         special char -> 3  */ 		 


public class ExamProgram2 {
	
	int digitCount,letterCount, upperCaseCount, lowerCaseCount, specialCount;
	
	void findFequency( String str) {
		
		for(int index =0; index<str.length(); index++) {
			char ch = str.charAt(index);
		
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
		
		System.out.println("The String is: " +str);
		System.out.println("**************************************************");
		
		System.out.println("In the given string there are :- Digits - "+digitCount+ ", Letters- "+ letterCount+", lowercase letters - "+lowerCaseCount+", Uppercase letters - "+upperCaseCount+", Special charater - " + specialCount);	
	}
	
	public static void main(String [] a) {
		ExamProgram2 examProgram2 =new ExamProgram2();
		String str ="teCh@N12JCR#iT8s_B";
		examProgram2.findFequency(str);
			
	}

}
