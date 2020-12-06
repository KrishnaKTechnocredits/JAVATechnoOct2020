package priyanka.Assignment26;

import java.util.Scanner;

/*Assignment - 26: 23rd Nov'2020  
convert all capital letters to small and small to capital.

String msg = "tE1GfrEsT";
output : Te1gFReSt

Hint : isUpperCase(), isLowerCase(), toUpperCase(), toLowerCase()
*/
public class ConvertLetters {

	void convertLetter(String str) {
		String temp = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isUpperCase(ch))
				temp = temp + Character.toLowerCase(ch);
			if (Character.isLowerCase(ch))
				temp = temp + Character.toUpperCase(ch);
			if (Character.isDigit(ch))
				temp = temp + ch;
		}
		System.out.println("The converted String is : " + temp);
	}

	public static void main(String[] arg) {
		ConvertLetters convertLetters = new ConvertLetters();
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Enter the string to convert ");
		String str = scanner.next();
		convertLetters.convertLetter(str);
	}
}
