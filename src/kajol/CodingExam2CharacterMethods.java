/*Exam 2 : WAP for below given requirement. [30][45]
input : teCh@N12JCR#iT8s_B
output : letters -> 12
         uppercase -> 7
         lowercase -> 5
         digit -> 3
         special char -> 3   	*/	 


 package kajol;

import java.util.Scanner;

public class CodingExam2CharacterMethods {
	int digitcnt,lettercnt,specialcnt,lowercasecnt,uppercasecnt;
	void characterMethods(String inputString){
		
		for(int index=0;index<inputString.length();index++) {
			char ch=inputString.charAt(index);
			if(Character.isDigit(ch))
				digitcnt++;
			else if(Character.isLetter(ch)) {
				lettercnt++;
				if(Character.isLowerCase(ch))
					lowercasecnt++;
				else
					uppercasecnt++;
			}else
				specialcnt++;	
		}
		
		System.out.println("Digits Present in "+inputString+": "+digitcnt);
		System.out.println("Letters Present in "+inputString+": "+lettercnt+"   LowerCase Letters: "+lowercasecnt+"  UpperCase Letters: "+uppercasecnt);
		System.out.println("Special Characters Present in "+inputString+": "+specialcnt);
	}
	
	public static void main(String[] args) {
		CodingExam2CharacterMethods codingExam2CharacterMethods= new CodingExam2CharacterMethods();
		Scanner scanner= new Scanner(System.in);
		System.out.println("Please Enter a String:");
		codingExam2CharacterMethods.characterMethods(scanner.next());
		scanner.close();
		
		
	}

}
