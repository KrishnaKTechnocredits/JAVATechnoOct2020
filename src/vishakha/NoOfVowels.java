/*Java Program to Count the Number of Vowels in user defined string.

Input : technocredits
output : vowels are e , o, i */

package vishakha;

import java.util.Scanner;

public class NoOfVowels {
	int count;
	
	void countNoOfVowels(String word){
		for(int index=0; index<word.length(); index++){
			char ch = word.charAt(index);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
				System.out.print(ch+ " ");
				count++;
			}
		}
		System.out.println("\nThere are total "+count+ " vowels");
	}

	public static void main(String[] args) {
		NoOfVowels noOfVowels = new NoOfVowels();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a word");
		String word = scanner.next();
		noOfVowels.countNoOfVowels(word);
	}
}
