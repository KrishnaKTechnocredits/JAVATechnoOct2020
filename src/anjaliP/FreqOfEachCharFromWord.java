package anjaliP;
import java.util.Scanner;
/*
Assignment 16 : 12th nov'2020
Find the frequency of each character from user given word.
 */
public class FreqOfEachCharFromWord {
	
	void freqChar(String word) {
		for(int index=0; index<word.length(); index++) 
		{
		 char ch = word.charAt(index);
		 int count=0;
			for(int index1=0; index1<word.length();index1++) 
			{
				if(word.charAt(index1) == ch) 
					count++;
			}
			System.out.println("character "+ch+" is "+count);
		}
	}
	@SuppressWarnings("resource")
	public static void main(String[] args) {	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter the word:");
		String name = scanner.next();
		FreqOfEachCharFromWord eachCharCount = new FreqOfEachCharFromWord();
		eachCharCount.freqChar(name);
	}
}

