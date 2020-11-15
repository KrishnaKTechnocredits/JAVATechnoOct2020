package technoCredits.scannerDemo;

import java.util.Scanner;

public class ScannerChar {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter word");
		String word = scanner.next();
		System.out.println(word);
		
		System.out.println("Enter char : ");
		String temp = scanner.next(); // ab 
		int count=1;
		while(temp.length() != 1 && count<3) {
			System.out.println("Wrong input, please retry. Only enter single char :");
			System.out.println("Attempt left " + (3-count));
			temp = scanner.next();
			count++;
		}
		if(temp.length() != 1)
			System.out.println("Try sometime later");
		else {
			char ch = temp.charAt(0);
			System.out.println("CHar is " + ch);
		}
	}
}
