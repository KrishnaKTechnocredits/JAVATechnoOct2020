package tejashree;

import java.util.Scanner;

public class Assignment20_Program4 {
	void swapString(String string1, String string2) {
		System.out.println("Before Swaping: " + string1 + " " + string2);
		string1 = string1 + string2;
		string2 = string1.substring(0, string1.length() - string2.length());
		string1 = string1.substring(string2.length());
		System.out.println("After Swaping : " + string1 + " " + string2);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter two String To Swap:");
		String string1 = scanner.next();
		String string2 = scanner.next();
		new Assignment20_Program4().swapString(string1, string2);

	}
}