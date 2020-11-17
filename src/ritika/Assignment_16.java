package ritika;

import java.util.Scanner;

public class Assignment_16 {
	
	void findFreq(String word) {
		
		for (int i=0; i<word.length(); i++) {
			char ch = word.charAt(i);
			int count = 0;
			for (int j=0; j<word.length(); j++) {
				if (word.charAt(j) == ch)
					count++;
			}
			System.out.println(ch + " is present " +count + " times");
		}
	}
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word:");
		String input = sc.next();
		
		Assignment_16 assignment16 = new Assignment_16();
		assignment16.findFreq(input);
		
	}
}
