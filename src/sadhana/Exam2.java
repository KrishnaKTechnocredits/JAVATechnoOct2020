package sadhana;

/*Character :
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
-------------------------------------------------------
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
import java.util.Scanner;

class Exam2 {

	int upper = 0, lower = 0, number = 0, special = 0, letter = 0;

	void showDetails(String name) {

		for (int index = 0; index < name.length(); index++) {
			char character = name.charAt(index);
			if (Character.isLetter(character)) {
				letter++;
				if (Character.isUpperCase(character))
					upper++;
				else
					lower++;
			} else if (Character.isDigit(character))
				number++;
			else
				special++;
		}
		System.out.println("Letters: " + letter + "\nUpperCase Characters: " + upper + "\nLowercase Characters: "
				+ lower + "\nDigits: " + number + "\nSpecial Characters: " + special);
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter string:");
		new Exam2().showDetails(scanner.nextLine());
		scanner.close();

	}
}
