package dhara;

import java.util.Scanner;

public class CharFrequency {
	
	int getCharFrequency(String string, char ch) {
		int count = 0;
		for(int i=0;i<string.length();i++) {
			if(string.charAt(i)==ch) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		
		CharFrequency charFrequency=new CharFrequency();
		System.out.println("Enter the String : ");
		Scanner scanner=new Scanner(System.in);
		String string=scanner.next();
		System.out.println("Enter Charater from the String : ");
		String temp=scanner.next();
		while(temp.length()!=1) {
			System.out.println("Wrong character, Please enter correct character : ");
			temp=scanner.next();
			
		}
		char ch= temp.charAt(0);
		int charFreq=charFrequency.getCharFrequency(string, ch);
		System.out.println("Frequency of character "+"'"+ch+"'"+ "is : "+charFreq);
		scanner.close();
		
		
	}
}
