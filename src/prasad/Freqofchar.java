package prasad;

import java.util.Scanner;
public class Freqofchar {
	int countchr(String str,char chr) {
		int counter= 0;
		for(int index=0;index<str.length();index++) {
			if(str.charAt(index)==chr)
			counter++;
		}	
		return counter ;
	}
	
	public static void main (String[]arg) {
		Scanner scanner = new Scanner(System.in);
		Freqofchar freqofchar = new Freqofchar();
		System.out.println("Please enter String: ");
		String str = scanner.next();
		System.out.println("Enter character to be searched in given string: ");
		String temp = scanner.next();
		char chr = temp.charAt(0);
		for(int index=2;index>0 && temp.length()>1;index--) {
			System.out.println("Please enter only on character,"+ index+ " attempts left");
			temp=scanner.next();
		}
		if(temp.length()>1) {
			System.out.println("Please try again later you have exhausted all your attempts.");
		}
		else if(temp.length()==1) {
			chr=temp.charAt(0);
		int counter =freqofchar.countchr(str,chr);
		    System.out.println("Number of times "+ chr + " occurs in "+ str + " is "+ counter + " time(s)");
		}
	}
}

