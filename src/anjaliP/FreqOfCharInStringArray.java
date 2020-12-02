package anjaliP;
/*Assignment 14 : 10th Oct 2020 
Find the frequency of character from a given String array.
Note: Take String and character from the user.*/
import java.util.Scanner;

public class FreqOfCharInStringArray {
	static int findFreqOfChar(String string, char charactor) {
		int count=0;
		for(int index=0; index<string.length();index++) {
			if(string.charAt(index)==charactor)
				count++;
		}
		return count;
	}
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String Value : ");
		String string=scanner.next();
		System.out.println("Enter single character where only 1st char will be taken :");
		//FreqOfCharInStringArray freqOfCharInStringArray = new FreqOfCharInStringArray();
		System.out.println("Occurance of character in string: "+FreqOfCharInStringArray.findFreqOfChar(string, scanner.next().charAt(0)));
	}
}
