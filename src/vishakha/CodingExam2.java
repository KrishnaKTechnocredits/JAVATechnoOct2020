/*Exam 2 : WAP for below given requirement. [30][45]
input : teCh@N12JCR#iT8s_B
output : letters -> 12
         uppercase -> 7
         lowercase -> 5
         digit -> 3
         special char -> 3   		 

branch name : <Yourname>_Coding_Exam_2
commit <Yourname>_Coding_Exam_2_Time
Character :
1) boolean isDigit(char ch)
	Character.isDigit('z'); false
	Character.isDigit('_'); false

2) boolean isLetter(char ch)
   Character.isLetter('p'); true
   Character.isLetter('_'); false

3) boolean isUpperCase(char ch)
   Character.isUpperCase('z'); false
   
4) boolean isLowerCase(char ch)
   Character.isLowerCase('A'); false  
*/

package vishakha;

import java.util.Scanner;

public class CodingExam2 {
	int digitCount;
	int letterCount;
	int lowerCount;
	int upperCount;
	int specialCharCount;
	
	void findCharType(String word){
		for(int index=0; index<word.length(); index++){
			char ch = word.charAt(index);
			if(Character.isDigit(ch)){
				digitCount++;
			}else if(Character.isLetter(ch)){
				letterCount++;
				if(Character.isLowerCase(ch))
					lowerCount++;
				else
					upperCount++;
			}else
				specialCharCount++;
				
		}
		System.out.println("There are "+digitCount+ " digits in the word "+word);
		System.out.println("There are "+letterCount+ " letters in the word "+word);
		System.out.println("There are "+lowerCount+ " lower case letters in the word "+word);
		System.out.println("There are "+upperCount+ " upper case letters in the word "+word);
		System.out.println("There are "+specialCharCount+ " special characters in the word "+word);
	}

	public static void main(String[] args) {
		CodingExam2 codingExam2 = new CodingExam2();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter word");
		String input = scanner.next();
		codingExam2.findCharType(input);
	}
}
