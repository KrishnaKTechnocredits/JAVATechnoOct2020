package vaibhav;

import java.util.Scanner;

public class FindingVowels {
		
	static void findVowel(String str) {
			int count=0;
			char[] vowel=new char[20000];	
			for (int index=0 ; index < str.length();index ++ ) {
				char temp=str.charAt(index);
				switch(temp) {				
					case 'a':
					case 'A':
						vowel[count]='a';
						count++;
						break;
					case 'e':
					case 'E':
						vowel[count]='e';
						count++;
						break;
					case 'i':
					case 'I':
						vowel[count]='i';
						count++;
						break;
					case 'o':
					case 'O':
						vowel[count]='o';
						count++;
						break;
					case 'u':
					case 'U':
						vowel[count]='a';
						count++;
						break;
			}				
		}
			if(count == 0)
				System.out.println("no vowels are present");
			else {
					System.out.println("below vowels are present in your string");
					for (int i =0;i<vowel.length;i++)
					System.out.println(vowel[i]);				
				}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Please input a string :");
		String givenString = scanner.next();
		FindingVowels.findVowel(givenString);
	
	}
}
