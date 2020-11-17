/*Find the frequency of character from a given String array. [Estimated time: 15-20 mins]
sample input array : { "technocredits","elephant","earthear"} and char is 'e'*/
package anjaliS;

import java.util.Scanner;

public class CharactersCount {

	void charCount(String arr[], char ch) {
		int count = 0;
		String str = arr[0];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < str.length(); j++) {
				str = arr[i];
				if (str.charAt(j) == ch) {
					count++;
				}
			}

		}
		System.out.println("Character" + "-> " + ch + " " + "total count " + count);
	}

	public static void main(String[] args) {
		CharactersCount characterscount = new CharactersCount();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of an array");
		int len = sc.nextInt();
		String arr[] = new String[len];
		String str = arr[0];
		System.out.println("Enter elements in array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();
		}
		System.out.println("Enter character count needed");
		char ch = sc.next().charAt(0);
		characterscount.charCount(arr, ch);

	}
}
