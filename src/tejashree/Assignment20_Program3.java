package tejashree;

import java.util.Scanner;

public class Assignment20_Program3 {

	void swapString(String string1, String string2) {
		System.out.println("Before Swaping String1 : " + string1 + " String2: " + string2);
		String temp = string1;
		string1 = string2;
		string2 = temp;
		System.out.println("After Swaping String1 : " + string1 + " String2:" + string2);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter two String To Swap:");
		String string1 = scanner.next();
		String string2 = scanner.next();
		new Assignment20_Program3().swapString(string1, string2);

	}
}
