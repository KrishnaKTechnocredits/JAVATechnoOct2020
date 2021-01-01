package priyanka.Exam;

import java.util.Scanner;

/*Program 2: WAP to find two String are identical or not

input 1: 
String s1 = "technoCredits";
String s2 = "teChnoCreditS";

output 1: both string are not identical

input 2:
String s1 = "pune";
String s2 = "pune";

output 2: both string are identical
*/
public class ExamProgram4StringIdentical {

	void isIdentical(String str1, String str2) {

		boolean flag = true;
		if (str1.length() == str2.length()) {
			for (int index = 0; index < str1.length(); index++) {
				if (str1.charAt(index) != str2.charAt(index)) {
					flag = false;
				}
			}
			if (flag)
				System.out.println(" The arrays are : Identical");
			else
				System.out.println(" The arrays are :  Not Identical");
		} else
			System.out.println(" The arrays are : Not Identical");
	}

	public static void main(String[] arg) {
		ExamProgram4StringIdentical examProgram4StringIdentical = new ExamProgram4StringIdentical();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First String");
		String str1 = scanner.next();
		System.out.println("Enter second String");
		String str2 = scanner.next();
		examProgram4StringIdentical.isIdentical(str1, str2);

	}
}
