package prasad;

import java.util.Scanner;
/*Prints occurance of each char in string but prints the count for char only once even if it has occured multiple times in the string*/
public class Comparewithindex {
	
	void compare(String word) {
		for(int index=0;index<word.length();index++) {
			int count=0;
			char ch = word.charAt(index);
			int firstoccurance=word.indexOf(ch);
			if(index==firstoccurance) {
				for(int innerindex=0;innerindex<word.length();innerindex++) {
					char ch1 = word.charAt(innerindex);
					if(ch1==ch)
					count++;
			}
			System.out.println(ch+" -> "+ count);
			}
			else 
				continue;
		}
	}
	public static void main (String[]arg) {
		Scanner scanner = new Scanner(System.in);
		Comparewithindex comparewithindex = new Comparewithindex();
		System.out.println("Please enter a word:");
		String word = scanner.next();
		comparewithindex.compare(word);
	}
}
