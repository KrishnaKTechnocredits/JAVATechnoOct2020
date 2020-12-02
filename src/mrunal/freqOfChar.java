package mrunal;


/* Program 1  :  [ Compulsory ]
Find the frequency of character from a given String array. [Estimated time: 15-20 mins]
sample input array : { "technocredits","elephant","earthear"} and char is 'e'
output :technocredits -> 2
		elephant -> 2
		earth -> 1
		Total occurrence of e -> 5 */
import java.util.Scanner;
public class freqOfChar {
	void freqOfChar(String[] array,char ch) {	
		int totalcount=0;
		String word = array[0]; 
		for(int index=0;index<array.length;index++) {
			int count=0;
			for(int index1=0 ;index1 < word.length() ;index1++) {
				word = array[index];
				if(word.charAt(index1)==ch) {
					count++;
				    totalcount++;
			  }
		 }
			System.out.println("Count of " + ch + " in " + array[index] + " is --> " + count);
		}
		System.out.println("Total occurance of " + ch + " --> " + totalcount);
	}
	public static void main(String[]arr) {
		freqOfChar program1 = new freqOfChar();
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many words do you wish to enter: ");

		int count = scanner.nextInt();
		String[] words = new String[count];
		for (int index = 0; index < count; index++) {
			System.out.println("Please enter your word :");
			words[index] = scanner.next();
		}
		System.out.println("Please enter which char you want to search in above entered words : ");
		char chr = scanner.next().charAt(0);
		program1.freqOfChar(words, chr);
	}
}

