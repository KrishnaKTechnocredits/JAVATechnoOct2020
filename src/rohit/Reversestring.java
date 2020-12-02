package rohit;

import java.util.Scanner;

public class Reversestring {

	void reversestring(String str) {
		System.out.print("Reverse of given string : ");
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
	}

	public static void main(String[] args) {
		Reversestring reversestring = new Reversestring();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String-  ");
		String str = sc.nextLine();
		reversestring.reversestring(str);
	}
}
