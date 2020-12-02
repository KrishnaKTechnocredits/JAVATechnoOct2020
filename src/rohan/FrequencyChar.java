package rohan;

import java.util.Scanner;

public class FrequencyChar {

	int frequencyOfChar(String s, char ch) {
		int cnt=0;
		ch= Character.toUpperCase(ch);
		System.out.println(ch);
		for(int i=0; i<s.length();i++) {
			if(Character.toUpperCase(s.charAt(i)) == ch)
				cnt++;
		}
	return cnt;
	}
	
	public static void main(String[] args) {
		FrequencyChar frequencyChar = new FrequencyChar();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.next();
		System.out.println("Enter Character to identify its frequency: ");
		String ch = sc.next();
		int cnt=0;
		while(ch.length()>1 && cnt < 3) {
			System.out.println("Incorrect input. Please enter only a character: ");
			cnt++;
			System.out.println("Attempts left: "+(4-cnt));
			ch = sc.next();
		}
		if(ch.length()>1)
			System.out.println("Execution Terminated. Please try later");
		else {
			int charOccurence = frequencyChar.frequencyOfChar(s,ch.charAt(0));
			System.out.println("String is "+s+" has "+charOccurence+" occurences of character "+ch.charAt(0));
		}
	}
}
