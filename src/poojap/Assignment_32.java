/*Program 1:  return true if UpperCase characters count are more than lowercase else return false.
input : TechnoCrediTS
output : false*/

package poojap;

import java.util.Scanner;

public class Assignment_32 {
	boolean upperCaseCount(String string) {
		int upperCount = 0, lowerCount = 0;
		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			if (Character.isUpperCase(ch))
				upperCount++;
			else
				lowerCount++;
		}
		if (upperCount > lowerCount)
			return true;
		return false;
	}

	public static void main(String[] args) {
		Assignment_32 assignment_32 = new Assignment_32();
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Enter The String");
		String string = scanner.next();
		boolean b = assignment_32.upperCaseCount(string);
		System.out.println("Uppercase Character are more than LowerCase: " + b);
		Scanner scanner2 = new Scanner(System.in);
		System.out.println(" Enter The String");
		String string2 = scanner2.next();
		boolean b1 = assignment_32.upperCaseCount(string2);
		System.out.println("Uppercase Character are more than LowerCase: " + b1);
	}
}
