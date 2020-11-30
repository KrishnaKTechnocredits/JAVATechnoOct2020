package prasad.Stringandarray;

import java.util.Scanner;

/*Accepts string array and then prints occurance of each char in string and repeats this for all strings in array*/

public class Comparecharinstrary {
	void compare(String[]words) {
		for(int i=0;i<words.length;i++) {
				String word = words[i];
				System.out.println("");
				for(int j=0;j<word.length();j++) {
					char ch= word.charAt(j);
					int count=0;
					for(int k=0;k<word.length();k++) {
						char ch1=word.charAt(k);
						if(ch==ch1)
						count++;
				}
				System.out.println("Occurance of "+ ch +" is " + count+ " times");
			}
				
		}
	}
	
	public static void main(String []arg) {
		Scanner scanner = new Scanner(System.in);
		Comparecharinstrary comparecharinstrary = new Comparecharinstrary();
		System.out.println("How many words do you want to insert in the array for processing?");
		int count = scanner.nextInt();
		String []words = new String[count];
		for(int index=0;index<words.length;index++) {
			System.out.println("Please enter a word");
			String word=scanner.next();
			words[index]=word;
		}
		comparecharinstrary.compare(words);
		
		
	}

}
