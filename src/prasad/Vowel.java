package prasad;

import java.util.Scanner;

/*Program 5 :Counts vowels in given string*/

public class Vowel {
	void vowelcheck(String word) {
		int aCount=0;
		int eCount=0;
		int iCount=0;
		int oCount=0;
		int uCount=0;
		
		for(int index=0;index<word.length();index++) {
			switch (word.charAt(index)) {
			case 'a':
			case 'A':
				aCount++;
				break;
			case 'e':
			case 'E':
				eCount++;
				break;
			case 'i':
			case 'I':
				iCount++;
				break;
			case 'o':
			case 'O':
				oCount++;
				break;
			case 'u':
			case 'U':
				uCount++;
				break;
			default:
				break;
			}
				
		}
		if(aCount!=0 || eCount!=0 || iCount!=0 || oCount!=0 || uCount!=0)
			System.out.println("A count: "+ aCount + "; E count: " + eCount + "; I count: " + iCount + "; O count: " + oCount + "; U count: " + uCount);
		else 
			System.out.println("No vowels present in the given string.");
	}
	
	public static void main (String[]arg) {
		Vowel vowel = new Vowel();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter string:");
		String word=scanner.next();
		System.out.println("Occurance of vowels in " + word);
		vowel.vowelcheck(word);
	}

}
