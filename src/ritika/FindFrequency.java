package ritika;

import java.util.Scanner;

public class FindFrequency {
	
	void findFreq(String name, char ch) {
		int count = 0;
		for (int i=0; i<name.length(); i++) {
			if (name.charAt(i)==ch)
				count++;
		}
		System.out.println("Character " +ch + " is repeated " +count + " times");
	}

	public static void main(String[] args) {
		
		FindFrequency findFrequency = new FindFrequency();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String word = sc.next();
		System.out.println("Enter the character you want to find frequency of: ");
		char ch = sc.next().charAt(0);
		findFrequency.findFreq(word,ch);
	}
}
