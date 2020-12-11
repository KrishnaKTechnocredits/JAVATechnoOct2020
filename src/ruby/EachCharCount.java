package ruby;
import java.util.Scanner;
/*Assignment 16 : 12th nov'2020 
Find the frequency of each character from user given word.*/

public class EachCharCount {
	
	void freqChar(String name) {
		for(int j=0;j<name.length();j++) {
		 char eChar=name.charAt(j);
		 int charCnt=0;
			for(int index=0; index<name.length();index++) {
				if(name.charAt(index) == eChar) 
					charCnt++;
			}
			System.out.println("character "+eChar+" is "+charCnt);
		}
	}

	public static void main(String[] args) {	
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the word:");
		String name = scanner.next();
		EachCharCount eachCharCount = new EachCharCount();
		eachCharCount.freqChar(name);
	}
}
