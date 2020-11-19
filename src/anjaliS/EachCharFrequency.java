package anjaliS;

import java.util.Scanner;

public class EachCharFrequency {
	void wordCharFreq(String word) {
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			int index = word.indexOf(word.charAt(i));
			if (i == index) {
				int cnt = 0;
				for (int j = 0; j < word.length(); j++) {
					if (word.charAt(i) == word.charAt(j))
						cnt++;
				}
				System.out.println("Character " + ch + " count is " + cnt);
			}
		}
	}

	public static void main(String args[]) {
		EachCharFrequency eachcharfrequency = new EachCharFrequency();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter word");
		String word = sc.nextLine();
		eachcharfrequency.wordCharFreq(word);

	}
}
