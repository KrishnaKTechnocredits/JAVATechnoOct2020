package priyanka.Assignment32;

import java.util.Scanner;

/*Program 1:  return true if UpperCase characters count are more than lowercase else return false.
input : TechnoCrediTS
output : false*/

public class CountUpperClassAndLowerClass {

	boolean countUpperClassandLowerClass(String str) {

		boolean flag = true;
		String temp = "";
		char ch1;
		int uCount = 0;
		int lCount = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int ascii = ch;
			if (ascii >= 65 && ascii < 90) {
				ch1 = (char) (ch + 32);
				temp += ch1;
				uCount++;
			}
			if (ascii >= 97 && ascii <= 122) {
				ch1 = (char) (ch - 32);
				temp += ch1;
				lCount++;
			}
		}
		if (uCount > lCount)
			return true;
		return false;
	}

	public static void main(String[] arg) {
		CountUpperClassAndLowerClass countUpperClassAndLowerClass = new CountUpperClassAndLowerClass();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = scanner.next();
		System.out.println(" The output is " + countUpperClassAndLowerClass.countUpperClassandLowerClass(str));
	}

}
