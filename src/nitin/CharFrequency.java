package nitin;
// Assignment 14 - Find the frequency of character from a given String array.
import java.util.Scanner;
public class CharFrequency {
	
	void findFreq(String word,char ch) {
		int count=0;
		for(int index=0;index<word.length();index++) {
			if(word.charAt(index)==ch) {
				count++;
			}
		}
		System.out.println("Entered char is '"+ch+"'"+" occured "+count+" times in given word -> "+word);
	}
	public static void main(String[] args) {
		CharFrequency charFrequency= new CharFrequency();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Word: ");
		String word=sc.next();
		System.out.println("Enter Char: ");
		String temp =sc.next();
		int count=1;
		while(temp.length()!=1 && count<3) {
			System.out.println("Wrong input, Please enter a single character, Attempts Left : "+(3-count));
			temp=sc.next();
			count++;
		}
		if(temp.length()!=1) 
			System.out.println("Try after sometime.");
		else {
			char ch =temp.charAt(0);
			System.out.println("Character is "+ch);
			charFrequency.findFreq(word, ch);
		}
		sc.close();
	}
}
