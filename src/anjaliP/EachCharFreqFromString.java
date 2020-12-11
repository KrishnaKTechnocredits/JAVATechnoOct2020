package anjaliP;
/*
Same as Assignment 16 but each frequency should be printed single time.
input : aakanksha
output : a -> 4
              k -> 2
              n -> 1
              s -> 1
              h -> 1
 */
import java.util.Scanner;

public class EachCharFreqFromString {

	void freqChar(String word) {
		for(int index=0; index<word.length(); index++) 
		{
		 char ch = word.charAt(index);
		 int count=0;
			for(int index1=0; index1<word.length();index1++) 
			{
				//if(word.charAt(index1) == ch) 
				//	count++;
				if(word.charAt(index1)==ch && index==word.indexOf(ch))
					count++;
			}
			if(count>0)
			System.out.println("char "+ch+" prints -> "+count+" times.");
		}
	}
	@SuppressWarnings("resource")
	public static void main(String[] args) {	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter the word:");
		String name = scanner.next();
		EachCharFreqFromString eachCharCount = new EachCharFreqFromString();
		eachCharCount.freqChar(name);
	}
}
