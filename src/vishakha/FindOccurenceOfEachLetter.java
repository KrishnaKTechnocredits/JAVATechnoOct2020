package vishakha;

import java.util.Scanner;

public class FindOccurenceOfEachLetter {
	
	void findOccurence(String word){
		for (int i=0; i<word.length();i++){
			int count=0;
			for(int j=0; j<word.length(); j++){
				char ch = word.charAt(j);
				if(ch == word.charAt(i))
					count++;
			}
			System.out.println(word.charAt(i)+" -->" +count);
		}
	}

	
	public static void main(String[] args) {
		FindOccurenceOfEachLetter  eachLetter = new FindOccurenceOfEachLetter();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a word");
		String word = scanner.next();
		eachLetter.findOccurence(word);
	}
}
