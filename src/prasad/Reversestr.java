package prasad;

/*Accepts a string and prints reverse of given string*/
import java.util.Scanner;

public class Reversestr {	
	
	String reversestring(String word) {
		String reverseword = "";
		for(int index=word.length()-1;index>=0;index--) {
			char ch = word.charAt(index);
			reverseword = reverseword+ch;
		}
		return reverseword;
	}
	String inputstring() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter word(s)");
		String word = scanner.nextLine();
		return word;
	}
	
	public static void main(String[]arg) {
		Reversestr reversestr = new Reversestr();
		String word = reversestr.inputstring();
		String revword = reversestr.reversestring(word);
		System.out.println("Reverse of given word:- " + revword);
		
	}
}
