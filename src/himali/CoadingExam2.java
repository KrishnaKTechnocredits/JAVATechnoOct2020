package himali;
import java.util.Scanner;

public class CoadingExam2 {
	
	void validateString(String word) {
		int countLetter=0;
		int countUpper=0;
		int countLower=0;
		int countDigit=0;
		int countSpecial=0;
		 
		for(int i=0;i<word.length();i++) {
			char ch=word.charAt(i);
			if(Character.isLetter(ch)) {
				countLetter++;
			}
			else if(Character.isUpperCase(ch))
			{
				countUpper++;
			}
			else if(Character.isDigit(ch)) {
				countDigit++;
			}
			else 
			{
				countSpecial++;
			}
			if(Character.isUpperCase(ch)) {
				countUpper++;
			}
			if(Character.isLowerCase(ch)) {
				countLower++;
			}
				
		}
		System.out.println("Letters---> "+countLetter);
		System.out.println("Digits---> "+countDigit);
		System.out.println("Upper case---> "+countUpper);
		System.out.println("Lower case---> "+countLower);
		System.out.println("Special char---> "+countSpecial);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CoadingExam2 exam2=new CoadingExam2();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string : ");
		String word=sc.next();
		exam2.validateString(word);
	}

}
