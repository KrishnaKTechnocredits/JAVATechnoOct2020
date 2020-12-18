package suvela.assign32;

import java.util.Scanner;

public class ASCIIPractice {
	void charToAscii(char ch) {
		int temp=ch;
		System.out.println("Ascii value is:"+temp);
	}
	void asciiToChar(int ascii) {
		char ch=(char) ascii;
		System.out.println("Character is:"+ch);
	}
	void asciiForUppercase() {
		for(char ch='A';ch<='Z';ch++) {
			int temp=ch;
			System.out.println("Ascii value for:" +ch+" is>"+temp);
		}
	}
	void asciiForLowercase() {
		for(char ch='a';ch<='z';ch++) {
			int temp=ch;
			System.out.println("Ascii value for:" +ch+" is>"+temp);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ASCIIPractice practice = new ASCIIPractice();
		System.out.println("Enter character:");
		String s=sc.next();
		char ch=s.charAt(0);
		practice.charToAscii(ch);
		System.out.println("------------------------------");
		System.out.println("Enter ascii value:");
		int temp=sc.nextInt();
		practice.asciiToChar(temp);
		practice.asciiForUppercase();
		System.out.println("------------------------------");
		practice.asciiForLowercase();
	
		
	}

}
