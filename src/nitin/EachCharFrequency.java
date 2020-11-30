package nitin;
//Assignment 16 - Find the frequency of each character from user given word.
import java.util.Scanner;
public class EachCharFrequency {
public	void findCharOccurance(String word) {
		int count =0;
		for(int i=0;i<word.length();i++) {
			char ch= word.charAt(i);
			for(int j=0;j<word.length();j++) {
				if(word.charAt(j)==ch)
					count++;
			}
			System.out.println("Character "+ch+" occurrence "+count+" times.");
			count=0;
		}
	}
	public static void main(String[] args) {
		EachCharFrequency eachCharFrequency = new EachCharFrequency();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word : ");
		String word=sc.next();
		eachCharFrequency.findCharOccurance(word);
		sc.close();
	}
}
