package himali.Assignment15;

import java.util.Scanner;

public class CheckVowels {
	
	void findVowels(String word) {
		System.out.println("Vowels are --> ");
		for(int i=0;i<word.length();i++) {
			char ch=word.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i'|| ch=='o' ||ch=='u'
			|| ch=='A' || ch=='E' || ch=='I'|| ch=='O' ||ch=='U') {
				System.out.println(ch);
			}
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckVowels vowels=new CheckVowels();
		Scanner sc=new Scanner(System.in);
		String word=sc.next();
		vowels.findVowels(word);
		
	}

}
