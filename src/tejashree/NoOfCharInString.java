package tejashree;
import java.util.Scanner;

class NoOfCharInString {

	void findFrequency(String word, char ch) {
		int cnt = 0;
		for (int index = 0; index < word.length(); index++) {
			if (word.charAt(index) == ch) {
				cnt++;
			}
		}
		System.out.println("char" + "'" + ch + "'" + "is repeated " + cnt + " times");
	}
	public static void main(String[] args) {
		NoOfCharInString noOfCharInString = new NoOfCharInString();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String userInput = sc.next();
		System.out.println("Enter character");
		char ch = sc.next().charAt(0);
		noOfCharInString.findFrequency(userInput, ch);
	}

}