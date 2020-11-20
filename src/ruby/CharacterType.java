package ruby;
/* BOTH THE PROGRAMS ARE IN SINGLE CLASS
 * Assignment-18 : 14th Nov'2020 
Program : 1
max repeating word with its freq.
input : Hi Hello Hi Techno Hello Hi
output : Hi -> 3

Program : 2 
String input = "hmPZ23i9Ws"
output = "239PZWhmis";*/

public class CharacterType {
//max repeating word with its freq.
	void wordFreq(String input) {
		String[] arr = input.split(" ");
		int num = 0;
		for (int i = 0; i < arr.length; i++) {
			String word = arr[i];
			int cnt = 0;
			if (input.contains(word)) {
				for (int j = 0; j < arr.length; j++) {
					if (word.equals(arr[j])) {
						cnt++;
					}
				}
				input = input.replace(word, "");
				if (num < cnt) {
					num = cnt;
					System.out.println(word + "->" + cnt);
				}
			}
		}
	}
//Print Digit UpperCase LowerCase
	void verifyCharacter(String word) {
		for (int index = 0; index < word.length(); index++) {
			if (Character.isDigit(word.charAt(index)))
				System.out.print(word.charAt(index));
		}
		for (int index = 0; index < word.length(); index++) {
			if (Character.isLetter(word.charAt(index))) {
				if (Character.isUpperCase(word.charAt(index)))
					System.out.print(word.charAt(index));
			}
		}
		for (int index = 0; index < word.length(); index++) {
			if (Character.isLetter(word.charAt(index))) {
				if (Character.isLowerCase(word.charAt(index)))
					System.out.print(word.charAt(index));
			}
		}
	}

	public static void main(String[] args) {
		CharacterType charType = new CharacterType();
		charType.verifyCharacter("hmPZ23i9Ws");
		String input = "Hi Hello Hi Techno Hello Hi ";
		System.out.println();
		charType.wordFreq(input);
	}
}
