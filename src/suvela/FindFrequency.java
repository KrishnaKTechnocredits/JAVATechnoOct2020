package suvela;

import java.util.Scanner;

public class FindFrequency {
	static int count;
	static int frequency(String word,char ch) {
		for(int index=0;index<word.length();index++) {
			if(word.charAt(index)==ch) {
				count++;
			}
		}
		
		return count;
	}
	public static void main(String[] args) {
	Scanner sc	=new Scanner(System.in);
	System.out.println("Enter string:");
	String word = sc.next();
	System.out.println("Enter char:");
	String s = sc.next();
	while(s.length()>1) {
		System.out.println("Wrong input. Enter again");
		s = sc.next();
	}
	char ch = s.charAt(0);
	int count=frequency(word,ch);
	System.out.println("Count of "+ch+" is "+count );
	sc.close();
	}

}
