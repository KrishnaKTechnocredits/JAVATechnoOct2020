package vaibhav;

import java.util.Scanner;

public class FindingFrequency {
	
	static void findingFrequency(String given,char findOut) {
		int count =0 ;
		for(int index = 0 ; index<given.length() ;index++ ) {
			if(given.charAt(index) == findOut )
				count++;
			else
				continue;
		}
		System.out.println("Character "+findOut+" is reoccuring in the string for "+count+" time");
		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String :");
		String givenString=scanner.next();
		System.out.println("Enter the Character which you need to find out :");
		String temp=scanner.next();
		while(temp.length() > 1) {
			System.out.println("Incorrect Value,Please input a single character");
			temp=scanner.next();
		}
		char findOut=temp.charAt(0);
		FindingFrequency.findingFrequency(givenString, findOut);
	}
}
