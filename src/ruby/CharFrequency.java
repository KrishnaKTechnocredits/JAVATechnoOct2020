package ruby;
/*Assignment 14 : 10th Nov 2020 
 * Find the frequency of character from a given String array.
Note: Take String and character from the user.*/

import java.util.Scanner;
public class CharFrequency {
	
	void frequencyChar(String name, char ch) {
		int charCnt=0;
		for(int index=0; index<name.length();index++) {
			if(name.charAt(index) == ch) 
				charCnt++;
		}
		System.out.println("character "+ch+" in word "+name+" is "+charCnt);
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word:");
		String name = sc.next();
		System.out.println("Enter the Charater:");
		char ch = sc.next().charAt(0);
		CharFrequency cnt = new CharFrequency();
		cnt.frequencyChar(name, ch);
	}
}
