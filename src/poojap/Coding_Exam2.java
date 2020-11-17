/*Exam 2 : WAP for below given requirement. [30][45]
input : teCh@N12JCR#iT8s_B
output : letters -> 12
         uppercase -> 7
         lowercase -> 5
         digit -> 3
         special char -> 3 */

package poojap;

public class Coding_Exam2 {

	public static void main(String[] args) {
		String str = "teCh@N12JCR#iT8s_B";
		int digit = 0, letter = 0, lower = 0, upper = 0, specialchar = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isLetter(ch)) {
				letter++;
				if (Character.isUpperCase(ch))
					upper++;
				else
					lower++;
			} else if (Character.isDigit(ch))
				digit++;
			else
				specialchar++;
		}
		System.out.println("Letters In The String  " + letter);
		System.out.println("Digits In The String " + digit);
		System.out.println("LowerCase Letters In The String " + lower);
		System.out.println("UpperCase Letters In The String " + upper);
		System.out.println("Specialchar In The String " + specialchar);

	}
}
