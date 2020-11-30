package sadhana;

//Assignment_16 Find occurrence of each character in string
import java.util.Scanner;

public class CharacterOccurenceInString {
	void findCharInString(String name) {
		int count = 0;
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			for (int inner = 0; inner < name.length(); inner++) {
				if (name.charAt(inner) == ch)
					count++;
			}
			System.out.println("Character " + ch + " ocuurance " + count + " times");
			count = 0;
		}
	}

	public static void main(String[] args) {
		CharacterOccurenceInString characterOccurenceInString = new CharacterOccurenceInString();
		System.out.println("Enter String");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		characterOccurenceInString.findCharInString(name);
	}

}
