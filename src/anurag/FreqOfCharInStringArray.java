package anurag;

import java.util.Scanner;

public class FreqOfCharInStringArray {

	static	int freqOfChar(String name, char ch) {
		
		int cnt = 0;
		for (int i =0; i <name.length(); i++) {
			if (name.charAt(i)==ch)
				cnt++;
		}
		return cnt;
	}
	
	
	public static void main(String[] args) {
		
		String ar[] = new String[3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 String values");
		
		for(int i=0; i<3; i++) {
		ar[i] = sc.next();
		}
		 
		System.out.println("Enter a character: Only first character will be considered");
		char ch = sc.next().charAt(0);
		System.out.println(ch);	
		
		for(int i=0; i<3; i++) {
		int freq = freqOfChar(ar[i], ch);
		System.out.println("Frequency of "+ch+ " in name " + ar[i] + " is: " + freq);
		}
		
	}	
	
}
