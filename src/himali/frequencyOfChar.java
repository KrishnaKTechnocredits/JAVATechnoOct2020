package himali;

import java.util.Scanner;

public class frequencyOfChar {
	
	int freqOfCharacter(String word,char ch) {
		
		int count=0;
		for(int i=0;i<word.length();i++) {
			if(word.charAt(i)==ch)
				count++;
		}
		System.out.println(count);
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		frequencyOfChar freq= new frequencyOfChar();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word: ");
		String word= sc.next();
		
		System.out.println("Enter the character: ");
		//String temp=sc.next();
		//char ch=temp.charAt(0);
		char ch=sc.next().charAt(0);
		int count=freq.freqOfCharacter(word,ch);
		System.out.println("The frequency of "+ch+ " is: "+count);
	}

}
