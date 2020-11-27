package himali.Assignment15;

import java.util.Scanner;

public class frequencyOfCharInArray {

	
		public void freqOfCharacter(String[] word, char ch) {
			int totalCount=0;
			for (int i = 0; i < word.length; i++) {
				String temp=word[i];
				int wordCount = 0;
				for(int j=0;j<temp.length();j++){
					if(temp.charAt(j)==ch){
						totalCount++;
						wordCount++;
					}
	           }
		    System.out.println(temp+" -> "+wordCount);
			}
			System.out.println(" Total occurrence of "+ch+ "-->"+totalCount);
			
			
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		frequencyOfCharInArray freq = new frequencyOfCharInArray();

		String words[] = new String[2];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the words: ");
		for (int i = 0; i < words.length; i++) {
			 words[i] = sc.next();
		}

		System.out.println("Enter the character: ");
		// String temp=sc.next();
		// char ch=temp.charAt(0);
		char ch = sc.next().charAt(0);
		 freq.freqOfCharacter(words,ch);
		
		
	}

}
