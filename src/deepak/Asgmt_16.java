package deepak;

import java.util.Scanner;

public class Asgmt_16 {

	void compare(String word) {
		for(int index=0;index<word.length();index++) {
			char ch = word.charAt(index);
			int count=0;
			for(int index1=0;index1<word.length();index1++) {
					char ch1 = word.charAt(index1);
					if(ch==ch1)
						count++;		
			}
			System.out.println("Occurance of "+ ch +" : "+ count + " times");
		}
	}

	public static void main(String[]arg) {
		Scanner scanner = new Scanner(System.in);
		Asgmt_16 comparechar = new Asgmt_16();
		System.out.println("Pleae enter a string:");
		String word = scanner.next();
		comparechar.compare(word);
	}

}