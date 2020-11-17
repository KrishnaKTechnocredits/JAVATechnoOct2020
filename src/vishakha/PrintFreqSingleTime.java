/*Same as Assignment 16 but each frequency should be printed single time.
input : aakanksha
output : a -> 4
              k -> 2
              n -> 1
              s -> 1
              h -> 1*/

package vishakha;

import java.util.Scanner;

public class PrintFreqSingleTime {

	void findOccurence(String word){
		for (int i=0; i<word.length();i++){
			int count=0;
			char ch = word.charAt(i);
			if(i == word.indexOf(ch)){
				for(int j=0; j<word.length(); j++){	
					if(ch == word.charAt(j)){
						count++;
					}
				}
				System.out.println(word.charAt(i)+" -->" +count);
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a word");
		String word = scanner.next();
		new PrintFreqSingleTime().findOccurence(word);
	}
}
